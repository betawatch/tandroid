package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rb0 extends xf.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public rb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static rb0 b(int i10, String str) {
        return new rb0(4, 0, str, i10, 0);
    }

    public static rb0 c(int i10, int i11, String str) {
        return new rb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        int i10 = rb0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && rb0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && rb0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && rb0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(rb0Var.c, this.c);
    }
}
