package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r71 extends s4.t0 {
    public final /* synthetic */ u71 a;

    public r71(u71 u71Var) {
        this.a = u71Var;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u71 u71Var = this.a;
        if (u71Var.d.I1) {
            AndroidUtilities.hideKeyboard(u71Var.c0);
        }
        u71.T(u71Var);
    }
}
