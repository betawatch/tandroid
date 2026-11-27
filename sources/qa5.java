// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qa5 extends AnimatorListenerAdapter {
    public final /* synthetic */ pa5 a;
    public final /* synthetic */ zc b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ z71 e;
    public final /* synthetic */ ra5 f;

    public qa5(ra5 ra5Var, pa5 pa5Var, zc zcVar, WindowManager windowManager, FrameLayout frameLayout, z71 z71Var) {
        this.f = ra5Var;
        this.a = pa5Var;
        this.b = zcVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = z71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jn7.f(this.f.h).d(new tw4((Object) this.a, (Object) this.b, (Object) this.c, (Object) this.d, (Object) this.e, (byte) 7));
    }
}
