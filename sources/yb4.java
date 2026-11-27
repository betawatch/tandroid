// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class yb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zb4 b;

    public /* synthetic */ yb4(zb4 zb4Var, byte b) {
        this.a = b;
        this.b = zb4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r6 < r8) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111 A[LOOP:1: B:81:0x0107->B:83:0x0111, LOOP_END] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hb4 hb4Var;
        int i;
        int i2;
        byte b = this.a;
        zb4 zb4Var = this.b;
        switch (b) {
            case 0:
                zb4Var.b(false);
                break;
            default:
                boolean z = zb4Var.b;
                int i3 = zb4Var.a;
                int f = (z ? uc7.s1(i3).k4.n3 : uc7.s1(i3).k4.o3).f();
                ((ArrayList) zb4Var.e).clear();
                if (zb4Var.b && !((ArrayList) zb4Var.d).isEmpty()) {
                    hb4Var = (hb4) ((ArrayList) zb4Var.d).get(0);
                    if (hb4Var.j && hb4Var.W0 >= 1048576 && !hb4Var.a && hb4Var.Y != 3) {
                        if (hb4Var.k) {
                            long j = hb4Var.a0;
                            int i4 = hb4Var.J;
                            if (i4 <= 0) {
                                i4 = 1048576;
                            }
                            break;
                        }
                        ((to3) zb4Var.f).a((yb4) zb4Var.g);
                        ((to3) zb4Var.f).d((yb4) zb4Var.g, 250L);
                        i = 0;
                        boolean z2 = false;
                        int i5 = 0;
                        while (i < ((ArrayList) zb4Var.d).size()) {
                            hb4 hb4Var2 = i > 0 ? (hb4) ((ArrayList) zb4Var.d).get(i - 1) : null;
                            hb4 hb4Var3 = (hb4) ((ArrayList) zb4Var.d).get(i);
                            if (hb4Var == null || hb4Var3 == hb4Var || (hb4Var3.p0 == hb4Var.p0 && pq3.d())) {
                                if (i > 0 && !z2) {
                                    if (zb4Var.b && hb4Var2 != null && hb4Var2.j && hb4Var2.W0 >= 1048576 && hb4Var3.W0 <= 0) {
                                        z2 = true;
                                    }
                                    if (i5 > 0 && hb4Var3.W0 == 0) {
                                        z2 = true;
                                    }
                                }
                                if (hb4Var3.a) {
                                    f++;
                                } else {
                                    if (!z2 && i < f) {
                                        ((ArrayList) zb4Var.e).add(hb4Var3);
                                    } else if (hb4Var3.S && !hb4Var3.Z) {
                                        hb4Var3.j();
                                    }
                                    i5 = hb4Var3.W0;
                                }
                            } else if (hb4Var3.S && !hb4Var3.Z) {
                                hb4Var3.j();
                            }
                            i++;
                        }
                        for (i2 = 0; i2 < ((ArrayList) zb4Var.e).size(); i2++) {
                            ((hb4) ((ArrayList) zb4Var.e).get(i2)).p();
                        }
                        zb4Var.c = false;
                        break;
                    }
                }
                hb4Var = null;
                i = 0;
                boolean z22 = false;
                int i52 = 0;
                while (i < ((ArrayList) zb4Var.d).size()) {
                }
                while (i2 < ((ArrayList) zb4Var.e).size()) {
                }
                zb4Var.c = false;
                break;
        }
    }
}
