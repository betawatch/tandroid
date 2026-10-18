package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.i5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class f1 extends c0 {
    public final /* synthetic */ i5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(i5 i5Var, Context context) {
        super(context);
        this.r = i5Var;
    }

    @Override // s4.c0, s4.x0
    public final void g(View view, w0 w0Var) {
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
            w0Var.b(i10, i11, m10, this.j);
        }
    }

    @Override // s4.c0
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
