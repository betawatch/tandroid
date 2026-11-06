package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ tx(gy gyVar, int i7) {
        this.a = i7;
        this.b = gyVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final gy gyVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.rx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gy gyVar2 = gyVar;
                        switch (i10) {
                            case 0:
                                gyVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750743, org.telegram.ui.Components.hc.a0(gyVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                gy.Z(gyVar2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final gy gyVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.rx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gy gyVar22 = gyVar2;
                        switch (i102) {
                            case 0:
                                gyVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750743, org.telegram.ui.Components.hc.a0(gyVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                gy.Z(gyVar22, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
