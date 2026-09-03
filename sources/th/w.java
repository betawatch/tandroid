package th;

import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
