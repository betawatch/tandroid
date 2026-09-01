package th;

import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class w extends a1 {
    public final /* synthetic */ i0 a;

    public w(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i0 i0Var = this.a;
        if (i0Var.D.H1) {
            AndroidUtilities.hideKeyboard(i0Var.B.r);
        }
    }
}
