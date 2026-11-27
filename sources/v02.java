// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v02 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v02(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        int i = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                n12 n12Var = (n12) obj2;
                n12Var.v2.setAlpha(0.0f);
                n12Var.v2.setTranslationY(hl.L(78.0f) + i);
                y02 y02Var = n12Var.Y1;
                f12 f12Var = n12Var.v2;
                Float valueOf = Float.valueOf(1.0f);
                y02Var.getClass();
                y02Var.a(f12Var, valueOf);
                n12Var.U2.setAlpha(0.0f);
                vpa vpaVar = new vpa((Object) n12Var.w2, (vk4) vpa.p, 0.0f);
                vpaVar.m.a(0.75f);
                vpaVar.m.b(500.0f);
                vpaVar.b(new i10(this, (byte) 3));
                vpaVar.a(new x11(this, (vq0) obj, (byte) 2));
                n12Var.q3 = vpaVar;
                vpaVar.h();
                break;
            default:
                lp lpVar = (lp) obj2;
                ((d79) lpVar.d).scrollBy(0, i - ((int[]) obj)[0]);
                lpVar.c = null;
                break;
        }
    }
}
