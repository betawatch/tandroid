// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pw4 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yw4 b;

    public /* synthetic */ pw4(yw4 yw4Var, byte b) {
        this.a = b;
        this.b = yw4Var;
    }

    @Override // qac
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        byte b = this.a;
        yw4 yw4Var = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                yw4Var.dismiss();
                break;
            case 1:
                ArrayList arrayList = yw4Var.h2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                break;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                TLRPC.UserFull X1 = oc7.r1(yw4Var.a).X1(z8c.h(yw4Var.a).e());
                if (X1 != null) {
                    tL_birthday = X1.birthday;
                    X1.flags2 |= 32;
                    X1.birthday = tL_birthday2;
                } else {
                    tL_birthday = null;
                }
                ConnectionsManager.getInstance(yw4Var.a).sendRequest(updatebirthday, new eo0((Object) yw4Var, (Object) X1, (Object) tL_birthday, (byte) 27), 1024);
                oc7.r1(yw4Var.a).i2();
                oc7.r1(yw4Var.a).p4(0L, "BIRTHDAY_SETUP");
                nm7.f(yw4Var.a).k(nm7.s1, new Object[0]);
                yw4Var.i2.O(true);
                break;
        }
    }
}
