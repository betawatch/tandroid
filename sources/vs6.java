// default package

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vs6 extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ ws6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs6(ws6 ws6Var, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = ws6Var;
        this.a = voe.c(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ws6 ws6Var = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            ws6.o(ws6Var.f0, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i2 = ws6Var.e0;
            layoutParams.width = i2;
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
        }
        eu6 eu6Var = (eu6) getItem(i);
        if (eu6Var != null) {
            boolean z = eu6Var.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(eu6Var.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = ws6Var.V;
            int b = voe.b(context);
            int alpha = Color.alpha(b);
            int i3 = kk7.d4;
            if (alpha != 255) {
                b = bm2.k(b, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b, b);
            mediaRouteVolumeSlider.setTag(eu6Var);
            ws6Var.i0.put(eu6Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (ws6Var.P) {
                    if (((!eu6Var.e() || gu6.g()) ? eu6Var.o : 0) == 1) {
                        mediaRouteVolumeSlider.setMax(eu6Var.q);
                        mediaRouteVolumeSlider.setProgress(eu6Var.p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(ws6Var.c0);
                    }
                }
                mediaRouteVolumeSlider.setMax(100);
                mediaRouteVolumeSlider.setProgress(100);
                mediaRouteVolumeSlider.setEnabled(false);
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
            if (!z) {
                i3 = (int) (this.a * 255.0f);
            }
            imageView.setAlpha(i3);
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(ws6Var.a0.contains(eu6Var) ? 4 : 0);
            HashSet hashSet = ws6Var.Y;
            if (hashSet != null && hashSet.contains(eu6Var)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}
