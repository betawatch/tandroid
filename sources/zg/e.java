package zg;

import android.animation.ValueAnimator;
import android.view.View;
import fi.v3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                v3 v3Var = (v3) this.b;
                v3Var.getClass();
                v3Var.o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v3Var.invalidate();
                break;
        }
    }
}
