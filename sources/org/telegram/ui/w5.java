package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
