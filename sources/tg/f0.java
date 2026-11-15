package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.g71;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f0 extends LinearLayout {
    public final TextView a;
    public final w61 b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final /* synthetic */ g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Context context) {
        super(context);
        this.r = g0Var;
        setOrientation(0);
        int i7 = j6.i6;
        u uVar = g0Var.A1;
        setBackground(j6.h0(j6.w0(i7, uVar), 2, -1));
        w61 w61Var = new w61(this, context);
        this.b = w61Var;
        addView(w61Var, ja.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i10 = j6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        q6.s(imageView2, i10, uVar, mode);
        w61Var.addView(this.c, ja.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        q6.s(this.d, i10, uVar, mode);
        this.d.setVisibility(8);
        w61Var.addView(this.d, ja.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        q6.U(textView, i10, uVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, ja.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        q6.s(imageView4, j6.h7, uVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, ja.o(50, -1));
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
        ofFloat.addUpdateListener(new ch.u(12, this, z10));
        this.h.addListener(new g71(this, 17));
        this.h.setInterpolator(er.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g0 g0Var = this.r;
        org.telegram.ui.ActionBar.g1 g1Var = g0Var.B1;
        if (g1Var != null && g1Var.isShowing()) {
            g0Var.B1.d(true);
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
