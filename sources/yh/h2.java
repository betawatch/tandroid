package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h2 extends d61 {
    public final /* synthetic */ nr0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, int i10, ii.a aVar, g2 g2Var, g2 g2Var2, f6 f6Var, nr0 nr0Var) {
        super(context, i10, 0, false, aVar, g2Var, g2Var2, f6Var, 3, 1);
        this.f3 = nr0Var;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3.o();
    }
}
