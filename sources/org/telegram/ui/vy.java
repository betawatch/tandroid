package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vy implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz b;

    public /* synthetic */ vy(hz hzVar, int i10) {
        this.a = i10;
        this.b = hzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final hz hzVar = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ty
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hz hzVar2 = hzVar;
                        switch (i11) {
                            case 0:
                                hzVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.m5.n(null, 2131750743, org.telegram.ui.Components.cc.a0(hzVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                hz.Z(hzVar2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final hz hzVar2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ty
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hz hzVar22 = hzVar2;
                        switch (i112) {
                            case 0:
                                hzVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.m5.n(null, 2131750743, org.telegram.ui.Components.cc.a0(hzVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                hz.Z(hzVar22, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
