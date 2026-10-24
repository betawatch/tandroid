package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class x6 extends pg.a {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public x6(int i10, String str) {
        super(i10, true);
        this.c = -1;
        this.d = str;
    }

    public static x6 b(int i10, long j10, String str, int i11) {
        x6 x6Var = new x6(11);
        x6Var.f = i10;
        x6Var.d = str;
        x6Var.g = j10;
        x6Var.h = i11;
        x6Var.j = false;
        return x6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || x6.class != obj.getClass()) {
                return false;
            }
            x6 x6Var = (x6) obj;
            int i10 = this.a;
            if (i10 != x6Var.a) {
                return false;
            }
            if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                if (i10 == 3) {
                    return Objects.equals(this.d, x6Var.d);
                }
                if (i10 == 1) {
                    return Objects.equals(this.e, x6Var.e);
                }
                if (i10 == 11) {
                    if (this.f != x6Var.f || this.g != x6Var.g) {
                        return false;
                    }
                } else if (i10 != 7 || this.c != x6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public x6(int i10, int i11) {
        super(7, true);
        this.c = i10;
    }

    public x6(int i10) {
        super(i10, true);
        this.c = -1;
    }
}
