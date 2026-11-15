package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ wc0(ed0 ed0Var, Bundle bundle, int i7) {
        this.a = i7;
        this.b = ed0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ed0 ed0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        org.telegram.messenger.g0.h3(new g50(27, ed0Var, tL_error));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new lc0(ed0Var, this.c, tLObject, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0((Object) this.b, tL_error, (Object) this.c, (Object) tLObject, 22));
                break;
        }
    }
}
