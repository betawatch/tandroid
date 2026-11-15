package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w01 extends ug.a1 {
    public final /* synthetic */ x01 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(x01 x01Var, Context context) {
        super(2, context, null);
        this.N = x01Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        x01 x01Var = this.N;
        if (x01Var.getParent() instanceof View) {
            ((View) x01Var.getParent()).invalidate();
        }
    }
}
