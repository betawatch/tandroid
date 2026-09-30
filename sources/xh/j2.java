package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class j2 extends t61 {
    public final /* synthetic */ bs0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Context context, int i10, hi.a aVar, i2 i2Var, i2 i2Var2, d6 d6Var, bs0 bs0Var) {
        super(context, i10, 0, false, aVar, i2Var, i2Var2, d6Var, 3, 1);
        this.f3 = bs0Var;
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3.o();
    }
}
