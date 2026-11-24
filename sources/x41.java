// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x41 {
    public static volatile x41[] g = new x41[4];
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

    public x41(int i) {
        this.a = i;
    }

    public static x41 a(int i) {
        x41 x41Var;
        x41 x41Var2 = g[i];
        if (x41Var2 != null) {
            return x41Var2;
        }
        synchronized (h[i]) {
            x41Var = g[i];
            if (x41Var == null) {
                x41[] x41VarArr = g;
                x41 x41Var3 = new x41(i);
                x41VarArr[i] = x41Var3;
                x41Var = x41Var3;
            }
        }
        return x41Var;
    }

    public final void b() {
        this.f = false;
        c(null);
    }

    public final void c(qac qacVar) {
        boolean z;
        if (qacVar != null) {
            this.d.add(qacVar);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new tg(this, (byte) 8));
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
                nm7.f(this.a).k(nm7.d4, new Object[0]);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((qac) arrayList.get(i)).a(this.c);
                }
                i++;
            }
        }
    }
}
