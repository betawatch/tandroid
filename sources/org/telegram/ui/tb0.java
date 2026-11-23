package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ tb0(ub0 ub0Var, String str, String str2, int i7) {
        this.a = i7;
        this.b = ub0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new qb0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                org.telegram.messenger.g0.g3(new qb0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
