package w3;

import h3.s0;
import h3.t0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        this.g = new m3.w[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // w3.h
    public final void b(d5.z zVar) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (zVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (zVar.r() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z11 = this.b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.d == 1) {
                        if (zVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (zVar.r() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z10 = this.b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = zVar.b;
                    int a2 = zVar.a();
                    for (m3.w wVar : (m3.w[]) this.g) {
                        zVar.C(i10);
                        wVar.a(a2, zVar);
                    }
                    this.e += a2;
                    break;
                }
                break;
            default:
                d5.z zVar2 = (d5.z) this.f;
                d5.a.j((m3.w) this.g);
                if (this.b) {
                    int a3 = zVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a3, 10 - i11);
                        System.arraycopy(zVar.a, zVar.b, zVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            zVar2.C(0);
                            if (73 != zVar2.r() || 68 != zVar2.r() || 51 != zVar2.r()) {
                                d5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                zVar2.D(3);
                                this.d = zVar2.q() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a3, this.d - this.e);
                    ((m3.w) this.g).a(min2, zVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // w3.h
    public final void c() {
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

    @Override // w3.h
    public final void d() {
        int i10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.c != -9223372036854775807L) {
                        for (m3.w wVar : (m3.w[]) this.g) {
                            wVar.e(this.c, 1, this.e, 0, null);
                        }
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                d5.a.j((m3.w) this.g);
                if (this.b && (i10 = this.d) != 0 && this.e == i10) {
                    long j10 = this.c;
                    if (j10 != -9223372036854775807L) {
                        ((m3.w) this.g).e(j10, 1, i10, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        switch (this.a) {
            case 0:
                m3.w[] wVarArr = (m3.w[]) this.g;
                for (int i10 = 0; i10 < wVarArr.length; i10++) {
                    d0 d0Var = (d0) ((List) this.f).get(i10);
                    e0Var.a();
                    e0Var.b();
                    m3.w C = mVar.C(e0Var.d, 3);
                    s0 s0Var = new s0();
                    e0Var.b();
                    s0Var.a = e0Var.e;
                    s0Var.o = "application/dvbsubs";
                    s0Var.q = Collections.singletonList(d0Var.b);
                    s0Var.c = d0Var.a;
                    C.c(new t0(s0Var));
                    wVarArr[i10] = C;
                }
                break;
            default:
                e0Var.a();
                e0Var.b();
                m3.w C2 = mVar.C(e0Var.d, 5);
                this.g = C2;
                s0 s0Var2 = new s0();
                e0Var.b();
                s0Var2.a = e0Var.e;
                s0Var2.o = "application/id3";
                C2.c(new t0(s0Var2));
                break;
        }
    }

    @Override // w3.h
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
        this.f = new d5.z(10);
        this.c = -9223372036854775807L;
    }
}
