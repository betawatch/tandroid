package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class zj0 extends pg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public gk0 g;
    public int h;
    public boolean i;

    public static zj0 b(int i10, String str, boolean z10) {
        zj0 zj0Var = new zj0(1, true);
        zj0Var.c = i10;
        zj0Var.e = str;
        zj0Var.i = z10;
        return zj0Var;
    }

    public static zj0 c(int i10, String str, String str2) {
        zj0 zj0Var = new zj0(5, true);
        zj0Var.c = i10;
        zj0Var.e = str;
        zj0Var.f = str2;
        return zj0Var;
    }

    public static zj0 d(int i10, String str) {
        zj0 zj0Var = new zj0(4, true);
        zj0Var.c = i10;
        zj0Var.e = str;
        return zj0Var;
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (zj0.class != aVar.getClass()) {
            return false;
        }
        zj0 zj0Var = (zj0) aVar;
        return this.c == zj0Var.c && this.d == zj0Var.d && this.h == zj0Var.h && this.i == zj0Var.i && Objects.equals(this.e, zj0Var.e) && Objects.equals(this.f, zj0Var.f) && this.g == zj0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zj0.class == obj.getClass()) {
            zj0 zj0Var = (zj0) obj;
            if (this.c == zj0Var.c && this.h == zj0Var.h && ((this.a == 8 || (this.d == zj0Var.d && Objects.equals(this.e, zj0Var.e) && (this.a == 6 || Objects.equals(this.f, zj0Var.f)))) && this.g == zj0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
