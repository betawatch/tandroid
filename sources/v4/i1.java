package v4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.j6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class i1 extends d0 {
    public final /* synthetic */ j6 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j6 j6Var, Context context) {
        super(context);
        this.r = j6Var;
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
