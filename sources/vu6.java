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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vu6 extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ wu6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu6(wu6 wu6Var, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = wu6Var;
        this.a = yqe.c(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        wu6 wu6Var = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            wu6.o(wu6Var.f0, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i2 = wu6Var.e0;
            layoutParams.width = i2;
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
        }
        ew6 ew6Var = (ew6) getItem(i);
        if (ew6Var != null) {
            boolean z = ew6Var.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(ew6Var.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = wu6Var.V;
            int b = yqe.b(context);
            int alpha = Color.alpha(b);
            int i3 = nm7.d4;
            if (alpha != 255) {
                b = on2.l(b, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b, b);
            mediaRouteVolumeSlider.setTag(ew6Var);
            wu6Var.i0.put(ew6Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (wu6Var.P) {
                    if (((!ew6Var.e() || gw6.g()) ? ew6Var.o : 0) == 1) {
                        mediaRouteVolumeSlider.setMax(ew6Var.q);
                        mediaRouteVolumeSlider.setProgress(ew6Var.p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(wu6Var.c0);
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
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(wu6Var.a0.contains(ew6Var) ? 4 : 0);
            HashSet hashSet = wu6Var.Y;
            if (hashSet != null && hashSet.contains(ew6Var)) {
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
