package hr.dabo.ravnoizzagreba;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Damjan on 23-Mar-17.
 */

public class WeekdaysAdapter extends ArrayAdapter<String>{

    private Context context;
    private int[] images;
    private String[] titleArray;
    private String[] descriptionArray;

    WeekdaysAdapter(Context context, String[] titleArray, int[] images, String[] descriptionArray){
        super(context, R.layout.single_row, R.id.text_row_title, titleArray);
        this.context = context;
        this.titleArray = titleArray;
        this.images = images;
        this.descriptionArray = descriptionArray;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        WeekdayViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row, parent, false);
            holder = new WeekdayViewHolder(row);
            row.setTag(holder);
        } else {
            holder = (WeekdayViewHolder) row.getTag();
        }

        /*LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row, parent, false);

        ImageView imageView = (ImageView) row.findViewById(R.id.image_view_row);
        TextView textViewTitle = (TextView) row.findViewById(R.id.text_row_title);
        TextView textViewDescription = (TextView) row.findViewById(R.id.text_row_description);*/

        holder.getImageView().setImageResource(images[position]);
        holder.getTextViewTitle().setText(titleArray[position]);
        holder.getTextViewDescription().setText(descriptionArray[position]);

        return row;
    }
}
