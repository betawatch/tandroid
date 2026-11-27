// default package

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qv6 extends ov6 {
    public final int A;
    public final /* synthetic */ uv6 B;
    public final TextView z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qv6(uv6 uv6Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.B = uv6Var;
        wv6 wv6Var = uv6Var.x;
        this.z = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
        Resources resources = wv6Var.E.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.A = (int) typedValue.getDimension(displayMetrics);
    }
}
