// default package

import java.util.HashMap;
import org.telegram.utils.recorder.audio.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x20(Object obj, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l9c l9cVar;
        byte b = 1;
        switch (this.a) {
            case 0:
                i30 i30Var = (i30) this.d;
                long j = this.b;
                long j2 = this.c;
                if (i30Var.G == 7) {
                    long j3 = ((j - j2) * 48000) / 1000;
                    i30Var.p = j3;
                    i30Var.r = 0L;
                    i30Var.s = i30.r(j3);
                    i30Var.i();
                    break;
                }
                break;
            case 1:
                n20 n20Var = (n20) this.d;
                long j4 = this.b;
                long j5 = this.c;
                i30 i30Var2 = (i30) n20Var.c;
                if (j4 == i30Var2.o) {
                    i30Var2.n = null;
                    i30Var2.p += j5;
                    i30Var2.q = 0L;
                    i30Var2.i.removeCallbacks(i30Var2.D);
                    int i = i30Var2.G;
                    if (i != 10) {
                        if (i != 9) {
                            if (!i30Var2.v) {
                                if (i == 4) {
                                    g30 g30Var = i30Var2.z;
                                    if (g30Var != null) {
                                        long j6 = i30Var2.j();
                                        i30Var2.r = 0L;
                                        i30Var2.s = j6;
                                        i30Var2.j.execute(new c(i30Var2, g30Var, b));
                                        break;
                                    } else {
                                        i30Var2.g(new IllegalStateException("Output generation is missing"));
                                        break;
                                    }
                                }
                            } else {
                                i30Var2.v = false;
                                i30Var2.i();
                                break;
                            }
                        } else {
                            i30Var2.c();
                            i30Var2.t();
                            break;
                        }
                    } else {
                        i30Var2.c();
                        i30Var2.t();
                        i30Var2.l("cancelled");
                        break;
                    }
                }
                break;
            case 2:
                ((g92) this.d).i0(this.b, this.c);
                break;
            case 3:
                bn3 bn3Var = (bn3) this.d;
                long j7 = this.b;
                bn3Var.l(j7, Math.max(120L, this.c - j7));
                break;
            case 4:
                uc7 uc7Var = (uc7) this.d;
                long j8 = this.b;
                long j9 = this.c;
                zh6 zh6Var = uc7Var.J1;
                HashMap hashMap = uc7Var.L1;
                if (j8 == 0) {
                    nc7 nc7Var = (nc7) zh6Var.f(j9);
                    if (nc7Var != null) {
                        uc7Var.P(nc7Var);
                        uc7Var.I1.remove(nc7Var);
                        zh6Var.l(j9);
                        break;
                    }
                } else {
                    String str = j9 + "_" + j8;
                    nc7 nc7Var2 = (nc7) hashMap.get(str);
                    if (nc7Var2 != null) {
                        uc7Var.P(nc7Var2);
                        uc7Var.K1.remove(nc7Var2);
                        hashMap.remove(str);
                        break;
                    }
                }
                break;
            default:
                ixc ixcVar = (ixc) this.d;
                long j10 = this.b;
                long j11 = this.c;
                ixcVar.h = j10;
                ixcVar.n = j11;
                wa waVar = ixcVar.a;
                if (waVar != null && (l9cVar = waVar.g3) != null && waVar.H) {
                    l9cVar.O(true);
                    break;
                }
                break;
        }
    }
}
