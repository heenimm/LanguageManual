package com.example.languagemanualitschoolsamsung.topic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.languagemanualitschoolsamsung.R;
import com.example.languagemanualitschoolsamsung.models.PracticalTopic;
import com.google.android.material.button.MaterialButton;

public class PracticalTopicFragment extends Fragment {

    private PracticalTopic practicalTopic;

    private RadioGroup questionsRadioGroup;
    private MaterialButton checkButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        practicalTopic = (PracticalTopic) getArguments().getSerializable("topic");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_practical_topic, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        questionsRadioGroup = view.findViewById(R.id.questions_practical_topic);
        for (int i = 0; i < practicalTopic.getQuestions().size(); i++) {
            String question = practicalTopic.getQuestions().get(i);
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setText(question);
            questionsRadioGroup.addView(radioButton);
        }

        checkButton = view.findViewById(R.id.check_button);
    }
}