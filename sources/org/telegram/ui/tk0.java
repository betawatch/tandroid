package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tk0 extends pg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public al0 g;
    public int h;
    public boolean i;

    public static tk0 b(int i10, String str, boolean z10) {
        tk0 tk0Var = new tk0(1, true);
        tk0Var.c = i10;
        tk0Var.e = str;
        tk0Var.i = z10;
        return tk0Var;
    }

    public static tk0 c(int i10, String str, String str2) {
        tk0 tk0Var = new tk0(5, true);
        tk0Var.c = i10;
        tk0Var.e = str;
        tk0Var.f = str2;
        return tk0Var;
    }

    public static tk0 d(int i10, String str) {
        tk0 tk0Var = new tk0(4, true);
        tk0Var.c = i10;
        tk0Var.e = str;
        return tk0Var;
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (tk0.class != aVar.getClass()) {
            return false;
        }
        tk0 tk0Var = (tk0) aVar;
        return this.c == tk0Var.c && this.d == tk0Var.d && this.h == tk0Var.h && this.i == tk0Var.i && Objects.equals(this.e, tk0Var.e) && Objects.equals(this.f, tk0Var.f) && this.g == tk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tk0.class == obj.getClass()) {
            tk0 tk0Var = (tk0) obj;
            if (this.c == tk0Var.c && this.h == tk0Var.h && ((this.a == 8 || (this.d == tk0Var.d && Objects.equals(this.e, tk0Var.e) && (this.a == 6 || Objects.equals(this.f, tk0Var.f)))) && this.g == tk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
