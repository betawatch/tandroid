// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class us5 extends FrameLayout implements vlb {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public int d;
    public int e;
    public final /* synthetic */ xs5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us5(xs5 xs5Var, Context context) {
        super(context);
        this.f = xs5Var;
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setBackground(cmb.L(46, cmb.w0(null, cmb.Q7, false), cmb.w0(null, cmb.X7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.large_income);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, qoe.d(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        ts2.s(textView, 1, 16.0f);
        anb.X(textView, cmb.F6, null);
        addView(textView, qoe.d(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.x6, null);
        addView(textView2, qoe.d(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(58.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        int w0 = cmb.w0(null, cmb.Q7, false);
        int w02 = cmb.w0(null, cmb.X7, false);
        ImageView imageView = this.a;
        if (imageView != null) {
            if (w0 == this.d && w02 == this.e) {
                return;
            }
            this.d = w0;
            this.e = w02;
            imageView.setBackground(cmb.L(46, w0, w02));
            invalidate();
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
