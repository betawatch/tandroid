package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.x5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g1 extends b0 {
    public final /* synthetic */ x5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(x5 x5Var, Context context) {
        super(context);
        this.r = x5Var;
    }

    @Override // s4.b0, s4.y0
    public final void g(View view, x0 x0Var) {
        RecyclerView recyclerView = this.r.a;
        if (recyclerView == null) {
            return;
        }
        n0 layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int[] iArr = {0, n0.z(view) - layoutManager.F()};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int m10 = m(Math.max(Math.abs(i10), Math.abs(i11)));
        if (m10 > 0) {
            x0Var.b(i10, i11, m10, this.j);
        }
    }

    @Override // s4.b0
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
