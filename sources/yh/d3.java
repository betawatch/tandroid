package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l40;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class d3 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ e3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(e3 e3Var, Context context) {
        super(context);
        this.b = e3Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        e3 e3Var = this.b;
        l40 l40Var = e3Var.i;
        if (l40Var == null || l40Var.d.getChildCount() < 2 || e3Var.r == null || (frameLayout = e3Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - e3Var.m.getTranslationX();
        float translationY = iArr[1] - e3Var.m.getTranslationY();
        View childAt = l40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        e3Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - l40Var.getMeasuredHeight());
        e3Var.r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}
