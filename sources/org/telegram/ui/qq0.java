package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class qq0 extends g.p {
    public final /* synthetic */ wq0 c;

    public qq0(wq0 wq0Var) {
        this.c = wq0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        wq0 wq0Var = this.c;
        if (wq0Var.L.j(i10) == 1 || wq0Var.Y || (wq0Var.J == null && TextUtils.isEmpty(wq0Var.v))) {
            return wq0Var.M.J;
        }
        int i11 = wq0Var.R;
        int i12 = wq0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
