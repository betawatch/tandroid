package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class va0 extends hg.b {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public va0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static va0 b(int i10, String str) {
        return new va0(4, 0, str, i10, 0);
    }

    public static va0 c(int i10, int i11, String str) {
        return new va0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va0)) {
            return false;
        }
        va0 va0Var = (va0) obj;
        int i10 = va0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && va0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && va0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && va0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(va0Var.c, this.c);
    }
}
