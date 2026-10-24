package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ zr(hs hsVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && hsVar.M == null && hsVar.N == null) {
                    if (user.phone == null && (str = hsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    hsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.f3 f3Var = hsVar.b.d;
                    f3Var.setSelection(f3Var.length());
                    hsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        hsVar.d.setText(tL_textWithEntities);
                    } else {
                        hsVar.d.setText("");
                    }
                }
                if (hsVar.J) {
                    hsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.d);
                    break;
                }
                break;
            default:
                hs.V(this.b, this.c);
                break;
        }
    }
}
