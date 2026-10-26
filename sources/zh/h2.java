package zh;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.vs0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h2 extends r71 {
    public final /* synthetic */ vs0 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, int i10, q0 q0Var, g2 g2Var, g2 g2Var2, u6 u6Var, vs0 vs0Var) {
        super(context, i10, 0, false, q0Var, g2Var, g2Var2, u6Var, 3, 1);
        this.n3 = vs0Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.n3.p();
    }
}
