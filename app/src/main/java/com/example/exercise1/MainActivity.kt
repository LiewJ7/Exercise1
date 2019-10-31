package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {

            val car_price=editTextCarPrice.text.toString().toInt()
            if(car_price==0){

            }
            val down_payment=editTextDownPayment.text.toString().toInt()
            val loan_period=editTextLoanPeriod.text.toString().toInt()
            val interest_rate=editTextInterestRate.text.toString().toFloat()

            //TODO:continue ur calculation here
            val loan=car_price-down_payment
            textViewLoan.text= getString(R.string.loan) + "${loan}"

            val interest= loan*interest_rate*loan_period
            textViewInterest.text=getString(R.string.interest) + "${interest}"

            val monthly_payment= (loan+interest)/loan_period/12
            textViewMonthlyPayment.text=getString(R.string.monthly_payment) + "${monthly_payment}"

        }
    }


    fun resetInputs(view: View) {
        //TODO: reset all inputs and outputs
        editTextCarPrice.setText("")
        editTextDownPayment.setText("")
        editTextInterestRate.setText("")
        editTextLoanPeriod.setText("")
        textViewInterest.setText("")
        textViewLoan.setText("")
        textViewMonthlyPayment.setText("")
    }
}
