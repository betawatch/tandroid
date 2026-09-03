package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y6 extends bg.b {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public y6(int i10, String str) {
        super(i10, true);
        this.c = -1;
        this.d = str;
    }

    public static y6 b(int i10, long j10, String str, int i11) {
        y6 y6Var = new y6(11);
        y6Var.f = i10;
        y6Var.d = str;
        y6Var.g = j10;
        y6Var.h = i11;
        y6Var.j = false;
        return y6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || y6.class != obj.getClass()) {
                return false;
            }
            y6 y6Var = (y6) obj;
            int i10 = this.a;
            if (i10 != y6Var.a) {
                return false;
            }
            if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                if (i10 == 3) {
                    return Objects.equals(this.d, y6Var.d);
                }
                if (i10 == 1) {
                    return Objects.equals(this.e, y6Var.e);
                }
                if (i10 == 11) {
                    if (this.f != y6Var.f || this.g != y6Var.g) {
                        return false;
                    }
                } else if (i10 != 7 || this.c != y6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public y6(int i10, int i11) {
        super(7, true);
        this.c = i10;
    }

    public y6(int i10) {
        super(i10, true);
        this.c = -1;
    }
}
