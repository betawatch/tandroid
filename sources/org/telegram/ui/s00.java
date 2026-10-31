package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s00 {
    public long a;
    public int b;

    public s00(int i10, long j10) {
        this.a = j10;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s00.class == obj.getClass()) {
            s00 s00Var = (s00) obj;
            if (this.a == s00Var.a && this.b == s00Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
