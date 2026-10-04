package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class w71 implements View.OnClickListener {
    public final /* synthetic */ y71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ z71 c;

    public w71(z71 z71Var, y71 y71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = z71Var;
        this.a = y71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        z71.n(this.c);
    }
}
