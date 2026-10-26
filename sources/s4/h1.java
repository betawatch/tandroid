package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.i5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h1 extends d0 {
    public final /* synthetic */ i5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i5 i5Var, Context context) {
        super(context);
        this.r = i5Var;
    }

    @Override // s4.d0, s4.a1
    public final void g(View view, z0 z0Var) {
        RecyclerView recyclerView = this.r.a;
        if (recyclerView == null) {
            return;
        }
        p0 layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int[] iArr = {0, p0.z(view) - layoutManager.F()};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int m10 = m(Math.max(Math.abs(i10), Math.abs(i11)));
        if (m10 > 0) {
            z0Var.b(i10, i11, m10, this.j);
        }
    }

    @Override // s4.d0
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
