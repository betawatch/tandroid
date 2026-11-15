package wg;

import bi.j6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.og0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ w0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                ArrayList arrayList = c1Var.n2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                og0 og0Var = c1Var.U1;
                if (og0Var.R) {
                    og0Var.setLoading(false);
                    if (c1Var.o1.H) {
                        c1Var.k1();
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
                c1 c1Var2 = this.b;
                TLRPC.UserFull b22 = np.s1(c1Var2.a).b2(m10.i(c1Var2.a).e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                }
                ConnectionsManager.getInstance(c1Var2.a).sendRequest(updatebirthday, new j6(c1Var2, b22, tL_birthday2, 26), 1024);
                np.s1(c1Var2.a).m2();
                np.s1(c1Var2.a).k4(0L, "BIRTHDAY_SETUP");
                ns.f(c1Var2.a).k(ns.s1, new Object[0]);
                c1Var2.o1(true, true);
                break;
            default:
                c1 c1Var3 = this.b;
                c1Var3.k2 = (String) obj;
                s4.s0 s0Var = c1Var3.s2;
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.i3(s0Var, 350L);
                break;
        }
    }
}
