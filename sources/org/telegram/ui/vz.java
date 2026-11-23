package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vz {
    public long a;
    public int b;

    public vz(int i7, long j3) {
        this.a = j3;
        this.b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vz.class == obj.getClass()) {
            vz vzVar = (vz) obj;
            if (this.a == vzVar.a && this.b == vzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
