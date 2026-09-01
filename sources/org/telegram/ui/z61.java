package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z61 extends f2.a1 {
    public final /* synthetic */ c71 a;

    public z61(c71 c71Var) {
        this.a = c71Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c71 c71Var = this.a;
        if (c71Var.d.H1) {
            AndroidUtilities.hideKeyboard(c71Var.Z);
        }
        c71.S(c71Var);
    }
}
