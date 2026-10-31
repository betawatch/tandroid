package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w31 implements View.OnLongClickListener {
    public final /* synthetic */ TLRPC.TL_authorization a;
    public final /* synthetic */ c41 b;

    public w31(c41 c41Var, TLRPC.TL_authorization tL_authorization) {
        this.b = c41Var;
        this.a = tL_authorization;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        c41.I0(this.b, this.a.country);
        return true;
    }
}
