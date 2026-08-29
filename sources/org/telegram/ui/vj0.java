package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vj0 extends zf.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public bk0 g;
    public int h;
    public boolean i;

    public static vj0 b(int i10, String str, boolean z10) {
        vj0 vj0Var = new vj0(1, true);
        vj0Var.c = i10;
        vj0Var.e = str;
        vj0Var.i = z10;
        return vj0Var;
    }

    public static vj0 c(int i10, String str, String str2) {
        vj0 vj0Var = new vj0(5, true);
        vj0Var.c = i10;
        vj0Var.e = str;
        vj0Var.f = str2;
        return vj0Var;
    }

    public static vj0 d(int i10, String str) {
        vj0 vj0Var = new vj0(4, true);
        vj0Var.c = i10;
        vj0Var.e = str;
        return vj0Var;
    }

    @Override // zf.a
    public final boolean a(zf.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (vj0.class != aVar.getClass()) {
            return false;
        }
        vj0 vj0Var = (vj0) aVar;
        return this.c == vj0Var.c && this.d == vj0Var.d && this.h == vj0Var.h && this.i == vj0Var.i && Objects.equals(this.e, vj0Var.e) && Objects.equals(this.f, vj0Var.f) && this.g == vj0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vj0.class == obj.getClass()) {
            vj0 vj0Var = (vj0) obj;
            if (this.c == vj0Var.c && this.h == vj0Var.h && ((this.a == 8 || (this.d == vj0Var.d && Objects.equals(this.e, vj0Var.e) && (this.a == 6 || Objects.equals(this.f, vj0Var.f)))) && this.g == vj0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
