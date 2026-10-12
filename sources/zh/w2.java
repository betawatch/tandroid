package zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y40;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class w2 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ x2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context) {
        super(context);
        this.b = x2Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        x2 x2Var = this.b;
        y40 y40Var = x2Var.i;
        if (y40Var == null || y40Var.d.getChildCount() < 2 || x2Var.r == null || (frameLayout = x2Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - x2Var.m.getTranslationX();
        float translationY = iArr[1] - x2Var.m.getTranslationY();
        View childAt = y40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        x2Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - y40Var.getMeasuredHeight());
        x2Var.r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}
