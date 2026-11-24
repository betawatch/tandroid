// default package

import java.util.HashMap;
import org.telegram.utils.recorder.audio.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w20(Object obj, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l5c l5cVar;
        byte b = 1;
        switch (this.a) {
            case 0:
                h30 h30Var = (h30) this.d;
                long j = this.b;
                long j2 = this.c;
                if (h30Var.G == 7) {
                    long j3 = ((j - j2) * 48000) / 1000;
                    h30Var.p = j3;
                    h30Var.r = 0L;
                    h30Var.s = h30.r(j3);
                    h30Var.i();
                    break;
                }
                break;
            case 1:
                m20 m20Var = (m20) this.d;
                long j4 = this.b;
                long j5 = this.c;
                h30 h30Var2 = (h30) m20Var.c;
                if (j4 == h30Var2.o) {
                    h30Var2.n = null;
                    h30Var2.p += j5;
                    h30Var2.q = 0L;
                    h30Var2.i.removeCallbacks(h30Var2.D);
                    int i = h30Var2.G;
                    if (i != 10) {
                        if (i != 9) {
                            if (!h30Var2.v) {
                                if (i == 4) {
                                    f30 f30Var = h30Var2.z;
                                    if (f30Var != null) {
                                        long j6 = h30Var2.j();
                                        h30Var2.r = 0L;
                                        h30Var2.s = j6;
                                        h30Var2.j.execute(new c(h30Var2, f30Var, b));
                                        break;
                                    } else {
                                        h30Var2.g(new IllegalStateException("Output generation is missing"));
                                        break;
                                    }
                                }
                            } else {
                                h30Var2.v = false;
                                h30Var2.i();
                                break;
                            }
                        } else {
                            h30Var2.c();
                            h30Var2.t();
                            break;
                        }
                    } else {
                        h30Var2.c();
                        h30Var2.t();
                        h30Var2.l("cancelled");
                        break;
                    }
                }
                break;
            case 2:
                ((p82) this.d).i0(this.b, this.c);
                break;
            case 3:
                jm3 jm3Var = (jm3) this.d;
                long j7 = this.b;
                jm3Var.j(j7, Math.max(120L, this.c - j7));
                break;
            case 4:
                na7 na7Var = (na7) this.d;
                long j8 = this.b;
                long j9 = this.c;
                vf6 vf6Var = na7Var.J1;
                HashMap hashMap = na7Var.L1;
                if (j8 == 0) {
                    ga7 ga7Var = (ga7) vf6Var.f(j9);
                    if (ga7Var != null) {
                        na7Var.N(ga7Var);
                        na7Var.I1.remove(ga7Var);
                        vf6Var.l(j9);
                        break;
                    }
                } else {
                    String str = j9 + "_" + j8;
                    ga7 ga7Var2 = (ga7) hashMap.get(str);
                    if (ga7Var2 != null) {
                        na7Var.N(ga7Var2);
                        na7Var.K1.remove(ga7Var2);
                        hashMap.remove(str);
                        break;
                    }
                }
                break;
            default:
                tsc tscVar = (tsc) this.d;
                long j10 = this.b;
                long j11 = this.c;
                tscVar.h = j10;
                tscVar.n = j11;
                va vaVar = tscVar.a;
                if (vaVar != null && (l5cVar = vaVar.g3) != null && vaVar.H) {
                    l5cVar.O(true);
                    break;
                }
                break;
        }
    }
}
