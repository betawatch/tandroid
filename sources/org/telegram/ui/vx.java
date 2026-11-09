package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy b;

    public /* synthetic */ vx(iy iyVar, int i7) {
        this.a = i7;
        this.b = iyVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final iy iyVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.tx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLRPC.TL_error tL_error2 = tL_error;
                        iy iyVar2 = iyVar;
                        switch (i10) {
                            case 0:
                                iyVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750742, org.telegram.ui.Components.hc.a0(iyVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                iy.Z(iyVar2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final iy iyVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.tx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_error tL_error2 = tL_error;
                        iy iyVar22 = iyVar2;
                        switch (i102) {
                            case 0:
                                iyVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750742, org.telegram.ui.Components.hc.a0(iyVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                iy.Z(iyVar22, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
