package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk0 b;

    public /* synthetic */ yi0(hk0 hk0Var, int i7) {
        this.a = i7;
        this.b = hk0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new mc0(this.b, tL_error, tLObject, 12));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new fe0(14, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new ui0(this.b, 5));
                break;
            default:
                org.telegram.messenger.g0.g3(new fe0(13, this.b, tLObject));
                break;
        }
    }
}
