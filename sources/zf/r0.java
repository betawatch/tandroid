package zf;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r0 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ r0(x0 x0Var, int i9) {
        this.a = i9;
        this.b = x0Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                viewGroup = ((f3) x0Var).containerView;
                viewGroup.invalidate();
                x0Var.y();
                break;
            default:
                x0 x0Var2 = this.b;
                viewGroup2 = ((f3) x0Var2).containerView;
                viewGroup2.invalidate();
                x0Var2.y();
                break;
        }
    }
}
