// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w74 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w74(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    public final void a() {
        y74 y74Var = (y74) this.d;
        if (y74Var.h) {
            y74Var.d(this.b + this.c, 1.0f);
            if (y74Var.h) {
                y74Var.h = false;
            }
            y74Var.b.F(y74Var.f, y74Var.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                pfc pfcVar = (pfc) this.d;
                pfcVar.P = false;
                pfcVar.N = true;
                pfcVar.a0 = this.b;
                pfcVar.b0 = this.c;
                pfcVar.requestLayout();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void b(Animator animator) {
    }
}
