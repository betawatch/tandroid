package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;

    public /* synthetic */ vz(h00 h00Var, int i10) {
        this.a = i10;
        this.b = h00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final h00 h00Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                h00 h00Var2 = h00Var;
                                h00Var2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.q.r(R.string.FilterInviteNameEdited, org.telegram.ui.Components.zc.a0(h00Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                h00.U(h00Var, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final h00 h00Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                h00 h00Var22 = h00Var2;
                                h00Var22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.q.r(R.string.FilterInviteNameEdited, org.telegram.ui.Components.zc.a0(h00Var22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                h00.U(h00Var2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
