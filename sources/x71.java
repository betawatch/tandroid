// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x71 extends AnimatorListenerAdapter {
    public final /* synthetic */ a81 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ y71 h;

    public x71(y71 y71Var, a81 a81Var, float f, float f2, float f3, int i, boolean z) {
        this.h = y71Var;
        this.a = a81Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f = this.b;
        a81 a81Var = this.a;
        a81Var.a = f;
        a81Var.b = this.c;
        a81Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        y71 y71Var = this.h;
        SparseArray sparseArray = y71Var.w;
        int i = this.e;
        sparseArray.remove(i);
        if (this.f) {
            return;
        }
        y71Var.x.remove(i);
    }
}
