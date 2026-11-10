package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u90 extends rg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public u90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.c = charSequence;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    public static u90 b(int i7, String str) {
        return new u90(4, 0, str, i7, 0);
    }

    public static u90 c(int i7, int i10, String str) {
        return new u90(3, i7, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90Var = (u90) obj;
        int i7 = u90Var.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        if (i10 == 3 && u90Var.d != this.d) {
            return false;
        }
        if (i10 == 5 && u90Var.f != this.f) {
            return false;
        }
        if ((i10 == 3 || i10 == 4) && u90Var.e != this.e) {
            return false;
        }
        return !(i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) || TextUtils.equals(u90Var.c, this.c);
    }
}
