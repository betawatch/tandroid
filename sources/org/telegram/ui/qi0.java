package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qi0 extends hg.b {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public ui0 g;
    public int h;
    public boolean i;

    public static qi0 b(int i10, String str, boolean z10) {
        qi0 qi0Var = new qi0(1, true);
        qi0Var.c = i10;
        qi0Var.e = str;
        qi0Var.i = z10;
        return qi0Var;
    }

    public static qi0 c(int i10, String str, String str2) {
        qi0 qi0Var = new qi0(5, true);
        qi0Var.c = i10;
        qi0Var.e = str;
        qi0Var.f = str2;
        return qi0Var;
    }

    public static qi0 d(int i10, String str) {
        qi0 qi0Var = new qi0(4, true);
        qi0Var.c = i10;
        qi0Var.e = str;
        return qi0Var;
    }

    @Override // hg.b
    public final boolean a(hg.b bVar) {
        if (this == bVar) {
            return true;
        }
        if (qi0.class != bVar.getClass()) {
            return false;
        }
        qi0 qi0Var = (qi0) bVar;
        return this.c == qi0Var.c && this.d == qi0Var.d && this.h == qi0Var.h && this.i == qi0Var.i && Objects.equals(this.e, qi0Var.e) && Objects.equals(this.f, qi0Var.f) && this.g == qi0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qi0.class == obj.getClass()) {
            qi0 qi0Var = (qi0) obj;
            if (this.c == qi0Var.c && this.h == qi0Var.h && ((this.a == 8 || (this.d == qi0Var.d && Objects.equals(this.e, qi0Var.e) && (this.a == 6 || Objects.equals(this.f, qi0Var.f)))) && this.g == qi0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
