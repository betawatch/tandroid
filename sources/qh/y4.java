package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
import org.telegram.ui.mc1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y4 extends LinearLayout {
    public final TextView a;
    public final mc1 b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final /* synthetic */ a5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context) {
        super(context);
        this.r = a5Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        p4 p4Var = a5Var.D1;
        setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i10, p4Var), 2, -1));
        mc1 mc1Var = new mc1(this, context);
        this.b = mc1Var;
        addView(mc1Var, k7.c6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, p4Var));
        mc1Var.addView(this.c, k7.c6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, p4Var));
        this.d.setVisibility(8);
        mc1Var.addView(this.d, k7.c6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, p4Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, k7.c6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h7, p4Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, k7.c6.n(50, -1));
    }

    public final void a(int i10, boolean z4, boolean z10) {
        if (!z10) {
            this.c.setImageResource(i10);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
            a(i10, false, false);
            return;
        }
        this.f = z4;
        this.d.setImageResource(i10);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new eg.z0(12, this, z4));
        this.h.addListener(new i2(this, 2));
        this.h.setInterpolator(pr.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        a5 a5Var = this.r;
        org.telegram.ui.ActionBar.p1 p1Var = a5Var.E1;
        if (p1Var != null && p1Var.isShowing()) {
            a5Var.E1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        this.n.setVisibility(z4 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
