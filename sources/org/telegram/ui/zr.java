package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ zr(is isVar, TLRPC.User user, int i9) {
        this.a = i9;
        this.b = isVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                is isVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && isVar.I == null && isVar.J == null) {
                    if (user.phone == null && (str = isVar.H) != null) {
                        user.phone = ne.b.d(str, false);
                    }
                    isVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = isVar.b.b;
                    h3Var.setSelection(h3Var.length());
                    isVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = isVar.getMessagesController().getUserFull(isVar.D);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        isVar.d.setText(tL_textWithEntities);
                    } else {
                        isVar.d.setText("");
                    }
                }
                if (isVar.F) {
                    isVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(isVar.d.b);
                    break;
                }
                break;
            default:
                is.U(this.b, this.c);
                break;
        }
    }
}
