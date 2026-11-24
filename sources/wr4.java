// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class wr4 extends fx0 {
    public final vr4 l1;
    public ValueAnimator m1;
    public yla n1;
    public Boolean o1;
    public p8c p1;

    public wr4(Context context, wjb wjbVar, String str, float f) {
        super(1, wjbVar, context, false);
        L(-14737633);
        vr4 vr4Var = new vr4(y6c.t0, context, new f53(), f, str);
        this.l1 = vr4Var;
        vr4Var.H.setVisibility(8);
        vr4Var.setMultipleOnClick(false);
        vr4Var.setOnBackClickListener(new tr4(this, (byte) 0));
        vr4Var.setOnSelectListener(new ur4((Object) this, (byte) 0));
        cja cjaVar = new cja(context, null);
        this.b = cjaVar;
        int i = this.u0;
        cjaVar.setPadding(i, 0, i, 0);
        this.b.addView(vr4Var);
    }

    public final void D0(boolean z, tr4 tr4Var) {
        vr4 vr4Var = this.l1;
        float translationY = vr4Var.getTranslationY();
        float height = z ? 0.0f : (this.b.getHeight() - vr4Var.g()) + (gl.n * 2.5f);
        this.o1 = Boolean.valueOf(z);
        if (z) {
            yla ylaVar = new yla(vr4Var, yla.p, height);
            this.n1 = ylaVar;
            ylaVar.m.a(0.75f);
            this.n1.m.b(350.0f);
            this.n1.a(new lk(this, height, tr4Var));
            this.n1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.m1 = ofFloat;
        ofFloat.addUpdateListener(new ni4(this, (byte) 2));
        this.m1.addListener(new u5(this, tr4Var, (byte) 25));
        this.m1.setDuration(450L);
        this.m1.setInterpolator(s33.h);
        this.m1.start();
    }

    @Override // fx0
    public final boolean E() {
        return !this.l1.x;
    }

    public final /* synthetic */ void E0() {
        super.dismiss();
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        D0(false, new tr4(this, (byte) 1));
        super.dismiss();
    }

    @Override // fx0, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.l1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        D0(true, null);
    }
}
