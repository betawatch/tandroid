package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class u6 extends rg.a {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public u6(int i7, String str) {
        super(i7, true);
        this.c = -1;
        this.d = str;
    }

    public static u6 b(int i7, long j3, String str, int i10) {
        u6 u6Var = new u6(11);
        u6Var.f = i7;
        u6Var.d = str;
        u6Var.g = j3;
        u6Var.h = i10;
        u6Var.j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || u6.class != obj.getClass()) {
                return false;
            }
            u6 u6Var = (u6) obj;
            int i7 = this.a;
            if (i7 != u6Var.a) {
                return false;
            }
            if (i7 != 9 && i7 != 10 && i7 != 8 && i7 != 4 && i7 != 2 && i7 != 0 && i7 != 13) {
                if (i7 == 3) {
                    return Objects.equals(this.d, u6Var.d);
                }
                if (i7 == 1) {
                    return Objects.equals(this.e, u6Var.e);
                }
                if (i7 == 11) {
                    if (this.f != u6Var.f || this.g != u6Var.g) {
                        return false;
                    }
                } else if (i7 != 7 || this.c != u6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public u6(int i7, int i10) {
        super(7, true);
        this.c = i7;
    }

    public u6(int i7) {
        super(i7, true);
        this.c = -1;
    }
}
