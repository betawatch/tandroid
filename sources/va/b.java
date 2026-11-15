package va;

import java.io.IOException;
import tg.x;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        wa.b f10;
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
                        x a10 = x.a(gVar.a);
                        try {
                            f10 = cVar.c.f();
                            if (a10 != null) {
                                a10.g();
                            }
                        } catch (Throwable th2) {
                            if (a10 != null) {
                                a10.g();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i10 = f10.b;
                    if (!(i10 == 5)) {
                        if (!(i10 == 3)) {
                            if (cVar.d.a(f10)) {
                                j3 = cVar.d(f10);
                                cVar.g(j3);
                                cVar.b(f10, j3);
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
                    j3 = cVar.j(f10);
                    cVar.g(j3);
                    cVar.b(f10, j3);
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
