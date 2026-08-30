package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yb0 extends bg.b {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public yb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static yb0 b(int i10, String str) {
        return new yb0(4, 0, str, i10, 0);
    }

    public static yb0 c(int i10, int i11, String str) {
        return new yb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb0)) {
            return false;
        }
        yb0 yb0Var = (yb0) obj;
        int i10 = yb0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && yb0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && yb0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && yb0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(yb0Var.c, this.c);
    }
}
