// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rw4 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bx4 b;

    public /* synthetic */ rw4(bx4 bx4Var, byte b) {
        this.a = b;
        this.b = bx4Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        byte b = this.a;
        bx4 bx4Var = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                bx4Var.dismiss();
                break;
            case 1:
                ArrayList arrayList = bx4Var.h2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                break;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                TLRPC.UserFull Y1 = uc7.s1(bx4Var.a).Y1(yac.h(bx4Var.a).e());
                if (Y1 != null) {
                    tL_birthday = Y1.birthday;
                    Y1.flags2 |= 32;
                    Y1.birthday = tL_birthday2;
                } else {
                    tL_birthday = null;
                }
                ConnectionsManager.getInstance(bx4Var.a).sendRequest(updatebirthday, new fn0((Object) bx4Var, (Object) Y1, (Object) tL_birthday, (byte) 27), 1024);
                uc7.s1(bx4Var.a).j2();
                uc7.s1(bx4Var.a).v4(0L, "BIRTHDAY_SETUP");
                jn7.f(bx4Var.a).k(jn7.s1, new Object[0]);
                bx4Var.i2.O(true);
                break;
        }
    }
}
