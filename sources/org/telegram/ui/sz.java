package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sz {
    public long a;
    public int b;

    public sz(int i7, long j3) {
        this.a = j3;
        this.b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sz.class == obj.getClass()) {
            sz szVar = (sz) obj;
            if (this.a == szVar.a && this.b == szVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
