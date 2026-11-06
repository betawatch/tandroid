package v4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.u5;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g1 extends c0 {
    public final /* synthetic */ u5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u5 u5Var, Context context) {
        super(context);
        this.r = u5Var;
    }

    @Override // v4.c0, v4.z0
    public final void g(View view, y0 y0Var) {
        RecyclerView recyclerView = this.r.a;
        if (recyclerView == null) {
            return;
        }
        n0 layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int[] iArr = {0, n0.z(view) - layoutManager.F()};
        int i7 = iArr[0];
        int i10 = iArr[1];
        int m10 = m(Math.max(Math.abs(i7), Math.abs(i10)));
        if (m10 > 0) {
            y0Var.b(i7, i10, m10, this.j);
        }
    }

    @Override // v4.c0
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
