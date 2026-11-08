package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class rz {
    public long a;
    public int b;

    public rz(int i7, long j3) {
        this.a = j3;
        this.b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rz.class == obj.getClass()) {
            rz rzVar = (rz) obj;
            if (this.a == rzVar.a && this.b == rzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
