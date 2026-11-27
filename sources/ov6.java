// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ov6 extends f89 {
    public jw6 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ wv6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov6(wv6 wv6Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = wv6Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = wv6Var.E;
        Drawable a = yqd.a(context, R.drawable.mr_cast_mute_button);
        if (nte.h(context)) {
            a.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(a);
        if (nte.h(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(jw6 jw6Var) {
        this.v = jw6Var;
        int i = jw6Var.p;
        boolean z = i == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new h6(this, (byte) 10));
        jw6 jw6Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(jw6Var2);
        mediaRouteVolumeSlider.setMax(jw6Var.q);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.L);
    }

    public final void u(boolean z) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        HashMap hashMap = this.y.O;
        if (z) {
            hashMap.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            hashMap.remove(this.v.c);
        }
    }
}
