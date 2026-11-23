package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ry implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ ry(kz kzVar, int i7) {
        this.a = i7;
        this.b = kzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new ss(16, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.g0.g3(new up(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
