package tg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.k3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class r0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ r0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                y0 y0Var = this.b;
                viewGroup = ((k3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.B();
                break;
            default:
                y0 y0Var2 = this.b;
                viewGroup2 = ((k3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.B();
                break;
        }
    }
}
