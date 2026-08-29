package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s6 extends zf.a {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public s6(int i10, String str) {
        super(i10, true);
        this.c = -1;
        this.d = str;
    }

    public static s6 b(int i10, long j10, String str, int i11) {
        s6 s6Var = new s6(11);
        s6Var.f = i10;
        s6Var.d = str;
        s6Var.g = j10;
        s6Var.h = i11;
        s6Var.j = false;
        return s6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || s6.class != obj.getClass()) {
                return false;
            }
            s6 s6Var = (s6) obj;
            int i10 = this.a;
            if (i10 != s6Var.a) {
                return false;
            }
            if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                if (i10 == 3) {
                    return Objects.equals(this.d, s6Var.d);
                }
                if (i10 == 1) {
                    return Objects.equals(this.e, s6Var.e);
                }
                if (i10 == 11) {
                    if (this.f != s6Var.f || this.g != s6Var.g) {
                        return false;
                    }
                } else if (i10 != 7 || this.c != s6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public s6(int i10, int i11) {
        super(7, true);
        this.c = i10;
    }

    public s6(int i10) {
        super(i10, true);
        this.c = -1;
    }
}
