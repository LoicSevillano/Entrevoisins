package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;

public class ProfileActivity extends AppCompatActivity {

    private TextView mTextNameImg;
    private ImageView mImageProfil;
    private ImageButton mFavoriteButton;
    private TextView mAvatarName;
    private TextView mAdressText;
    private TextView mPhoneText;
    private TextView mFacebookText;
    private TextView mDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mTextNameImg = findViewById(R.id.textnameimg);
        mImageProfil = findViewById(R.id.imageProfil);
        mFavoriteButton = findViewById(R.id.buttonaddfavorite);
        mAvatarName = findViewById(R.id.avatarname);
        mAdressText = findViewById(R.id.adress_text);
        mPhoneText = findViewById(R.id.phone_text);
        mFacebookText = findViewById(R.id.facebook_text);
        mDescription = findViewById(R.id.description);
    }
}