// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zc extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;

    public zc(ad adVar, Context context) {
        super(context);
        int i = jb6.a0 ? 5 : 3;
        int v0 = cmb.v0(cmb.D8, adVar.d);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(v0);
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(i);
        int i2 = i | 48;
        addView(textView, qoe.d(-1, -2.0f, i2, 16.0f, 7.0f, 44.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(cmb.p1(0.5f, v0));
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(i);
        addView(textView2, qoe.d(-1, -2.0f, i2, 16.0f, 30.0f, 44.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 3 : 5) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
    }
}
