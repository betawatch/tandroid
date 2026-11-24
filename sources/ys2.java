// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ys2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it2 b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ys2(it2 it2Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = it2Var;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte b = this.a;
        TLRPC.User user = this.c;
        it2 it2Var = this.b;
        switch (b) {
            case 0:
                if (user != null && it2Var.N == null && it2Var.O == null) {
                    if (user.phone == null && (str = it2Var.M) != null) {
                        user.phone = p38.h(str, false);
                    }
                    it2Var.b.setText(user.first_name);
                    ht3 ht3Var = it2Var.b.d;
                    ht3Var.setSelection(ht3Var.length());
                    it2Var.c.setText(user.last_name);
                }
                TLRPC.UserFull W1 = it2Var.getMessagesController().W1(it2Var.I);
                if (W1 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = W1.note;
                    it3 it3Var = it2Var.d;
                    if (tL_textWithEntities != null) {
                        it3Var.setText(tL_textWithEntities);
                    } else {
                        it3Var.setText("");
                    }
                }
                if (it2Var.K) {
                    it2Var.d.d.requestFocus();
                    gl.F3(it2Var.d.d);
                    break;
                }
                break;
            default:
                it2Var.c0(user);
                break;
        }
    }
}
