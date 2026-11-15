package v4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.u5;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class h1 extends c0 {
    public final /* synthetic */ u5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(u5 u5Var, Context context) {
        super(context);
        this.r = u5Var;
    }

    @Override // v4.c0, v4.a1
    public final void g(View view, z0 z0Var) {
        RecyclerView recyclerView = this.r.a;
        if (recyclerView == null) {
            return;
        }
        o0 layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int[] iArr = {0, o0.z(view) - layoutManager.F()};
        int i7 = iArr[0];
        int i10 = iArr[1];
        int m10 = m(Math.max(Math.abs(i7), Math.abs(i10)));
        if (m10 > 0) {
            z0Var.b(i7, i10, m10, this.j);
        }
    }

    @Override // v4.c0
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
