// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class po1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ be0 c;
    public final /* synthetic */ lu1 d;
    public final /* synthetic */ jia e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ au1 h;
    public final /* synthetic */ mu1 n;

    public po1(mu1 mu1Var, boolean z, boolean z2, be0 be0Var, lu1 lu1Var, jia jiaVar, boolean z3, au1 au1Var) {
        this.n = mu1Var;
        this.a = z;
        this.b = z2;
        this.c = be0Var;
        this.d = lu1Var;
        this.e = jiaVar;
        this.f = z3;
        this.h = au1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        mu1 mu1Var = this.n;
        mu1Var.W2[1] = null;
        mu1Var.Q2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.W2;
        if (animator.equals(animatorSetArr[1])) {
            be0 be0Var = this.c;
            boolean z = this.b;
            boolean z2 = this.a;
            if (!z2 && !z && be0Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(s33.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<lu1, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<jia, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<au1, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (be0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(be0Var, (Property<be0, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new bb1((Object) this, (byte) 5));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
