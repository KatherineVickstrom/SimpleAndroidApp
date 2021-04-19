package com.module7.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class CourseActivity extends AppCompatActivity {

    TextView title, description;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_activity);

        title = findViewById(R.id.titleText);
        description = findViewById(R.id.descriptionText);
        position = getIntent().getIntExtra("position", -1);

        if (position == 0) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("Helps students identify and articulate personal, professional, and social goals. Provides an integrated overview of the computer science and communication design majors and their requirements. Students develop a plan for their learning goals. Students learn writing, presentation, research and critical-thinking skills within the diversified fields of information technology and communication design. Students learn how to analyze, predict, and articulate trends in the academic, public service,");
        }

        if (position == 1) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("Provides students with the fundamental concepts to develop large-scale software, focusing on the object-oriented programming techniques. Coverage includes the introduction to Java programming language, object-oriented programming, software life cycle and development processes, requirements analysis, and graphical user interface development.");

        }

        if (position == 2) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("Prepares students for large-scale software development using software engineering principles and techniques. Coverage includes software process, requirements analysis and specification, software design, implementation, testing, and project management. Students are expected to work in teams to carry out a realistic software project.");
        }

        if (position == 3) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("Students in this course will learn about the use and design of modern operating systems, focusing on Linux. On the “use” side, students will learn the Linux command line, to write shell scripts, and to build programs with GNU utilities like awk, sed, and make. On the “design” side, students will develop a deep understanding of process management, memory management, file systems, and concurrency, and how they apply to modern technologies like virtualization and cloud computing.");
        }

        if (position == 4) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("Provides students with dynamic web application development skills, focusing on the integration of server-side programming, database connectivity, and client-side scripting. Coverage includes the Internet architecture, responsive design, RESTful web services, and Web APIs.");
        }
        if (position == 5) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("Provides students with key knowledge of race, gender, class and social justice especially in relation to technology in today’s digital world. Students challenge the barriers of expertise, gender, race, class, and location that restrict wider access to and understanding of the production and usage of new technologies. Students will engage in a practical experience in the community via their service placements, which will provide depth and context for considering questions of justice, equality, social responsibilities and the complexities of technology and its societal impact. The course uses scenario based approach combining presentations, discussions, and reflections to allow students explore the relationship between critical reflection and action on the topics mentioned above.");
        }
        if (position == 6) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("Students learn important data structures in computer science and acquire fundamental algorithm design techniques to get the efficient solutions to several computing problems from various disciplines. Topics include the analysis of algorithm efficiency, hash, heap, graph, tree, sorting and searching, brute force, divide-and-conquer, decrease-and-conquer, transform-and-conquer, dynamic programming, and greedy programming.");
        }
        if (position == 7) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("In data science, data analysis and machine learning techniques are applied to visualize data, understand trends, and make predictions. In this course students will learn how to obtain data, preprocess it, apply machine learning methods, and visualize the results. A student who completes the course will have enough theoretical knowledge, and enough skill with modern statistical programming languages and their libraries,to define and perform complete data science projects.");
        }
        if (position == 8) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            String theTitle = getIntent().getStringExtra("title");

            title.setText(theTitle);
            description.setText("Students will work on a project in large groups (up to 5 students in each group), developing requirements specification, a solution plan followed by design and implementation of the solution. The problem statement for the projects will be selected by the faculty. Faculty will also play the role of a project manager directing the schedule and deliverables for these projects.");
        }

    }
}