package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class zq0 extends g.o {
    public final /* synthetic */ fr0 c;

    public zq0(fr0 fr0Var) {
        this.c = fr0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        fr0 fr0Var = this.c;
        if (fr0Var.L.j(i10) == 1 || fr0Var.Y || (fr0Var.J == null && TextUtils.isEmpty(fr0Var.v))) {
            return fr0Var.M.J;
        }
        int i11 = fr0Var.R;
        int i12 = fr0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
