// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x7a extends v79 {
    public final /* synthetic */ ix1 a;

    public x7a(ix1 ix1Var) {
        this.a = ix1Var;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ix1 ix1Var = this.a;
        View view = ix1Var.u;
        boolean z = ix1Var.w.H0() != 0;
        Boolean bool = ix1Var.x;
        if (bool == null || z != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).start();
            ix1Var.x = Boolean.valueOf(z);
        }
    }
}
