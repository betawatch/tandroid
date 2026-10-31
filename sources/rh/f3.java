package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.t30;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f3 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ g3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(g3 g3Var, Context context) {
        super(context);
        this.b = g3Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        g3 g3Var = this.b;
        t30 t30Var = g3Var.i;
        if (t30Var == null || t30Var.d.getChildCount() < 2 || g3Var.r == null || (frameLayout = g3Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - g3Var.m.getTranslationX();
        float translationY = iArr[1] - g3Var.m.getTranslationY();
        View childAt = t30Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        g3Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - t30Var.getMeasuredHeight());
        g3Var.r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - org.telegram.messenger.i0.L(12.0f));
    }
}
