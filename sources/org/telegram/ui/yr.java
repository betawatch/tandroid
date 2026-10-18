package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ yr(hs hsVar, TLRPC.User user, int i10) {
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
                    org.telegram.ui.Cells.g3 g3Var = hsVar.b.b;
                    g3Var.setSelection(g3Var.length());
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
                    hsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.b);
                    break;
                }
                break;
            default:
                hs.V(this.b, this.c);
                break;
        }
    }
}
