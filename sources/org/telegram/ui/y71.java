package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class y71 extends s4.r0 {
    public final /* synthetic */ b81 a;

    public y71(b81 b81Var) {
        this.a = b81Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b81 b81Var = this.a;
        if (b81Var.d.I1) {
            AndroidUtilities.hideKeyboard(b81Var.c0);
        }
        b81.T(b81Var);
    }
}
