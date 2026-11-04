package u4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.s5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g1 extends c0 {
    public final /* synthetic */ s5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(s5 s5Var, Context context) {
        super(context);
        this.r = s5Var;
    }

    @Override // u4.c0, u4.z0
    public final void g(View view, y0 y0Var) {
        RecyclerView recyclerView = this.r.a;
        if (recyclerView == null) {
            return;
        }
        o0 layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int[] iArr = {0, o0.z(view) - layoutManager.F()};
        int i3 = iArr[0];
        int i10 = iArr[1];
        int m10 = m(Math.max(Math.abs(i3), Math.abs(i10)));
        if (m10 > 0) {
            y0Var.b(i3, i10, m10, this.j);
        }
    }

    @Override // u4.c0
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
