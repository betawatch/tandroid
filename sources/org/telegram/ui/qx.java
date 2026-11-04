package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ qx(cy cyVar, int i3) {
        this.a = i3;
        this.b = cyVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 1;
                final cy cyVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ox
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cy cyVar2 = cyVar;
                        switch (i10) {
                            case 0:
                                cyVar2.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750743, org.telegram.ui.Components.fc.a0(cyVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                cy.Z(cyVar2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final cy cyVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ox
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cy cyVar22 = cyVar2;
                        switch (i102) {
                            case 0:
                                cyVar22.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750743, org.telegram.ui.Components.fc.a0(cyVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                cy.Z(cyVar22, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
