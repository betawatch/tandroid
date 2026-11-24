// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zpa extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ aqa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpa(aqa aqaVar, Context context) {
        super(context);
        this.b = aqaVar;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout;
        super.onLayout(z, i, i2, i3, i4);
        aqa aqaVar = this.b;
        xf5 xf5Var = aqaVar.i;
        if (xf5Var == null || xf5Var.d.getChildCount() < 2 || aqaVar.t == null || (frameLayout = aqaVar.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - aqaVar.m.getTranslationX();
        float translationY = iArr[1] - aqaVar.m.getTranslationY();
        View childAt = xf5Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        aqaVar.t.setTranslationY(((translationY2 - translationY) - r8.getMeasuredHeight()) - xf5Var.getMeasuredHeight());
        aqaVar.t.o(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - gl.L(12.0f));
    }
}
