package qg;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u2 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ v2 a;

    public u2(v2 v2Var) {
        this.a = v2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i10;
        int i11;
        int i12;
        int i13;
        v2 v2Var = this.a;
        ai.f0 f0Var = v2Var.b;
        Rect rect = v2Var.h;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i10 = insets.left;
            i11 = insets.top;
            i12 = insets.right;
            i13 = insets.bottom;
            rect.set(i10, i11, i12, i13);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        f0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        f0Var.requestLayout();
        if (i14 < 30) {
            return windowInsets.consumeSystemWindowInsets();
        }
        windowInsets2 = WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
