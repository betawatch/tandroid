package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z71 implements View.OnLongClickListener {
    public final /* synthetic */ TLRPC.TL_authorization a;
    public final /* synthetic */ e81 b;

    public z71(e81 e81Var, TLRPC.TL_authorization tL_authorization) {
        this.b = e81Var;
        this.a = tL_authorization;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        e81.m(this.b, this.a.country);
        return true;
    }
}
