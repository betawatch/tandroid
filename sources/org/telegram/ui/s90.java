package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s90 extends rg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public s90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.c = charSequence;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    public static s90 b(int i7, String str) {
        return new s90(4, 0, str, i7, 0);
    }

    public static s90 c(int i7, int i10, String str) {
        return new s90(3, i7, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s90)) {
            return false;
        }
        s90 s90Var = (s90) obj;
        int i7 = s90Var.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        if (i10 == 3 && s90Var.d != this.d) {
            return false;
        }
        if (i10 == 5 && s90Var.f != this.f) {
            return false;
        }
        if ((i10 == 3 || i10 == 4) && s90Var.e != this.e) {
            return false;
        }
        return !(i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) || TextUtils.equals(s90Var.c, this.c);
    }
}
