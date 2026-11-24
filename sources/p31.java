// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p31 {
    public static volatile p31[] g = new p31[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public long b;
    public TL_account.connectedBots c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i = 0; i < 4; i++) {
            h[i] = new Object();
        }
    }

    public p31(int i) {
        this.a = i;
    }

    public static p31 a(int i) {
        p31 p31Var;
        p31 p31Var2 = g[i];
        if (p31Var2 != null) {
            return p31Var2;
        }
        synchronized (h[i]) {
            p31Var = g[i];
            if (p31Var == null) {
                p31[] p31VarArr = g;
                p31 p31Var3 = new p31(i);
                p31VarArr[i] = p31Var3;
                p31Var = p31Var3;
            }
        }
        return p31Var;
    }

    public final void b() {
        this.f = false;
        c(null);
    }

    public final void c(p8c p8cVar) {
        boolean z;
        if (p8cVar != null) {
            this.d.add(p8cVar);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new tf(this, (byte) 8));
        } else if (z) {
            d();
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                arrayList.clear();
                kk7.f(this.a).k(kk7.b4, new Object[0]);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((p8c) arrayList.get(i)).a(this.c);
                }
                i++;
            }
        }
    }
}
