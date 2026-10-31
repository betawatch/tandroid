package ra;

import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        sa.a t02;
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
                        m4.c r10 = m4.c.r(hVar.a);
                        try {
                            t02 = cVar.c.t0();
                            if (r10 != null) {
                                r10.u0();
                            }
                        } catch (Throwable th2) {
                            if (r10 != null) {
                                r10.u0();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i12 = t02.b;
                    if (!(i12 == 5)) {
                        if (!(i12 == 3)) {
                            if (cVar.d.a(t02)) {
                                i10 = cVar.c(t02);
                                cVar.f(i10);
                                cVar.m(t02, i10);
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
                    i10 = cVar.i(t02);
                    cVar.f(i10);
                    cVar.m(t02, i10);
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
