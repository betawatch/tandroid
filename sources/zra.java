// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zra extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ asa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zra(asa asaVar, Context context) {
        super(context);
        this.b = asaVar;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout;
        super.onLayout(z, i, i2, i3, i4);
        asa asaVar = this.b;
        wh5 wh5Var = asaVar.i;
        if (wh5Var == null || wh5Var.d.getChildCount() < 2 || asaVar.t == null || (frameLayout = asaVar.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - asaVar.m.getTranslationX();
        float translationY = iArr[1] - asaVar.m.getTranslationY();
        View childAt = wh5Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        asaVar.t.setTranslationY(((translationY2 - translationY) - r8.getMeasuredHeight()) - wh5Var.getMeasuredHeight());
        asaVar.t.o(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - gm.L(12.0f));
    }
}
