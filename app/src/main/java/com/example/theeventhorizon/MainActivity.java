package com.example.theeventhorizon;

import android.os.Bundle;

import com.android.volley.toolbox.StringRequest;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
//import com.android.volley.Request;
import com.android.volley.RequestQueue;
//import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import com.example.theeventhorizon.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    //private RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //queue = Volley.newRequestQueue(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        //SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(),tabs.getTabCount());

        final ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        //viewPager.addOnPageChangeListener(new TabLayout().TabLayoutOnPageChangeListener);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Space Tab"));
        tabs.addTab(tabs.newTab().setText("APOD Tab"));
        tabs.addTab(tabs.newTab().setText("SpaceX Tab"));
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        tabs.setupWithViewPager(viewPager);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Function not supported as of yet.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }


//    private StringRequest searchNameStringRequest(String nameSearch) {
//
//
//
//        /** Available query parameters:
//         * @param date: a string in YYYY-MM-DD format, when set to a date (minimum date: 1995-06-16,
//         *           maximum date: today), returns an APOD from this date as a JSON object.
//         * @param start_date: (you need to specify both parameters if you want to use
//         *                   them): strings in YYYY-MM-DD format indicating start and end of date
//         *                   range. All the APODs in the range will be returned as a JSON array.
//         * @param end_date: (you need to specify both parameters if you want to use
//         *                 them): strings in YYYY-MM-DD format indicating start and end of date
//         *                 range. All the APODs in the range will be returned as a JSON array.
//         * @param image_thumbnail_size: an integer, when larger than 0, image_thumbnail will be
//         *                            returned in the JSON file (see below).
//         * @param absolute_thumbnail_url: a boolean, when set to true, image_thumbnails will have
//         *                              absolute, not relative URLs.
//         * @param thumbs: a boolean, when set to true, a video thumbnail will be returned if the
//         *              APOD is a video.
//         * @param html_tags: a boolean, when set to true, the description will be in the original
//         *                 HTML format.
//         * @param count: an integer, when larger than 0, the API will return specified number of random APODs
//         *
//         * Available query parameters for search endpoint:
//         * Note: every query parameter listed above (except date, start_date and end_date) can be
//         *             used in this endpoint.
//         * @param search_query: a string, the API will search for APODs with this string.
//         * @param number: optional, but recommended integer, the API will return only n number of
//         *              APODs that match the search_query.
//         * @param page: an integer, the API will return nth page of APODs if number is specified.
//         *
//         * Returned fields
//         * @param apod_site: a link to the original APOD website for the given day.
//         * @param copyright: the copyright of the APOD.
//         * @param date: requested date.
//         * @param description: description of the APOD. It can have original HTML formatting, if
//         *                   html_tags is set to true (useful if you want to get links from the
//         *                   original description).
//         * @param thumbnail_url: if an APOD is a video, this field will have a link to video
//         *                     thumbnail (works for videos hosted on YouTube and Vimeo).
//         * @param image_thumbnail: returned if image_thumbnail_size is set to a value larger than 0,
//         *                       it contains relative link to smaller version of the image. Useful
//         *                       for thumbnails to use eg. in mobile applications. If there are more
//         *                       than one image_thumbnail_size parameters set, multiple thumbnails
//         *                       will be returned in a JSON array in image_thumbnail value.
//         * @param url: url of the image or video.
//         * @param hdurl: returned if the APOD is an image. It will return the higher resolution
//         *             version of the image.
//         * @param media_type: depending on the APOD, it can be image, video or other.
//         * @param title: title of the APOD.
//         */
//
//        final String apodSite;
//        final String copyright;
//        final String date;
//        final String description;
//        final String hdURL;
//        final String mediaType;
//        final String title;
//        final String url;
//
//
//        {
//            "apod_site":"https://apod.nasa.gov/apod/ap181027.html",
//                "copyright":"Yuri Beletsky (Carnegie Las Campanas Observatory, TWAN)",
//                "date":"2018-10-27",
//                "description":"The best known asterism in northern skies hangs over the Canadian Rockies in this mountain and night skyscape taken last week from Banff National Park. But most remarkable is the amazing greenish airglow. With airglow visible to the eye, but not in color, the scene was captured in two exposures with a single camera, one exposure made while tracking the stars and one fixed to a tripod. Airglow emission is predominately from atmospheric oxygen atoms at extremely low densities. Commonly recorded in color by sensitive digital cameras the eerie, diffuse light is seen here in waves across the northern night. Originating at an altitude similar to aurorae, the luminous airglow is due to chemiluminescence, the production of light through chemical excitation and radiative decay. Energy for the chemical excitation is provided during daytime by the Sun's extreme ultraviolet radiation. Unlike aurorae which are limited to high latitudes, airglow can be found around the globe.",
//                "hdurl":"https://apod.nasa.gov/apod/image/1810/airglow_banff_beletsky.jpg",
//                "media_type":"image",
//                "title":"Airglow Borealis",
//                "url":"https://apod.nasa.gov/apod/image/1810/airglow_banff_beletsky1082.jpg"
//        }
//    }


}