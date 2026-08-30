package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y61 extends f2.z0 {
    public final /* synthetic */ b71 a;

    public y61(b71 b71Var) {
        this.a = b71Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b71 b71Var = this.a;
        if (b71Var.d.H1) {
            AndroidUtilities.hideKeyboard(b71Var.Z);
        }
        b71.S(b71Var);
    }
}
