package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vq0 extends g.o {
    public final /* synthetic */ br0 c;

    public vq0(br0 br0Var) {
        this.c = br0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        br0 br0Var = this.c;
        if (br0Var.L.j(i10) == 1 || br0Var.Y || (br0Var.J == null && TextUtils.isEmpty(br0Var.v))) {
            return br0Var.M.J;
        }
        int i11 = br0Var.R;
        int i12 = br0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
