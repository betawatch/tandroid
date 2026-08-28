package y9;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ b(c cVar, int i9) {
        this.a = i9;
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
        z9.a k10;
        z9.a i9;
        int i10;
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            case 1:
                c cVar = this.b;
                synchronized (c.m) {
                    try {
                        s8.h hVar = cVar.a;
                        hVar.a();
                        w4.e a2 = w4.e.a(hVar.a);
                        try {
                            k10 = cVar.c.k();
                            if (a2 != null) {
                                a2.l();
                            }
                        } catch (Throwable th) {
                            if (a2 != null) {
                                a2.l();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i11 = k10.b;
                    if (!(i11 == 5)) {
                        if (!(i11 == 3)) {
                            if (cVar.d.a(k10)) {
                                i9 = cVar.c(k10);
                                cVar.f(i9);
                                cVar.m(k10, i9);
                                if (i9.b == 4) {
                                    cVar.l(i9.a);
                                }
                                i10 = i9.b;
                                if (i10 != 5) {
                                    cVar.j(new e());
                                    return;
                                } else if (i10 == 2 || i10 == 1) {
                                    cVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.k(i9);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    i9 = cVar.i(k10);
                    cVar.f(i9);
                    cVar.m(k10, i9);
                    if (i9.b == 4) {
                    }
                    i10 = i9.b;
                    if (i10 != 5) {
                    }
                } catch (e e10) {
                    cVar.j(e10);
                    return;
                }
            default:
                this.b.b();
                return;
        }
    }
}
