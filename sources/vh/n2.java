package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.uu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n2 extends org.telegram.ui.ActionBar.z2 {
    public final m2 i1;
    public ValueAnimator j1;
    public o1.j k1;
    public Boolean l1;
    public q20 m1;

    public n2(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, float f7) {
        super(1, context, p6Var, false);
        P(-14737633);
        m2 m2Var = new m2(d20.s0, context, new th.b(), f7, str);
        this.i1 = m2Var;
        m2Var.G.setVisibility(8);
        m2Var.setMultipleOnClick(false);
        m2Var.setOnBackClickListener(new l2(this, 0));
        m2Var.setOnSelectListener(new qh.d(this, 18));
        uu0 uu0Var = new uu0(context, null);
        this.b = uu0Var;
        int i10 = this.t0;
        uu0Var.setPadding(i10, 0, i10, 0);
        this.b.addView(m2Var);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return !this.i1.x;
    }

    public final void J0(boolean z10, l2 l2Var) {
        m2 m2Var = this.i1;
        float translationY = m2Var.getTranslationY();
        float height = z10 ? 0.0f : (this.b.getHeight() - m2Var.g()) + (org.telegram.messenger.i0.n * 2.5f);
        this.l1 = Boolean.valueOf(z10);
        if (z10) {
            o1.j jVar = new o1.j(m2Var, o1.j.p, height);
            this.k1 = jVar;
            jVar.m.a(0.75f);
            this.k1.m.b(350.0f);
            this.k1.a(new org.telegram.messenger.i(this, height, l2Var));
            this.k1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.j1 = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 27));
        this.j1.addListener(new iw0(20, this, l2Var));
        this.j1.setDuration(450L);
        this.j1.setInterpolator(gr.h);
        this.j1.start();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        J0(false, new l2(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.i1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        J0(true, null);
    }
}
