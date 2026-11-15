package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x5 extends rg.a {
    public final org.telegram.messenger.s2 c;

    public x5(int i7, org.telegram.messenger.s2 s2Var) {
        super(i7, false);
        this.c = s2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.s2 s2Var;
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
        org.telegram.messenger.s2 s2Var2 = this.c;
        return s2Var2 == null || (s2Var = x5Var.c) == null || s2Var2.a == s2Var.a;
    }
}
