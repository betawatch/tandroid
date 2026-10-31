package vh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final org.telegram.ui.g3 a;
    public r b;
    public q20 c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public t(Activity activity, z1 z1Var) {
        super(activity);
        org.telegram.ui.g3 g3Var = new org.telegram.ui.g3(this, activity);
        this.a = g3Var;
        g3Var.setAdapter(new xg0(this, activity, z1Var, 1));
        g3Var.setLayoutManager(new s4.a0(0, false));
        g3Var.setClipToPadding(false);
        g3Var.setVisibility(8);
        g3Var.setWillNotDraw(false);
        g3Var.setOnItemClickListener(new ag.y0(this, 18));
        addView(g3Var, w7.b6.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        org.telegram.ui.g3 g3Var = this.a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            g3Var.invalidate();
            g3Var.setVisibility(z10 ? 0 : 8);
            return;
        }
        g3Var.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 25));
        this.f.addListener(new sg.y(9, this, z10));
        this.f.setInterpolator(gr.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(q20 q20Var) {
        this.c = q20Var;
    }

    public void setSelected(r rVar) {
        this.b = rVar;
        org.telegram.messenger.i0.a4(this.a);
    }
}
