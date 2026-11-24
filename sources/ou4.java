// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ou4 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu4 b;

    public /* synthetic */ ou4(xu4 xu4Var, byte b) {
        this.a = b;
        this.b = xu4Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        byte b = this.a;
        xu4 xu4Var = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                xu4Var.dismiss();
                break;
            case 1:
                ArrayList arrayList = xu4Var.h2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                break;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                TLRPC.UserFull W1 = na7.q1(xu4Var.a).W1(y6c.h(xu4Var.a).e());
                if (W1 != null) {
                    tL_birthday = W1.birthday;
                    W1.flags2 |= 32;
                    W1.birthday = tL_birthday2;
                } else {
                    tL_birthday = null;
                }
                ConnectionsManager.getInstance(xu4Var.a).sendRequest(updatebirthday, new en0((Object) xu4Var, (Object) W1, (Object) tL_birthday, (byte) 27), 1024);
                na7.q1(xu4Var.a).h2();
                na7.q1(xu4Var.a).n4(0L, "BIRTHDAY_SETUP");
                kk7.f(xu4Var.a).k(kk7.r1, new Object[0]);
                xu4Var.i2.O(true);
                break;
        }
    }
}
