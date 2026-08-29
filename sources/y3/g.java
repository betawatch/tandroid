package y3;

import j3.s0;
import j3.t0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g implements h {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public g(List list) {
        this.a = 0;
        this.f = list;
        this.g = new o3.w[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // y3.h
    public final void a() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // y3.h
    public final void c(f5.w wVar) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (wVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (wVar.r() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z11 = this.b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.d == 1) {
                        if (wVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (wVar.r() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z10 = this.b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = wVar.b;
                    int a2 = wVar.a();
                    for (o3.w wVar2 : (o3.w[]) this.g) {
                        wVar.C(i10);
                        wVar2.e(a2, wVar);
                    }
                    this.e += a2;
                    break;
                }
                break;
            default:
                f5.w wVar3 = (f5.w) this.f;
                f5.a.j((o3.w) this.g);
                if (this.b) {
                    int a10 = wVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(wVar.a, wVar.b, wVar3.a, this.e, min);
                        if (this.e + min == 10) {
                            wVar3.C(0);
                            if (73 != wVar3.r() || 68 != wVar3.r() || 51 != wVar3.r()) {
                                f5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                wVar3.D(3);
                                this.d = wVar3.q() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((o3.w) this.g).e(min2, wVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // y3.h
    public final void d() {
        int i10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.c != -9223372036854775807L) {
                        for (o3.w wVar : (o3.w[]) this.g) {
                            wVar.c(this.c, 1, this.e, 0, null);
                        }
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                f5.a.j((o3.w) this.g);
                if (this.b && (i10 = this.d) != 0 && this.e == i10) {
                    long j10 = this.c;
                    if (j10 != -9223372036854775807L) {
                        ((o3.w) this.g).c(j10, 1, i10, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // y3.h
    public final void e(o3.m mVar, d0 d0Var) {
        switch (this.a) {
            case 0:
                o3.w[] wVarArr = (o3.w[]) this.g;
                for (int i10 = 0; i10 < wVarArr.length; i10++) {
                    c0 c0Var = (c0) ((List) this.f).get(i10);
                    d0Var.a();
                    d0Var.b();
                    o3.w Z1 = mVar.Z1(d0Var.d, 3);
                    s0 s0Var = new s0();
                    d0Var.b();
                    s0Var.a = d0Var.e;
                    s0Var.o = "application/dvbsubs";
                    s0Var.q = Collections.singletonList(c0Var.b);
                    s0Var.c = c0Var.a;
                    Z1.b(new t0(s0Var));
                    wVarArr[i10] = Z1;
                }
                break;
            default:
                d0Var.a();
                d0Var.b();
                o3.w Z12 = mVar.Z1(d0Var.d, 5);
                this.g = Z12;
                s0 s0Var2 = new s0();
                d0Var.b();
                s0Var2.a = d0Var.e;
                s0Var2.o = "application/id3";
                Z12.b(new t0(s0Var2));
                break;
        }
    }

    @Override // y3.h
    public final void f(int i10, long j10) {
        switch (this.a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.b = true;
                    if (j10 != -9223372036854775807L) {
                        this.c = j10;
                    }
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.b = true;
                    if (j10 != -9223372036854775807L) {
                        this.c = j10;
                    }
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public g() {
        this.a = 1;
        this.f = new f5.w(10);
        this.c = -9223372036854775807L;
    }
}
