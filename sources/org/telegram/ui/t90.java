package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t90 extends rg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public t90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.c = charSequence;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    public static t90 b(int i7, String str) {
        return new t90(4, 0, str, i7, 0);
    }

    public static t90 c(int i7, int i10, String str) {
        return new t90(3, i7, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t90)) {
            return false;
        }
        t90 t90Var = (t90) obj;
        int i7 = t90Var.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        if (i10 == 3 && t90Var.d != this.d) {
            return false;
        }
        if (i10 == 5 && t90Var.f != this.f) {
            return false;
        }
        if ((i10 == 3 || i10 == 4) && t90Var.e != this.e) {
            return false;
        }
        return !(i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) || TextUtils.equals(t90Var.c, this.c);
    }
}
