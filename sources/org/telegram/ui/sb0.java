package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ tb0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ sb0(tb0 tb0Var, String str, String str2, int i7) {
        this.a = i7;
        this.b = tb0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new pb0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new pb0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
