package xg;

import ai.r6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ig0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ y0(e1 e1Var, int i3) {
        this.a = i3;
        this.b = e1Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                ArrayList arrayList = e1Var.k2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                ig0 ig0Var = e1Var.R1;
                if (ig0Var.R) {
                    ig0Var.setLoading(false);
                    if (e1Var.l1.H) {
                        e1Var.k1();
                        break;
                    }
                }
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            case 2:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                e1 e1Var2 = this.b;
                TLRPC.UserFull b22 = hp.s1(e1Var2.a).b2(h10.i(e1Var2.a).e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                }
                ConnectionsManager.getInstance(e1Var2.a).sendRequest(updatebirthday, new r6(e1Var2, b22, tL_birthday2, 26), 1024);
                hp.s1(e1Var2.a).m2();
                hp.s1(e1Var2.a).k4(0L, "BIRTHDAY_SETUP");
                hs.f(e1Var2.a).k(hs.s1, new Object[0]);
                e1Var2.o1(true, true);
                break;
            default:
                e1 e1Var3 = this.b;
                e1Var3.h2 = (String) obj;
                wi.i0 i0Var = e1Var3.p2;
                org.telegram.messenger.g0.r(i0Var);
                org.telegram.messenger.g0.i3(i0Var, 350L);
                break;
        }
    }
}
