package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                e eVar = this.b;
                eVar.b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                break;
            case 1:
                super.onAnimationEnd(animator);
                e eVar2 = this.b;
                eVar2.b.d = 0.0f;
                eVar2.T = null;
                eVar2.h(eVar2.I);
                break;
            case 2:
                super.onAnimationEnd(animator);
                e eVar3 = this.b;
                eVar3.b.d = 0.0f;
                eVar3.T = null;
                eVar3.h(eVar3.I);
                break;
            default:
                super.onAnimationEnd(animator);
                e eVar4 = this.b;
                eVar4.b.d = 0.0f;
                eVar4.T = null;
                eVar4.h(eVar4.I);
                break;
        }
    }
}
