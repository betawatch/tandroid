package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zb0 extends cg.b {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public zb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static zb0 b(int i10, String str) {
        return new zb0(4, 0, str, i10, 0);
    }

    public static zb0 c(int i10, int i11, String str) {
        return new zb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj;
        int i10 = zb0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && zb0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && zb0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && zb0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(zb0Var.c, this.c);
    }
}
