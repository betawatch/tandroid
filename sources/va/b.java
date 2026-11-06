package va;

import java.io.IOException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ b(c cVar, int i7) {
        this.a = i7;
        this.b = cVar;
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
        wa.b d;
        wa.b j3;
        int i7;
        switch (this.a) {
            case 0:
                this.b.c();
                return;
            case 1:
                this.b.c();
                return;
            default:
                c cVar = this.b;
                synchronized (c.m) {
                    try {
                        o9.g gVar = cVar.a;
                        gVar.a();
                        v6.e a10 = v6.e.a(gVar.a);
                        try {
                            d = cVar.c.d();
                            if (a10 != null) {
                                a10.e();
                            }
                        } catch (Throwable th2) {
                            if (a10 != null) {
                                a10.e();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i10 = d.b;
                    if (!(i10 == 5)) {
                        if (!(i10 == 3)) {
                            if (cVar.d.a(d)) {
                                j3 = cVar.d(d);
                                cVar.g(j3);
                                cVar.b(d, j3);
                                if (j3.b == 4) {
                                    cVar.m(j3.a);
                                }
                                i7 = j3.b;
                                if (i7 != 5) {
                                    cVar.k(new e());
                                    return;
                                } else if (i7 == 2 || i7 == 1) {
                                    cVar.k(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.l(j3);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    j3 = cVar.j(d);
                    cVar.g(j3);
                    cVar.b(d, j3);
                    if (j3.b == 4) {
                    }
                    i7 = j3.b;
                    if (i7 != 5) {
                    }
                } catch (e e10) {
                    cVar.k(e10);
                    return;
                }
        }
    }
}
