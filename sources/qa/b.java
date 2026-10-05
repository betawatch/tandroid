package qa;

import java.io.IOException;
import n7.z0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        ra.b y3;
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
                        z0 e7 = z0.e(hVar.a);
                        try {
                            y3 = cVar.c.y();
                            if (e7 != null) {
                                e7.z();
                            }
                        } catch (Throwable th2) {
                            if (e7 != null) {
                                e7.z();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i12 = y3.b;
                    if (!(i12 == 5)) {
                        if (!(i12 == 3)) {
                            if (cVar.d.a(y3)) {
                                i10 = cVar.c(y3);
                                cVar.f(i10);
                                cVar.m(y3, i10);
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
                    i10 = cVar.i(y3);
                    cVar.f(i10);
                    cVar.m(y3, i10);
                    if (i10.b == 4) {
                    }
                    i11 = i10.b;
                    if (i11 != 5) {
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
