package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class w5 extends rg.a {
    public final org.telegram.messenger.s2 c;

    public w5(int i7, org.telegram.messenger.s2 s2Var) {
        super(i7, false);
        this.c = s2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.s2 s2Var;
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
        org.telegram.messenger.s2 s2Var2 = this.c;
        return s2Var2 == null || (s2Var = w5Var.c) == null || s2Var2.a == s2Var.a;
    }
}
