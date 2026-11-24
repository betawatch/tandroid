// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q51 {
    public static volatile q51[] e = new q51[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;

    static {
        for (int i = 0; i < 4; i++) {
            f[i] = new Object();
        }
    }

    public q51(int i) {
        this.a = i;
    }

    public static q51 d(int i) {
        q51 q51Var;
        q51 q51Var2 = e[i];
        if (q51Var2 != null) {
            return q51Var2;
        }
        synchronized (f[i]) {
            q51Var = e[i];
            if (q51Var == null) {
                q51[] q51VarArr = e;
                q51 q51Var3 = new q51(i);
                q51VarArr[i] = q51Var3;
                q51Var = q51Var3;
            }
        }
        return q51Var;
    }

    public final void a(m51 m51Var, String str) {
        TL_account.TL_businessChatLink c = c(str);
        if (c != null) {
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(c);
            arrayList.remove(c);
            nm7.f(this.a).k(nm7.J1, new Object[0]);
            byte b = 8;
            c41.b0(m51Var).U(jb6.M0(2131752668, null), true, new wc7(this, indexOf, c, b), new tv0(this, str, c, b)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, gx1 gx1Var) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.a).sendRequest(editbusinesschatlink, new eo0((Object) this, (Object) tL_businessChatLink, (Object) gx1Var, (byte) 9));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i);
            if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                if (!TextUtils.equals(tL_businessChatLink.link, "https://" + str)) {
                    if (!TextUtils.equals(tL_businessChatLink.link, "https://t.me/m/" + str)) {
                        if (TextUtils.equals(tL_businessChatLink.link, "tg://message?slug=" + str)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tL_businessChatLink;
    }

    public final void e(boolean z, boolean z2) {
        if (this.c) {
            return;
        }
        if (!this.d || (z2 && !z)) {
            this.c = true;
            int i = this.a;
            if (z) {
                cf7 Y = cf7.Y(i);
                Y.a.c(new np6((Object) this, (Object) Y, z2, (byte) 7));
            } else {
                ConnectionsManager.getInstance(i).sendRequest(new TL_account.getBusinessChatLinks(), new o51(this, (byte) 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.b);
        cf7 Y = cf7.Y(this.a);
        Y.a.c(new p51(Y, arrayList, (byte) 0));
    }
}
