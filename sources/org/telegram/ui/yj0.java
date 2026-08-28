package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yj0 extends wf.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public ek0 g;
    public int h;
    public boolean i;

    public static yj0 b(int i9, String str, boolean z10) {
        yj0 yj0Var = new yj0(1, true);
        yj0Var.c = i9;
        yj0Var.e = str;
        yj0Var.i = z10;
        return yj0Var;
    }

    public static yj0 c(int i9, String str, String str2) {
        yj0 yj0Var = new yj0(5, true);
        yj0Var.c = i9;
        yj0Var.e = str;
        yj0Var.f = str2;
        return yj0Var;
    }

    public static yj0 d(int i9, String str) {
        yj0 yj0Var = new yj0(4, true);
        yj0Var.c = i9;
        yj0Var.e = str;
        return yj0Var;
    }

    @Override // wf.a
    public final boolean a(wf.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (yj0.class != aVar.getClass()) {
            return false;
        }
        yj0 yj0Var = (yj0) aVar;
        return this.c == yj0Var.c && this.d == yj0Var.d && this.h == yj0Var.h && this.i == yj0Var.i && Objects.equals(this.e, yj0Var.e) && Objects.equals(this.f, yj0Var.f) && this.g == yj0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yj0.class == obj.getClass()) {
            yj0 yj0Var = (yj0) obj;
            if (this.c == yj0Var.c && this.h == yj0Var.h && ((this.a == 8 || (this.d == yj0Var.d && Objects.equals(this.e, yj0Var.e) && (this.a == 6 || Objects.equals(this.f, yj0Var.f)))) && this.g == yj0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
