package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v6 extends sg.a {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public v6(int i3, String str) {
        super(i3, true);
        this.c = -1;
        this.d = str;
    }

    public static v6 b(int i3, long j10, String str, int i10) {
        v6 v6Var = new v6(11);
        v6Var.f = i3;
        v6Var.d = str;
        v6Var.g = j10;
        v6Var.h = i10;
        v6Var.j = false;
        return v6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || v6.class != obj.getClass()) {
                return false;
            }
            v6 v6Var = (v6) obj;
            int i3 = this.a;
            if (i3 != v6Var.a) {
                return false;
            }
            if (i3 != 9 && i3 != 10 && i3 != 8 && i3 != 4 && i3 != 2 && i3 != 0 && i3 != 13) {
                if (i3 == 3) {
                    return Objects.equals(this.d, v6Var.d);
                }
                if (i3 == 1) {
                    return Objects.equals(this.e, v6Var.e);
                }
                if (i3 == 11) {
                    if (this.f != v6Var.f || this.g != v6Var.g) {
                        return false;
                    }
                } else if (i3 != 7 || this.c != v6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public v6(int i3, int i10) {
        super(7, true);
        this.c = i3;
    }

    public v6(int i3) {
        super(i3, true);
        this.c = -1;
    }
}
