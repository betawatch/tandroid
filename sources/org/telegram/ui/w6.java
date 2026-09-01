package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w6 extends cg.b {
    public final int c;
    public CharSequence d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public w6(int i10, String str) {
        super(i10, true);
        this.c = -1;
        this.d = str;
    }

    public static w6 b(int i10, long j10, String str, int i11) {
        w6 w6Var = new w6(11);
        w6Var.f = i10;
        w6Var.d = str;
        w6Var.g = j10;
        w6Var.h = i11;
        w6Var.j = false;
        return w6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || w6.class != obj.getClass()) {
                return false;
            }
            w6 w6Var = (w6) obj;
            int i10 = this.a;
            if (i10 != w6Var.a) {
                return false;
            }
            if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                if (i10 == 3) {
                    return Objects.equals(this.d, w6Var.d);
                }
                if (i10 == 1) {
                    return Objects.equals(this.e, w6Var.e);
                }
                if (i10 == 11) {
                    if (this.f != w6Var.f || this.g != w6Var.g) {
                        return false;
                    }
                } else if (i10 != 7 || this.c != w6Var.c) {
                    return false;
                }
            }
        }
        return true;
    }

    public w6(int i10, int i11) {
        super(7, true);
        this.c = i10;
    }

    public w6(int i10) {
        super(i10, true);
        this.c = -1;
    }
}
