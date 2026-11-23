package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ky b;

    public /* synthetic */ xx(ky kyVar, int i7) {
        this.a = i7;
        this.b = kyVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final ky kyVar = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.vx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ky kyVar2 = kyVar;
                        switch (i10) {
                            case 0:
                                kyVar2.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.f3.n(null, 2131750730, org.telegram.ui.Components.lc.b0(kyVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                ky.Z(kyVar2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final ky kyVar2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.vx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ky kyVar22 = kyVar2;
                        switch (i102) {
                            case 0:
                                kyVar22.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.f3.n(null, 2131750730, org.telegram.ui.Components.lc.b0(kyVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                ky.Z(kyVar22, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
