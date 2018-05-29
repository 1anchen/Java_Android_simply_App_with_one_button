package com.example.vivien.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class WordCounterActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answerText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        questionEditText = findViewById(R.id.question_view);
        answerText = findViewById(R.id.answer_view);
        countButton = findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button){

        WordCounter wordCounter = new WordCounter();
        wordCounter.setWord(questionEditText.getText().toString());
        wordCounter.saveWordAndNumber();
        String answer = wordCounter.displayAnswer();
        answerText.setText(answer);
    }
}
