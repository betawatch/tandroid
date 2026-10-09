package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.v4;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h1 extends e0 {
    public final /* synthetic */ v4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(v4 v4Var, Context context) {
        super(context);
        this.r = v4Var;
    }

    @Override // s4.e0, s4.z0
    public final void g(View view, y0 y0Var) {
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
            y0Var.b(i10, i11, m10, this.j);
        }
    }

    @Override // s4.e0
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
