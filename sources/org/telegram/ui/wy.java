package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz b;

    public /* synthetic */ wy(iz izVar, int i10) {
        this.a = i10;
        this.b = izVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final iz izVar = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.uy
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLRPC.TL_error tL_error2 = tL_error;
                        iz izVar2 = izVar;
                        switch (i11) {
                            case 0:
                                izVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.m5.n(null, 2131750743, org.telegram.ui.Components.cc.a0(izVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                iz.Y(izVar2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final iz izVar2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.uy
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLRPC.TL_error tL_error2 = tL_error;
                        iz izVar22 = izVar2;
                        switch (i112) {
                            case 0:
                                izVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.m5.n(null, 2131750743, org.telegram.ui.Components.cc.a0(izVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                iz.Y(izVar22, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
