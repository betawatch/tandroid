package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x5 extends rg.a {
    public final org.telegram.messenger.t2 c;

    public x5(int i7, org.telegram.messenger.t2 t2Var) {
        super(i7, false);
        this.c = t2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.t2 t2Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        if (this.a != x5Var.a) {
            return false;
        }
        org.telegram.messenger.t2 t2Var2 = this.c;
        return t2Var2 == null || (t2Var = x5Var.c) == null || t2Var2.a == t2Var.a;
    }
}
