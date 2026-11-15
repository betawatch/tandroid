package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ux implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hy b;

    public /* synthetic */ ux(hy hyVar, int i7) {
        this.a = i7;
        this.b = hyVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final hy hyVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hy hyVar2 = hyVar;
                        switch (i10) {
                            case 0:
                                hyVar2.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.n(null, 2131750742, org.telegram.ui.Components.cc.a0(hyVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                hy.Z(hyVar2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final hy hyVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hy hyVar22 = hyVar2;
                        switch (i102) {
                            case 0:
                                hyVar22.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.n(null, 2131750742, org.telegram.ui.Components.cc.a0(hyVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                hy.Z(hyVar22, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
