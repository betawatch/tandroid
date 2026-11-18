package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w5 extends rg.a {
    public final org.telegram.messenger.t2 c;

    public w5(int i7, org.telegram.messenger.t2 t2Var) {
        super(i7, false);
        this.c = t2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.t2 t2Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || w5.class != obj.getClass()) {
            return false;
        }
        w5 w5Var = (w5) obj;
        if (this.a != w5Var.a) {
            return false;
        }
        org.telegram.messenger.t2 t2Var2 = this.c;
        return t2Var2 == null || (t2Var = w5Var.c) == null || t2Var2.a == t2Var.a;
    }
}
