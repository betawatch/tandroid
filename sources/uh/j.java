package uh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.n1;
import java.util.ArrayList;
import org.telegram.ui.Cells.s1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2.j b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ m e;

    public /* synthetic */ j(m mVar, f2.j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.a = i10;
        this.e = mVar;
        this.b = jVar;
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
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof s1) {
                    ((s1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                m mVar = this.e;
                ArrayList arrayList = mVar.B;
                f2.j jVar = this.b;
                if (arrayList.remove(jVar.a)) {
                    mVar.d(jVar.a);
                    mVar.G();
                    break;
                }
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof s1) {
                    ((s1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                m mVar2 = this.e;
                ArrayList arrayList2 = mVar2.B;
                f2.j jVar2 = this.b;
                if (arrayList2.remove(jVar2.b)) {
                    mVar2.d(jVar2.b);
                    mVar2.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                n1 n1Var = this.b.a;
                this.e.getClass();
                break;
            default:
                n1 n1Var2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
