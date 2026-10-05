package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class r71 implements View.OnClickListener {
    public final /* synthetic */ TLRPC.TL_authorization a;
    public final /* synthetic */ x71 b;

    public r71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.b = x71Var;
        this.a = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x71.m(this.b, this.a.ip);
    }
}
