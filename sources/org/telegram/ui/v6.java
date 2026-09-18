package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v6 extends og.a {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public v6(int i10, String str) {
        super(i10, true);
        this.c = -1;
        this.d = str;
    }

    public static v6 b(int i10, long j3, String str, int i11) {
        v6 v6Var = new v6(11);
        v6Var.f = i10;
        v6Var.d = str;
        v6Var.g = j3;
        v6Var.h = i11;
        v6Var.j = false;
        return v6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || v6.class != obj.getClass()) {
                return false;
            }
            v6 v6Var = (v6) obj;
            int i10 = this.a;
            if (i10 != v6Var.a) {
                return false;
            }
            if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                if (i10 == 3) {
                    return Objects.equals(this.d, v6Var.d);
                }
                if (i10 == 1) {
                    return Objects.equals(this.e, v6Var.e);
                }
                if (i10 == 11) {
                    if (this.f != v6Var.f || this.g != v6Var.g) {
                        return false;
                    }
                } else if (i10 != 7 || this.c != v6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public v6(int i10, int i11) {
        super(7, true);
        this.c = i10;
    }

    public v6(int i10) {
        super(i10, true);
        this.c = -1;
    }
}
