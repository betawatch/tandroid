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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ov6 extends jv6 {
    public final ImageView A;
    public final ProgressBar B;
    public final TextView C;
    public final RelativeLayout D;
    public final CheckBox E;
    public final float F;
    public final int G;
    public final g6 H;
    public final /* synthetic */ pv6 I;
    public final View z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ov6(pv6 pv6Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.I = pv6Var;
        rv6 rv6Var = pv6Var.x;
        this.H = new g6(this, (byte) 12);
        this.z = view;
        this.A = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.B = progressBar;
        this.C = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.D = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.E = checkBox;
        Context context = rv6Var.E;
        Drawable a = kod.a(context, R.drawable.mr_cast_checkbox);
        if (yqe.h(context)) {
            a.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(a);
        yqe.i(context, progressBar);
        this.F = yqe.c(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.G = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean v(ew6 ew6Var) {
        if (!ew6Var.g()) {
            k44 b = this.I.x.r.b(ew6Var);
            if (b == null) {
                return false;
            }
            tv6 tv6Var = (tv6) b.b;
            if ((tv6Var != null ? tv6Var.b : 1) != 3) {
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
