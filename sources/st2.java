// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class st2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cu2 b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ st2(cu2 cu2Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = cu2Var;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte b = this.a;
        TLRPC.User user = this.c;
        cu2 cu2Var = this.b;
        switch (b) {
            case 0:
                if (user != null && cu2Var.N == null && cu2Var.O == null) {
                    if (user.phone == null && (str = cu2Var.M) != null) {
                        user.phone = f78.h(str, false);
                    }
                    cu2Var.b.setText(user.first_name);
                    yt3 yt3Var = cu2Var.b.d;
                    yt3Var.setSelection(yt3Var.length());
                    cu2Var.c.setText(user.last_name);
                }
                TLRPC.UserFull Y1 = cu2Var.getMessagesController().Y1(cu2Var.I);
                if (Y1 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = Y1.note;
                    zt3 zt3Var = cu2Var.d;
                    if (tL_textWithEntities != null) {
                        zt3Var.setText(tL_textWithEntities);
                    } else {
                        zt3Var.setText("");
                    }
                }
                if (cu2Var.K) {
                    cu2Var.d.d.requestFocus();
                    hl.E3(cu2Var.d.d);
                    break;
                }
                break;
            default:
                cu2Var.c0(user);
                break;
        }
    }
}
