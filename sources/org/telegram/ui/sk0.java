package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class sk0 extends pg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public zk0 g;
    public int h;
    public boolean i;

    public static sk0 b(int i10, String str, boolean z10) {
        sk0 sk0Var = new sk0(1, true);
        sk0Var.c = i10;
        sk0Var.e = str;
        sk0Var.i = z10;
        return sk0Var;
    }

    public static sk0 c(int i10, String str, String str2) {
        sk0 sk0Var = new sk0(5, true);
        sk0Var.c = i10;
        sk0Var.e = str;
        sk0Var.f = str2;
        return sk0Var;
    }

    public static sk0 d(int i10, String str) {
        sk0 sk0Var = new sk0(4, true);
        sk0Var.c = i10;
        sk0Var.e = str;
        return sk0Var;
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (sk0.class != aVar.getClass()) {
            return false;
        }
        sk0 sk0Var = (sk0) aVar;
        return this.c == sk0Var.c && this.d == sk0Var.d && this.h == sk0Var.h && this.i == sk0Var.i && Objects.equals(this.e, sk0Var.e) && Objects.equals(this.f, sk0Var.f) && this.g == sk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sk0.class == obj.getClass()) {
            sk0 sk0Var = (sk0) obj;
            if (this.c == sk0Var.c && this.h == sk0Var.h && ((this.a == 8 || (this.d == sk0Var.d && Objects.equals(this.e, sk0Var.e) && (this.a == 6 || Objects.equals(this.f, sk0Var.f)))) && this.g == sk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
