package wg;

import bi.f2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ y0(f1 f1Var, int i7) {
        this.a = i7;
        this.b = f1Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                ArrayList arrayList = f1Var.j2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                qg0 qg0Var = f1Var.Q1;
                if (qg0Var.Q) {
                    qg0Var.setLoading(false);
                    if (f1Var.k1.G) {
                        f1Var.k1();
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
                f1 f1Var2 = this.b;
                TLRPC.UserFull b22 = qp.s1(f1Var2.a).b2(p10.i(f1Var2.a).e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                }
                ConnectionsManager.getInstance(f1Var2.a).sendRequest(updatebirthday, new f2(f1Var2, b22, tL_birthday2, 25), 1024);
                qp.s1(f1Var2.a).m2();
                qp.s1(f1Var2.a).k4(0L, "BIRTHDAY_SETUP");
                qs.f(f1Var2.a).k(qs.s1, new Object[0]);
                f1Var2.o1(true, true);
                break;
            default:
                f1 f1Var3 = this.b;
                f1Var3.g2 = (String) obj;
                tg.y yVar = f1Var3.o2;
                org.telegram.messenger.g0.r(yVar);
                org.telegram.messenger.g0.i3(yVar, 350L);
                break;
        }
    }
}
