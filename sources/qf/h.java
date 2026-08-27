package qf;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h {
    public static volatile h[] g = new h[4];
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

    public h(int i10) {
        this.a = i10;
    }

    public static h a(int i10) {
        h hVar;
        h hVar2 = g[i10];
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (h[i10]) {
            try {
                hVar = g[i10];
                if (hVar == null) {
                    h[] hVarArr = g;
                    h hVar3 = new h(i10);
                    hVarArr[i10] = hVar3;
                    hVar = hVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
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
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new cf.a(this, 23));
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
