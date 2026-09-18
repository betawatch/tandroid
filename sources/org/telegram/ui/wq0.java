package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class wq0 extends g.p {
    public final /* synthetic */ cr0 c;

    public wq0(cr0 cr0Var) {
        this.c = cr0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        cr0 cr0Var = this.c;
        if (cr0Var.L.j(i10) == 1 || cr0Var.Y || (cr0Var.J == null && TextUtils.isEmpty(cr0Var.v))) {
            return cr0Var.M.J;
        }
        int i11 = cr0Var.R;
        int i12 = cr0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
