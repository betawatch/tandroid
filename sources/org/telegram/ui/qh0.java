package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qh0 extends rg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public uh0 g;
    public int h;
    public boolean i;

    public static qh0 b(int i7, String str, boolean z10) {
        qh0 qh0Var = new qh0(1, true);
        qh0Var.c = i7;
        qh0Var.e = str;
        qh0Var.i = z10;
        return qh0Var;
    }

    public static qh0 c(int i7, String str, String str2) {
        qh0 qh0Var = new qh0(5, true);
        qh0Var.c = i7;
        qh0Var.e = str;
        qh0Var.f = str2;
        return qh0Var;
    }

    public static qh0 d(int i7, String str) {
        qh0 qh0Var = new qh0(4, true);
        qh0Var.c = i7;
        qh0Var.e = str;
        return qh0Var;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (qh0.class != aVar.getClass()) {
            return false;
        }
        qh0 qh0Var = (qh0) aVar;
        return this.c == qh0Var.c && this.d == qh0Var.d && this.h == qh0Var.h && this.i == qh0Var.i && Objects.equals(this.e, qh0Var.e) && Objects.equals(this.f, qh0Var.f) && this.g == qh0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qh0.class == obj.getClass()) {
            qh0 qh0Var = (qh0) obj;
            if (this.c == qh0Var.c && this.h == qh0Var.h && ((this.a == 8 || (this.d == qh0Var.d && Objects.equals(this.e, qh0Var.e) && (this.a == 6 || Objects.equals(this.f, qh0Var.f)))) && this.g == qh0Var.g)) {
                return true;
            }
        }
        return false;
    }
}
