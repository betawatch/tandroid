package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r00 {
    public long a;
    public int b;

    public r00(int i10, long j10) {
        this.a = j10;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r00.class == obj.getClass()) {
            r00 r00Var = (r00) obj;
            if (this.a == r00Var.a && this.b == r00Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
