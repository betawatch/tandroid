// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sf7 implements gu3 {
    public final xu7 a;
    public final tf7 b;
    public final String c;
    public final int d;
    public final String e;
    public wxb f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public sf7(String str, int i, String str2) {
        xu7 xu7Var = new xu7(4);
        this.a = xu7Var;
        xu7Var.a[0] = -1;
        this.b = new tf7();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // gu3
    public final void b(xu7 xu7Var) {
        this.f.getClass();
        while (xu7Var.a() > 0) {
            byte b = this.h;
            xu7 xu7Var2 = this.a;
            if (b == 0) {
                byte[] bArr = xu7Var.a;
                int i = xu7Var.b;
                int i2 = xu7Var.c;
                while (true) {
                    if (i >= i2) {
                        xu7Var.N(i2);
                        break;
                    }
                    byte b2 = bArr[i];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.k && (b2 & 224) == 224;
                    this.k = z;
                    if (z2) {
                        xu7Var.N(i + 1);
                        this.k = false;
                        xu7Var2.a[1] = bArr[i];
                        this.i = 2;
                        this.h = (byte) 1;
                        break;
                    }
                    i++;
                }
            } else if (b == 1) {
                int min = Math.min(xu7Var.a(), 4 - this.i);
                xu7Var.k(this.i, min, xu7Var2.a);
                int i3 = this.i + min;
                this.i = i3;
                if (i3 >= 4) {
                    xu7Var2.N(0);
                    int m = xu7Var2.m();
                    tf7 tf7Var = this.b;
                    if (tf7Var.a(m)) {
                        this.m = tf7Var.c;
                        if (!this.j) {
                            this.l = (tf7Var.g * 1000000) / tf7Var.d;
                            em4 em4Var = new em4();
                            em4Var.a = this.g;
                            em4Var.r = ud7.n(this.e);
                            em4Var.s = ud7.n(tf7Var.b);
                            em4Var.t = TLObject.FLAG_12;
                            em4Var.M = tf7Var.e;
                            em4Var.O = tf7Var.d;
                            em4Var.d = this.c;
                            em4Var.f = this.d;
                            this.f.g(new fm4(em4Var));
                            this.j = true;
                        }
                        xu7Var2.N(0);
                        this.f.e(4, xu7Var2);
                        this.h = (byte) 2;
                    } else {
                        this.i = 0;
                        this.h = (byte) 1;
                    }
                }
            } else {
                if (b != 2) {
                    sdb.a();
                    return;
                }
                int min2 = Math.min(xu7Var.a(), this.m - this.i);
                this.f.e(min2, xu7Var);
                int i4 = this.i + min2;
                this.i = i4;
                if (i4 >= this.m) {
                    gre.p(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = (byte) 0;
                }
            }
        }
    }

    @Override // gu3
    public final void d() {
        this.h = (byte) 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // gu3
    public final void g(int i, long j) {
        this.n = j;
    }

    @Override // gu3
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.g = l2cVar.e;
        l2cVar.b();
        this.f = l74Var.S(l2cVar.d, 1);
    }

    @Override // gu3
    public final void e() {
    }

    @Override // gu3
    public final void f() {
    }
}
