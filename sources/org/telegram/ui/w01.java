package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
