package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r10 {
    public long a;
    public int b;

    public r10(int i10, long j3) {
        this.a = j3;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r10.class == obj.getClass()) {
            r10 r10Var = (r10) obj;
            if (this.a == r10Var.a && this.b == r10Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
