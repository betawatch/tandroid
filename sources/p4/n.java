package p4;

import android.os.Bundle;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class n {
    public final Bundle a;
    public r b;

    public n(r rVar, boolean z10) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = rVar;
        bundle.putBundle("selector", rVar.a);
        bundle.putBoolean("activeScan", z10);
    }

    public final void a() {
        if (this.b == null) {
            r b10 = r.b(this.a.getBundle("selector"));
            this.b = b10;
            if (b10 == null) {
                this.b = r.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.b;
            nVar.a();
            if (rVar.equals(nVar.b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode() ^ (b() ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        this.b.a();
        sb2.append(!r1.b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
