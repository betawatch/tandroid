package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jy b;

    public /* synthetic */ wx(jy jyVar, int i7) {
        this.a = i7;
        this.b = jyVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final jy jyVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ux
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jy jyVar2 = jyVar;
                        switch (i10) {
                            case 0:
                                jyVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750742, org.telegram.ui.Components.gc.a0(jyVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                jy.Z(jyVar2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final jy jyVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ux
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jy jyVar22 = jyVar2;
                        switch (i102) {
                            case 0:
                                jyVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750742, org.telegram.ui.Components.gc.a0(jyVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                jy.Z(jyVar22, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
