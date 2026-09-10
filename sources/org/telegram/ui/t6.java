package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t6 extends ng.a {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public t6(int i10, String str) {
        super(i10, true);
        this.c = -1;
        this.d = str;
    }

    public static t6 b(int i10, long j3, String str, int i11) {
        t6 t6Var = new t6(11);
        t6Var.f = i10;
        t6Var.d = str;
        t6Var.g = j3;
        t6Var.h = i11;
        t6Var.j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || t6.class != obj.getClass()) {
                return false;
            }
            t6 t6Var = (t6) obj;
            int i10 = this.a;
            if (i10 != t6Var.a) {
                return false;
            }
            if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                if (i10 == 3) {
                    return Objects.equals(this.d, t6Var.d);
                }
                if (i10 == 1) {
                    return Objects.equals(this.e, t6Var.e);
                }
                if (i10 == 11) {
                    if (this.f != t6Var.f || this.g != t6Var.g) {
                        return false;
                    }
                } else if (i10 != 7 || this.c != t6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public t6(int i10, int i11) {
        super(7, true);
        this.c = i10;
    }

    public t6(int i10) {
        super(i10, true);
        this.c = -1;
    }
}
