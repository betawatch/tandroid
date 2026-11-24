// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vf2 extends FrameLayout implements vlb {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final ylb d;
    public int e;

    public vf2(Context context, ylb ylbVar) {
        super(context);
        this.d = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i = cmb.wf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.x(frameLayout, background, i, ylbVar, mode);
        addView(frameLayout, qoe.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(cmb.uf), mode));
        imageView.setPadding(0, gm.L(2.0f), 0, 0);
        frameLayout.addView(imageView, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, gm.L(1.0f));
        textView.setTextSize(1, 14.0f);
        anb.X(textView, cmb.g1(ylbVar) ? cmb.Ea : cmb.vf, ylbVar);
        textView.setTypeface(gm.o());
        addView(textView, qoe.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (cmb.g1(ylbVar)) {
            int i2 = cmb.Da;
            anb.B(frameLayout, cmb.b0(0, a(i2)), anb.M(i2), ylbVar);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i) {
        ylb ylbVar = this.d;
        Integer valueOf = ylbVar != null ? Integer.valueOf(ylbVar.h(i)) : null;
        return valueOf != null ? valueOf.intValue() : cmb.w0(null, i, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.c;
    }

    public ImageView getImageView() {
        return this.b;
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), TLObject.FLAG_30));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            int a = a(cmb.uf);
            ImageView imageView = this.b;
            if (imageView != null && a != this.e) {
                this.e = a;
                imageView.setColorFilter(new PorterDuffColorFilter(a, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
