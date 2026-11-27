// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y31 {
    public static volatile y31[] g = new y31[4];
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

    public y31(int i) {
        this.a = i;
    }

    public static y31 a(int i) {
        y31 y31Var;
        y31 y31Var2 = g[i];
        if (y31Var2 != null) {
            return y31Var2;
        }
        synchronized (h[i]) {
            y31Var = g[i];
            if (y31Var == null) {
                y31[] y31VarArr = g;
                y31 y31Var3 = new y31(i);
                y31VarArr[i] = y31Var3;
                y31Var = y31Var3;
            }
        }
        return y31Var;
    }

    public final void b() {
        this.f = false;
        c(null);
    }

    public final void c(pcc pccVar) {
        boolean z;
        if (pccVar != null) {
            this.d.add(pccVar);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new ye(this, (byte) 8));
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
                jn7.f(this.a).k(jn7.c4, new Object[0]);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((pcc) arrayList.get(i)).a(this.c);
                }
                i++;
            }
        }
    }
}
