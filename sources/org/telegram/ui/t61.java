package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class t61 implements View.OnClickListener {
    public final /* synthetic */ v61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ w61 c;

    public t61(w61 w61Var, v61 v61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = w61Var;
        this.a = v61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        w61.o(this.c);
    }
}
