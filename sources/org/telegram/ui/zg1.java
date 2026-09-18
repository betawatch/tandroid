package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh1 b;

    public /* synthetic */ zg1(gh1 gh1Var, int i10) {
        this.a = i10;
        this.b = gh1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final gh1 gh1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                gh1.b0(gh1Var, tL_error, tLObject);
                                break;
                            default:
                                gh1.h0(gh1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ch1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ch1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ch1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final gh1 gh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                gh1.b0(gh1Var2, tL_error, tLObject);
                                break;
                            default:
                                gh1.h0(gh1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
