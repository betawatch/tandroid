package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
