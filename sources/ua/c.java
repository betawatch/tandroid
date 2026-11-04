package ua;

import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i3) {
        this.a = i3;
        this.b = dVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        va.b e02;
        va.b j10;
        int i3;
        switch (this.a) {
            case 0:
                this.b.c();
                return;
            case 1:
                this.b.c();
                return;
            default:
                d dVar = this.b;
                synchronized (d.m) {
                    try {
                        n9.h hVar = dVar.a;
                        hVar.a();
                        b a10 = b.a(hVar.a);
                        try {
                            e02 = dVar.c.e0();
                            if (a10 != null) {
                                a10.b();
                            }
                        } catch (Throwable th2) {
                            if (a10 != null) {
                                a10.b();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i10 = e02.b;
                    if (!(i10 == 5)) {
                        if (!(i10 == 3)) {
                            if (dVar.d.a(e02)) {
                                j10 = dVar.d(e02);
                                dVar.g(j10);
                                dVar.b(e02, j10);
                                if (j10.b == 4) {
                                    dVar.m(j10.a);
                                }
                                i3 = j10.b;
                                if (i3 != 5) {
                                    dVar.k(new f());
                                    return;
                                } else if (i3 == 2 || i3 == 1) {
                                    dVar.k(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    dVar.l(j10);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    j10 = dVar.j(e02);
                    dVar.g(j10);
                    dVar.b(e02, j10);
                    if (j10.b == 4) {
                    }
                    i3 = j10.b;
                    if (i3 != 5) {
                    }
                } catch (f e10) {
                    dVar.k(e10);
                    return;
                }
        }
    }
}
