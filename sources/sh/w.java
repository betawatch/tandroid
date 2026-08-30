package sh;

import androidx.recyclerview.widget.RecyclerView;
import f2.z0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class w extends z0 {
    public final /* synthetic */ i0 a;

    public w(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i0 i0Var = this.a;
        if (i0Var.D.H1) {
            AndroidUtilities.hideKeyboard(i0Var.B.r);
        }
    }
}
