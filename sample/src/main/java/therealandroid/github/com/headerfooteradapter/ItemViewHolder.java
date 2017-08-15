package therealandroid.github.com.headerfooteradapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sample.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public ItemViewHolder(final View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.normal_item);
    }
}