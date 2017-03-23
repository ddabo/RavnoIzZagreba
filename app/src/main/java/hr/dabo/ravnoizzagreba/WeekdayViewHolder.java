package hr.dabo.ravnoizzagreba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Damjan on 23-Mar-17.
 */

public class WeekdayViewHolder {

    private ImageView imageView;
    private TextView textViewTitle;
    private TextView textViewDescription;

    public WeekdayViewHolder(View view) {
        imageView = (ImageView) view.findViewById(R.id.image_view_row);
        textViewTitle = (TextView) view.findViewById(R.id.text_row_title);
        textViewDescription= (TextView) view.findViewById(R.id.text_row_description);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getTextViewTitle() {
        return textViewTitle;
    }

    public TextView getTextViewDescription() {
        return textViewDescription;
    }
}
