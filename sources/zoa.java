// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zoa extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k08 b;
    public final /* synthetic */ vqa c;

    /* JADX WARN: Multi-variable type inference failed */
    public zoa(vqa vqaVar, int i, k08 k08Var) {
        this.c = vqaVar;
        this.a = i;
        this.b = k08Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vqa vqaVar = this.c;
        vqaVar.O1();
        gpa gpaVar = vqaVar.b2;
        byte b = this.a;
        gpaVar.setVisibility(b == 0 ? 0 : 8);
        vqaVar.n2.setVisibility(b == 1 ? 0 : 8);
        vqaVar.w2.setVisibility(b == 2 ? 0 : 8);
        vqaVar.y2.setVisibility(b == 3 ? 0 : 8);
        vqaVar.B2();
        vqaVar.X2 = null;
        k08 k08Var = this.b;
        if (k08Var != null) {
            k08Var.run();
        }
    }
}
