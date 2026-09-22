package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class uq0 extends g.p {
    public final /* synthetic */ ar0 c;

    public uq0(ar0 ar0Var) {
        this.c = ar0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        ar0 ar0Var = this.c;
        if (ar0Var.L.j(i10) == 1 || ar0Var.Y || (ar0Var.J == null && TextUtils.isEmpty(ar0Var.v))) {
            return ar0Var.M.J;
        }
        int i11 = ar0Var.R;
        int i12 = ar0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
