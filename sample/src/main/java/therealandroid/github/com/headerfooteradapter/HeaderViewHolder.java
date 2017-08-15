package therealandroid.github.com.headerfooteradapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sample.R;


public class HeaderViewHolder extends RecyclerView.ViewHolder {
    public TextView message;

    public HeaderViewHolder(View itemView) {
        super(itemView);
        message = (TextView) itemView.findViewById(R.id.header_title);
    }
}