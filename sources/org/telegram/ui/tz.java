package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ tz(e00 e00Var, int i10) {
        this.a = i10;
        this.b = e00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final e00 e00Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                e00 e00Var2 = e00Var;
                                e00Var2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.a2.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.wc.a0(e00Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                e00.U(e00Var, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final e00 e00Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                e00 e00Var22 = e00Var2;
                                e00Var22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.a2.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.wc.a0(e00Var22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                e00.U(e00Var2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
