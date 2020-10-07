package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class PaletteActivity extends AppCompatActivity {

    GridView gridView;
    final String[] colors = {"Choose a color", "Red", "Yellow", "Blue", "Green", "Gray",
            "Magenta", "Black", "Cyan", "White"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Palette Activity");

        gridView = findViewById(R.id.gridView);
        final View backgroundView = findViewById(R.id.gridView);


        CustomAdapter customAdapter = new CustomAdapter(this, colors);
        gridView.setAdapter(customAdapter);
    }

    public class CustomAdapter extends BaseAdapter {
        private String[] colors;
        private Context context;
        private LayoutInflater inflater;

        public CustomAdapter(PaletteActivity paletteActivity, String[] colors) {
            context = paletteActivity;
            this.colors = colors;
        }

        @Override
        public int getCount() {
            return colors.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }


        class Holder { // responsible for containing an instance of View
            private TextView colorTextView;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View myView = convertView;
            Holder holder;

            if (myView == null) {
                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                myView = inflater.inflate(R.layout.activity_main, null);
                myView.setBackgroundColor(Color.WHITE);

                holder = new Holder();
                holder.colorTextView = myView.findViewById(R.id.color_text_view);
                myView.setTag(holder);
            } else {

                holder = (Holder) myView.getTag();
            }


            holder.colorTextView.setText(colors[position]);


            if (position != 0)
                holder.colorTextView.setBackgroundColor(Color.parseColor(colors[position]));

            // Returning the view.
            return myView;

        }


    }
}
