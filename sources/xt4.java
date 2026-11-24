// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class xt4 extends my0 {
    public final wt4 l1;
    public ValueAnimator m1;
    public zna n1;
    public Boolean o1;
    public qac p1;

    public xt4(Context context, ylb ylbVar, String str, float f) {
        super(1, ylbVar, context, false);
        K(-14737633);
        wt4 wt4Var = new wt4(z8c.t0, context, new r63(), f, str);
        this.l1 = wt4Var;
        wt4Var.H.setVisibility(8);
        wt4Var.setMultipleOnClick(false);
        wt4Var.setOnBackClickListener(new ut4(this, (byte) 0));
        wt4Var.setOnSelectListener(new vt4((Object) this, (byte) 0));
        ela elaVar = new ela(context, null);
        this.b = elaVar;
        int i = this.u0;
        elaVar.setPadding(i, 0, i, 0);
        this.b.addView(wt4Var);
    }

    @Override // my0
    public final boolean C() {
        return !this.l1.x;
    }

    public final void D0(boolean z, ut4 ut4Var) {
        wt4 wt4Var = this.l1;
        float translationY = wt4Var.getTranslationY();
        float height = z ? 0.0f : (this.b.getHeight() - wt4Var.g()) + (gm.n * 2.5f);
        this.o1 = Boolean.valueOf(z);
        if (z) {
            zna znaVar = new zna(wt4Var, zna.p, height);
            this.n1 = znaVar;
            znaVar.m.a(0.75f);
            this.n1.m.b(350.0f);
            this.n1.a(new ll(this, height, ut4Var));
            this.n1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.m1 = ofFloat;
        ofFloat.addUpdateListener(new fh4(this, (byte) 4));
        this.m1.addListener(new u5(this, ut4Var, (byte) 25));
        this.m1.setDuration(450L);
        this.m1.setInterpolator(d53.h);
        this.m1.start();
    }

    public final /* synthetic */ void E0() {
        super.dismiss();
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        D0(false, new ut4(this, (byte) 1));
        super.dismiss();
    }

    @Override // my0, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.l1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        D0(true, null);
    }
}
