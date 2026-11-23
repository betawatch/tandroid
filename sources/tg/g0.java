package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.k71;
import org.telegram.ui.y61;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g0 extends LinearLayout {
    public final TextView a;
    public final y61 b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final /* synthetic */ h0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, Context context) {
        super(context);
        this.r = h0Var;
        setOrientation(0);
        int i7 = m6.i6;
        v vVar = h0Var.A1;
        setBackground(m6.h0(m6.w0(i7, vVar), 2, -1));
        y61 y61Var = new y61(this, context);
        this.b = y61Var;
        addView(y61Var, ma.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i10 = m6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        t6.s(imageView2, i10, vVar, mode);
        y61Var.addView(this.c, ma.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        t6.s(this.d, i10, vVar, mode);
        this.d.setVisibility(8);
        y61Var.addView(this.d, ma.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        t6.U(textView, i10, vVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, ma.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        t6.s(imageView4, m6.h7, vVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, ma.o(50, -1));
    }

    public final void a(int i7, boolean z10, boolean z11) {
        if (!z11) {
            this.c.setImageResource(i7);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
            a(i7, false, false);
            return;
        }
        this.f = z10;
        this.d.setImageResource(i7);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ch.v(12, this, z10));
        this.h.addListener(new k71(this, 17));
        this.h.setInterpolator(nr.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        h0 h0Var = this.r;
        org.telegram.ui.ActionBar.g1 g1Var = h0Var.B1;
        if (g1Var != null && g1Var.isShowing()) {
            h0Var.B1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i7) {
        a(i7, true, false);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.n.setVisibility(z10 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
