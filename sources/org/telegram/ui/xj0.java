package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class xj0 extends pg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public ek0 g;
    public int h;
    public boolean i;

    public static xj0 b(int i10, String str, boolean z10) {
        xj0 xj0Var = new xj0(1, true);
        xj0Var.c = i10;
        xj0Var.e = str;
        xj0Var.i = z10;
        return xj0Var;
    }

    public static xj0 c(int i10, String str, String str2) {
        xj0 xj0Var = new xj0(5, true);
        xj0Var.c = i10;
        xj0Var.e = str;
        xj0Var.f = str2;
        return xj0Var;
    }

    public static xj0 d(int i10, String str) {
        xj0 xj0Var = new xj0(4, true);
        xj0Var.c = i10;
        xj0Var.e = str;
        return xj0Var;
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (xj0.class != aVar.getClass()) {
            return false;
        }
        xj0 xj0Var = (xj0) aVar;
        return this.c == xj0Var.c && this.d == xj0Var.d && this.h == xj0Var.h && this.i == xj0Var.i && Objects.equals(this.e, xj0Var.e) && Objects.equals(this.f, xj0Var.f) && this.g == xj0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xj0.class == obj.getClass()) {
            xj0 xj0Var = (xj0) obj;
            if (this.c == xj0Var.c && this.h == xj0Var.h && ((this.a == 8 || (this.d == xj0Var.d && Objects.equals(this.e, xj0Var.e) && (this.a == 6 || Objects.equals(this.f, xj0Var.f)))) && this.g == xj0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
