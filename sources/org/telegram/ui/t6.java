package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t6 extends wf.a {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public t6(int i9, String str) {
        super(i9, true);
        this.c = -1;
        this.d = str;
    }

    public static t6 b(int i9, long j10, String str, int i10) {
        t6 t6Var = new t6(11);
        t6Var.f = i9;
        t6Var.d = str;
        t6Var.g = j10;
        t6Var.h = i10;
        t6Var.j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || t6.class != obj.getClass()) {
                return false;
            }
            t6 t6Var = (t6) obj;
            int i9 = this.a;
            if (i9 != t6Var.a) {
                return false;
            }
            if (i9 != 9 && i9 != 10 && i9 != 8 && i9 != 4 && i9 != 2 && i9 != 0 && i9 != 13) {
                if (i9 == 3) {
                    return Objects.equals(this.d, t6Var.d);
                }
                if (i9 == 1) {
                    return Objects.equals(this.e, t6Var.e);
                }
                if (i9 == 11) {
                    if (this.f != t6Var.f || this.g != t6Var.g) {
                        return false;
                    }
                } else if (i9 != 7 || this.c != t6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public t6(int i9, int i10) {
        super(7, true);
        this.c = i9;
    }

    public t6(int i9) {
        super(i9, true);
        this.c = -1;
    }
}
