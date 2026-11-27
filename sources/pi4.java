// default package

import java.io.IOException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class pi4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qi4 b;

    public /* synthetic */ pi4(qi4 qi4Var, byte b) {
        this.a = b;
        this.b = qi4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ia0 F0;
        ia0 j;
        int i;
        byte b = this.a;
        qi4 qi4Var = this.b;
        switch (b) {
            case 0:
                qi4Var.c();
                return;
            case 1:
                qi4Var.c();
                return;
            default:
                synchronized (qi4.l) {
                    ji4 ji4Var = qi4Var.a;
                    ji4Var.a();
                    lh2 e = lh2.e(ji4Var.a);
                    try {
                        F0 = qi4Var.c.F0();
                    } finally {
                        if (e != null) {
                            e.Q();
                        }
                    }
                }
                try {
                    int i2 = F0.b;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (qi4Var.d.a(F0)) {
                                j = qi4Var.d(F0);
                                qi4Var.g(j);
                                qi4Var.b(F0, j);
                                if (j.b == 4) {
                                    qi4Var.m(j.a);
                                }
                                i = j.b;
                                if (i != 5) {
                                    qi4Var.k(new si4());
                                    return;
                                } else if (i == 2 || i == 1) {
                                    qi4Var.k(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    qi4Var.l(j);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    j = qi4Var.j(F0);
                    qi4Var.g(j);
                    qi4Var.b(F0, j);
                    if (j.b == 4) {
                    }
                    i = j.b;
                    if (i != 5) {
                    }
                } catch (si4 e2) {
                    qi4Var.k(e2);
                    return;
                }
        }
    }
}
