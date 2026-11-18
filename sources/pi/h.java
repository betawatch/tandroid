package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import v4.f1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.i b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ k e;

    public /* synthetic */ h(k kVar, v4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.a = i7;
        this.e = kVar;
        this.b = iVar;
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
                if (view instanceof q1) {
                    ((q1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                k kVar = this.e;
                ArrayList arrayList = kVar.B;
                v4.i iVar = this.b;
                if (arrayList.remove(iVar.a)) {
                    kVar.d(iVar.a);
                    kVar.G();
                    break;
                }
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof q1) {
                    ((q1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                k kVar2 = this.e;
                ArrayList arrayList2 = kVar2.B;
                v4.i iVar2 = this.b;
                if (arrayList2.remove(iVar2.b)) {
                    kVar2.d(iVar2.b);
                    kVar2.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b.a;
                this.e.getClass();
                break;
            default:
                f1 f1Var2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
