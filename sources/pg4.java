// default package

import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class pg4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qg4 b;

    public /* synthetic */ pg4(qg4 qg4Var, byte b) {
        this.a = b;
        this.b = qg4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ga0 g0;
        ga0 j;
        int i;
        byte b = this.a;
        qg4 qg4Var = this.b;
        switch (b) {
            case 0:
                qg4Var.c();
                return;
            case 1:
                qg4Var.c();
                return;
            default:
                synchronized (qg4.l) {
                    jg4 jg4Var = qg4Var.a;
                    jg4Var.a();
                    tg2 l = tg2.l(jg4Var.a);
                    try {
                        g0 = qg4Var.c.g0();
                    } finally {
                        if (l != null) {
                            l.W();
                        }
                    }
                }
                try {
                    int i2 = g0.b;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (qg4Var.d.a(g0)) {
                                j = qg4Var.d(g0);
                                qg4Var.g(j);
                                qg4Var.b(g0, j);
                                if (j.b == 4) {
                                    qg4Var.m(j.a);
                                }
                                i = j.b;
                                if (i != 5) {
                                    qg4Var.k(new sg4());
                                    return;
                                } else if (i == 2 || i == 1) {
                                    qg4Var.k(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    qg4Var.l(j);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    j = qg4Var.j(g0);
                    qg4Var.g(j);
                    qg4Var.b(g0, j);
                    if (j.b == 4) {
                    }
                    i = j.b;
                    if (i != 5) {
                    }
                } catch (sg4 e) {
                    qg4Var.k(e);
                    return;
                }
        }
    }
}
