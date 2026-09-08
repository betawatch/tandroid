package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qk0 extends pg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public wk0 g;
    public int h;
    public boolean i;

    public static qk0 b(int i10, String str, boolean z10) {
        qk0 qk0Var = new qk0(1, true);
        qk0Var.c = i10;
        qk0Var.e = str;
        qk0Var.i = z10;
        return qk0Var;
    }

    public static qk0 c(int i10, String str, String str2) {
        qk0 qk0Var = new qk0(5, true);
        qk0Var.c = i10;
        qk0Var.e = str;
        qk0Var.f = str2;
        return qk0Var;
    }

    public static qk0 d(int i10, String str) {
        qk0 qk0Var = new qk0(4, true);
        qk0Var.c = i10;
        qk0Var.e = str;
        return qk0Var;
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (qk0.class != aVar.getClass()) {
            return false;
        }
        qk0 qk0Var = (qk0) aVar;
        return this.c == qk0Var.c && this.d == qk0Var.d && this.h == qk0Var.h && this.i == qk0Var.i && Objects.equals(this.e, qk0Var.e) && Objects.equals(this.f, qk0Var.f) && this.g == qk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qk0.class == obj.getClass()) {
            qk0 qk0Var = (qk0) obj;
            if (this.c == qk0Var.c && this.h == qk0Var.h && ((this.a == 8 || (this.d == qk0Var.d && Objects.equals(this.e, qk0Var.e) && (this.a == 6 || Objects.equals(this.f, qk0Var.f)))) && this.g == qk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
