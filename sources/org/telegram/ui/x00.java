package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x00 {
    public long a;
    public int b;

    public x00(int i9, long j10) {
        this.a = j10;
        this.b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x00.class == obj.getClass()) {
            x00 x00Var = (x00) obj;
            if (this.a == x00Var.a && this.b == x00Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
