// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tv6 extends ov6 {
    public final ImageView A;
    public final ProgressBar B;
    public final TextView C;
    public final RelativeLayout D;
    public final CheckBox E;
    public final float F;
    public final int G;
    public final h6 H;
    public final /* synthetic */ uv6 I;
    public final View z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tv6(uv6 uv6Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.I = uv6Var;
        wv6 wv6Var = uv6Var.x;
        this.H = new h6(this, (byte) 12);
        this.z = view;
        this.A = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.B = progressBar;
        this.C = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.D = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.E = checkBox;
        Context context = wv6Var.E;
        Drawable a = yqd.a(context, R.drawable.mr_cast_checkbox);
        if (nte.h(context)) {
            a.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(a);
        nte.i(context, progressBar);
        this.F = nte.c(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.G = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean v(jw6 jw6Var) {
        if (!jw6Var.g()) {
            v34 b = this.I.x.r.b(jw6Var);
            if (b == null) {
                return false;
            }
            yv6 yv6Var = (yv6) b.b;
            if ((yv6Var != null ? yv6Var.b : 1) != 3) {
                return false;
            }
        }
        return true;
    }

    public final void w(boolean z, boolean z2) {
        CheckBox checkBox = this.E;
        checkBox.setEnabled(false);
        this.z.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.A.setVisibility(4);
            this.B.setVisibility(0);
        }
        if (z2) {
            this.I.D(z ? this.G : 0, this.D);
        }
    }
}
