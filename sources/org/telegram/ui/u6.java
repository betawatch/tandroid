package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u6 extends xf.a {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public u6(int i10, String str) {
        super(i10, true);
        this.c = -1;
        this.d = str;
    }

    public static u6 b(int i10, long j10, String str, int i11) {
        u6 u6Var = new u6(11);
        u6Var.f = i10;
        u6Var.d = str;
        u6Var.g = j10;
        u6Var.h = i11;
        u6Var.j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || u6.class != obj.getClass()) {
                return false;
            }
            u6 u6Var = (u6) obj;
            int i10 = this.a;
            if (i10 != u6Var.a) {
                return false;
            }
            if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                if (i10 == 3) {
                    return Objects.equals(this.d, u6Var.d);
                }
                if (i10 == 1) {
                    return Objects.equals(this.e, u6Var.e);
                }
                if (i10 == 11) {
                    if (this.f != u6Var.f || this.g != u6Var.g) {
                        return false;
                    }
                } else if (i10 != 7 || this.c != u6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public u6(int i10, int i11) {
        super(7, true);
        this.c = i10;
    }

    public u6(int i10) {
        super(i10, true);
        this.c = -1;
    }
}
