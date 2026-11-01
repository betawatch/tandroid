package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ zc0(ad0 ad0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = ad0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new wc0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                org.telegram.messenger.i0.g3(new wc0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
