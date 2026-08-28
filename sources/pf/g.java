package pf;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g {
    public static volatile g[] g = new g[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public long b;
    public TL_account.connectedBots c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            h[i9] = new Object();
        }
    }

    public g(int i9) {
        this.a = i9;
    }

    public static g a(int i9) {
        g gVar;
        g gVar2 = g[i9];
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (h[i9]) {
            try {
                gVar = g[i9];
                if (gVar == null) {
                    g[] gVarArr = g;
                    g gVar3 = new g(i9);
                    gVarArr[i9] = gVar3;
                    gVar = gVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public final void b() {
        this.f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z10 = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new bf.a(this, 23));
        } else if (z10) {
            d();
        }
    }

    public final void d() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 >= arrayList.size()) {
                arrayList.clear();
                NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            } else {
                if (arrayList.get(i9) != null) {
                    ((Utilities.Callback) arrayList.get(i9)).run(this.c);
                }
                i9++;
            }
        }
    }
}
