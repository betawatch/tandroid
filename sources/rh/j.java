package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.q1;
import java.util.ArrayList;
import org.telegram.ui.Cells.t1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2.l b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ m e;

    public /* synthetic */ j(m mVar, f2.l lVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i9) {
        this.a = i9;
        this.e = mVar;
        this.b = lVar;
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
                if (view instanceof t1) {
                    ((t1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                m mVar = this.e;
                ArrayList arrayList = mVar.B;
                f2.l lVar = this.b;
                if (arrayList.remove(lVar.a)) {
                    mVar.d(lVar.a);
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
                if (view2 instanceof t1) {
                    ((t1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                m mVar2 = this.e;
                ArrayList arrayList2 = mVar2.B;
                f2.l lVar2 = this.b;
                if (arrayList2.remove(lVar2.b)) {
                    mVar2.d(lVar2.b);
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
                q1 q1Var = this.b.a;
                this.e.getClass();
                break;
            default:
                q1 q1Var2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
