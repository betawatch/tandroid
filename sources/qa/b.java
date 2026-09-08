package qa;

import java.io.IOException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        ra.b F;
        ra.b i10;
        int i11;
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            case 1:
                c cVar = this.b;
                synchronized (c.m) {
                    try {
                        k9.h hVar = cVar.a;
                        hVar.a();
                        o0.a d = o0.a.d(hVar.a);
                        try {
                            F = cVar.c.F();
                            if (d != null) {
                                d.J();
                            }
                        } catch (Throwable th2) {
                            if (d != null) {
                                d.J();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i12 = F.b;
                    if (!(i12 == 5)) {
                        if (!(i12 == 3)) {
                            if (cVar.d.a(F)) {
                                i10 = cVar.c(F);
                                cVar.f(i10);
                                cVar.m(F, i10);
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
                    i10 = cVar.i(F);
                    cVar.f(i10);
                    cVar.m(F, i10);
                    if (i10.b == 4) {
                    }
                    i11 = i10.b;
                    if (i11 != 5) {
                    }
                } catch (e e7) {
                    cVar.j(e7);
                    return;
                }
            default:
                this.b.b();
                return;
        }
    }
}
