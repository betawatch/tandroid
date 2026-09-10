package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s71 extends s4.s0 {
    public final /* synthetic */ v71 a;

    public s71(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        v71 v71Var = this.a;
        if (v71Var.d.K1) {
            AndroidUtilities.hideKeyboard(v71Var.c0);
        }
        v71.S(v71Var);
    }
}
