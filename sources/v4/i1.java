package v4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.k6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class i1 extends d0 {
    public final /* synthetic */ k6 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k6 k6Var, Context context) {
        super(context);
        this.r = k6Var;
    }

    @Override // v4.d0, v4.b1
    public final void g(View view, a1 a1Var) {
        RecyclerView recyclerView = this.r.a;
        if (recyclerView == null) {
            return;
        }
        p0 layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int[] iArr = {0, p0.z(view) - layoutManager.F()};
        int i7 = iArr[0];
        int i10 = iArr[1];
        int m10 = m(Math.max(Math.abs(i7), Math.abs(i10)));
        if (m10 > 0) {
            a1Var.b(i7, i10, m10, this.j);
        }
    }

    @Override // v4.d0
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
