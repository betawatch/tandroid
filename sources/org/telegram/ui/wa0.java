package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wa0 extends hg.b {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public wa0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static wa0 b(int i10, String str) {
        return new wa0(4, 0, str, i10, 0);
    }

    public static wa0 c(int i10, int i11, String str) {
        return new wa0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        int i10 = wa0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && wa0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && wa0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && wa0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(wa0Var.c, this.c);
    }
}
