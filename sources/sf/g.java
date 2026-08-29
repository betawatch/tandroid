package sf;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public g(int i10) {
        this.a = i10;
    }

    public static g a(int i10) {
        g gVar;
        g gVar2 = g[i10];
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (h[i10]) {
            try {
                gVar = g[i10];
                if (gVar == null) {
                    g[] gVarArr = g;
                    g gVar3 = new g(i10);
                    gVarArr[i10] = gVar3;
                    gVar = gVar3;
                }
            } catch (Throwable th2) {
                throw th2;
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
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new ef.a(this, 23));
        } else if (z10) {
            d();
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            } else {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.c);
                }
                i10++;
            }
        }
    }
}
