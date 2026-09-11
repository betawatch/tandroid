package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c00 b;

    public /* synthetic */ rz(c00 c00Var, int i10) {
        this.a = i10;
        this.b = c00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final c00 c00Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c00 c00Var2 = c00Var;
                                c00Var2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.w1.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.yc.a0(c00Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                c00.U(c00Var, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final c00 c00Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c00 c00Var22 = c00Var2;
                                c00Var22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.w1.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.yc.a0(c00Var22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                c00.U(c00Var2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
