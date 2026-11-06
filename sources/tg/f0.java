package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class f0 extends LinearLayout {
    public final TextView a;
    public final pg.h b;
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
        int i7 = k6.i6;
        u uVar = g0Var.z1;
        setBackground(k6.h0(k6.w0(i7, uVar), 2, -1));
        pg.h hVar = new pg.h(this, context);
        this.b = hVar;
        addView(hVar, ha.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i10 = k6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        r6.t(imageView2, i10, uVar, mode);
        hVar.addView(this.c, ha.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        r6.t(this.d, i10, uVar, mode);
        this.d.setVisibility(8);
        hVar.addView(this.d, ha.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        r6.V(textView, i10, uVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, ha.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        r6.t(imageView4, k6.h7, uVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, ha.o(50, -1));
    }

    public final void a(int i7, boolean z9, boolean z10) {
        if (!z10) {
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
        this.f = z9;
        this.d.setImageResource(i7);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ch.u(12, this, z9));
        this.h.addListener(new r81(this, 15));
        this.h.setInterpolator(xq.h);
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
        org.telegram.ui.ActionBar.g1 g1Var = g0Var.A1;
        if (g1Var != null && g1Var.isShowing()) {
            g0Var.A1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i7) {
        a(i7, true, false);
    }

    @Override // android.view.View
    public void setSelected(boolean z9) {
        this.n.setVisibility(z9 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
