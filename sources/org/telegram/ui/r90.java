package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class r90 extends rg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public r90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.c = charSequence;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    public static r90 b(int i7, String str) {
        return new r90(4, 0, str, i7, 0);
    }

    public static r90 c(int i7, int i10, String str) {
        return new r90(3, i7, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        int i7 = r90Var.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        if (i10 == 3 && r90Var.d != this.d) {
            return false;
        }
        if (i10 == 5 && r90Var.f != this.f) {
            return false;
        }
        if ((i10 == 3 || i10 == 4) && r90Var.e != this.e) {
            return false;
        }
        return !(i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) || TextUtils.equals(r90Var.c, this.c);
    }
}
