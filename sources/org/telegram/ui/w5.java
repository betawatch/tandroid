package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w5 extends hg.b {
    public final org.telegram.messenger.w2 c;

    public w5(int i10, org.telegram.messenger.w2 w2Var) {
        super(i10, false);
        this.c = w2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.w2 w2Var;
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
        org.telegram.messenger.w2 w2Var2 = this.c;
        return w2Var2 == null || (w2Var = w5Var.c) == null || w2Var2.a == w2Var.a;
    }
}
