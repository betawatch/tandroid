// default package

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u38 extends NestedScrollView {
    public View W;
    public final /* synthetic */ b48 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u38(b48 b48Var, Activity activity) {
        super(activity);
        this.a0 = b48Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int c(Rect rect) {
        if (this.W == null || this.a0.n1.getTop() != getPaddingTop()) {
            return 0;
        }
        int c = super.c(rect);
        int currentActionBarHeight = a.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + c);
        return currentActionBarHeight > 0 ? ug8.B(10.0f, currentActionBarHeight, c) : c;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
