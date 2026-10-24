package ra;

import java.io.IOException;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ b(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        sa.a Q;
        sa.a i10;
        int i11;
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            case 1:
                c cVar = this.b;
                synchronized (c.m) {
                    try {
                        l9.h hVar = cVar.a;
                        hVar.a();
                        n2.e f7 = n2.e.f(hVar.a);
                        try {
                            Q = cVar.c.Q();
                            if (f7 != null) {
                                f7.R();
                            }
                        } catch (Throwable th2) {
                            if (f7 != null) {
                                f7.R();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i12 = Q.b;
                    if (!(i12 == 5)) {
                        if (!(i12 == 3)) {
                            if (cVar.d.a(Q)) {
                                i10 = cVar.c(Q);
                                cVar.f(i10);
                                cVar.m(Q, i10);
                                if (i10.b == 4) {
                                    cVar.l(i10.a);
                                }
                                i11 = i10.b;
                                if (i11 != 5) {
                                    cVar.j(new e());
                                    return;
                                } else if (i11 == 2 || i11 == 1) {
                                    cVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.k(i10);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    i10 = cVar.i(Q);
                    cVar.f(i10);
                    cVar.m(Q, i10);
                    if (i10.b == 4) {
                    }
                    i11 = i10.b;
                    if (i11 != 5) {
                    }
                } catch (e e) {
                    cVar.j(e);
                    return;
                }
            default:
                this.b.b();
                return;
        }
    }
}
