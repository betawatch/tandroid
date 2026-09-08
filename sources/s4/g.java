package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ j e;

    public /* synthetic */ g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.a = i10;
        this.e = jVar;
        this.b = hVar;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.b;
                c1 c1Var = hVar.a;
                jVar.O();
                jVar.d(hVar.a);
                jVar.B.remove(hVar.a);
                jVar.G();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.b;
                c1 c1Var2 = hVar2.b;
                jVar2.O();
                jVar2.d(hVar2.b);
                jVar2.B.remove(hVar2.b);
                jVar2.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b.a;
                this.e.getClass();
                break;
            default:
                c1 c1Var2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
