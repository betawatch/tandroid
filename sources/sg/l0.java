package sg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l0 extends LinearLayout {
    public final TextView a;
    public final bh.p b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final /* synthetic */ m0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, Context context) {
        super(context);
        this.r = m0Var;
        setOrientation(0);
        int i10 = y6.i6;
        u uVar = m0Var.F1;
        setBackground(y6.g0(y6.w0(i10, uVar), 2, -1));
        bh.p pVar = new bh.p(this, context);
        this.b = pVar;
        addView(pVar, kb1.x(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i11 = y6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        f7.t(imageView2, i11, uVar, mode);
        pVar.addView(this.c, kb1.i(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        f7.t(this.d, i11, uVar, mode);
        this.d.setVisibility(8);
        pVar.addView(this.d, kb1.i(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        f7.V(textView, i11, uVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, kb1.x(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        f7.t(imageView4, y6.h7, uVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, kb1.r(50, -1));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        if (!z11) {
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
        this.f = z10;
        this.d.setImageResource(i10);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new bh.a0(12, this, z10));
        this.h.addListener(new hc1(this, 16));
        this.h.setInterpolator(ds.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m0 m0Var = this.r;
        org.telegram.ui.ActionBar.o1 o1Var = m0Var.G1;
        if (o1Var != null && o1Var.isShowing()) {
            m0Var.G1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.n.setVisibility(z10 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
