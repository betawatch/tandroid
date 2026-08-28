package w3;

import h3.s0;
import h3.t0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final void g(d5.y yVar) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (yVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (yVar.r() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z11 = this.b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.d == 1) {
                        if (yVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (yVar.r() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z10 = this.b;
                        }
                        if (!z10) {
                        }
                    }
                    int i9 = yVar.b;
                    int a2 = yVar.a();
                    for (m3.w wVar : (m3.w[]) this.g) {
                        yVar.C(i9);
                        wVar.a(a2, yVar);
                    }
                    this.e += a2;
                    break;
                }
                break;
            default:
                d5.y yVar2 = (d5.y) this.f;
                d5.a.j((m3.w) this.g);
                if (this.b) {
                    int a3 = yVar.a();
                    int i10 = this.e;
                    if (i10 < 10) {
                        int min = Math.min(a3, 10 - i10);
                        System.arraycopy(yVar.a, yVar.b, yVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            yVar2.C(0);
                            if (73 != yVar2.r() || 68 != yVar2.r() || 51 != yVar2.r()) {
                                d5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                yVar2.D(3);
                                this.d = yVar2.q() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a3, this.d - this.e);
                    ((m3.w) this.g).a(min2, yVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // w3.h
    public final void h() {
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
    public final void i() {
        int i9;
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
                if (this.b && (i9 = this.d) != 0 && this.e == i9) {
                    long j10 = this.c;
                    if (j10 != -9223372036854775807L) {
                        ((m3.w) this.g).e(j10, 1, i9, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // w3.h
    public final void j(m3.m mVar, d0 d0Var) {
        switch (this.a) {
            case 0:
                m3.w[] wVarArr = (m3.w[]) this.g;
                for (int i9 = 0; i9 < wVarArr.length; i9++) {
                    c0 c0Var = (c0) ((List) this.f).get(i9);
                    d0Var.a();
                    d0Var.b();
                    m3.w I = mVar.I(d0Var.d, 3);
                    s0 s0Var = new s0();
                    d0Var.b();
                    s0Var.a = d0Var.e;
                    s0Var.o = "application/dvbsubs";
                    s0Var.q = Collections.singletonList(c0Var.b);
                    s0Var.c = c0Var.a;
                    I.c(new t0(s0Var));
                    wVarArr[i9] = I;
                }
                break;
            default:
                d0Var.a();
                d0Var.b();
                m3.w I2 = mVar.I(d0Var.d, 5);
                this.g = I2;
                s0 s0Var2 = new s0();
                d0Var.b();
                s0Var2.a = d0Var.e;
                s0Var2.o = "application/id3";
                I2.c(new t0(s0Var2));
                break;
        }
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        switch (this.a) {
            case 0:
                if ((i9 & 4) != 0) {
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
                if ((i9 & 4) != 0) {
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
        this.f = new d5.y(10);
        this.c = -9223372036854775807L;
    }
}
