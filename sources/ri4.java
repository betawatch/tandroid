// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ri4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ si4 b;

    public /* synthetic */ ri4(si4 si4Var, byte b) {
        this.a = b;
        this.b = si4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        gb0 x;
        gb0 j;
        int i;
        byte b = this.a;
        si4 si4Var = this.b;
        switch (b) {
            case 0:
                si4Var.c();
                return;
            case 1:
                si4Var.c();
                return;
            default:
                synchronized (si4.l) {
                    li4 li4Var = si4Var.a;
                    li4Var.a();
                    lx6 d = lx6.d(li4Var.a);
                    try {
                        x = si4Var.c.x();
                    } finally {
                        if (d != null) {
                            d.L();
                        }
                    }
                }
                try {
                    int i2 = x.b;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (si4Var.d.a(x)) {
                                j = si4Var.d(x);
                                si4Var.g(j);
                                si4Var.b(x, j);
                                if (j.b == 4) {
                                    si4Var.m(j.a);
                                }
                                i = j.b;
                                if (i != 5) {
                                    si4Var.k(new ui4());
                                    return;
                                } else if (i == 2 || i == 1) {
                                    si4Var.k(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    si4Var.l(j);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    j = si4Var.j(x);
                    si4Var.g(j);
                    si4Var.b(x, j);
                    if (j.b == 4) {
                    }
                    i = j.b;
                    if (i != 5) {
                    }
                } catch (ui4 e) {
                    si4Var.k(e);
                    return;
                }
        }
    }
}
