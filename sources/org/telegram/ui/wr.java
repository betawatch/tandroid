package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ wr(fs fsVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = fsVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                fs fsVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && fsVar.M == null && fsVar.N == null) {
                    if (user.phone == null && (str = fsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    fsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = fsVar.b.b;
                    g3Var.setSelection(g3Var.length());
                    fsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = fsVar.getMessagesController().getUserFull(fsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        fsVar.d.setText(tL_textWithEntities);
                    } else {
                        fsVar.d.setText("");
                    }
                }
                if (fsVar.J) {
                    fsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.b);
                    break;
                }
                break;
            default:
                fs.V(this.b, this.c);
                break;
        }
    }
}
