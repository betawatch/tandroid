package p4;

import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n {
    public final Bundle a;
    public s b;

    public n(s sVar, boolean z10) {
        if (sVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = sVar;
        bundle.putBundle("selector", sVar.a);
        bundle.putBoolean("activeScan", z10);
    }

    public final void a() {
        if (this.b == null) {
            s b10 = s.b(this.a.getBundle("selector"));
            this.b = b10;
            if (b10 == null) {
                this.b = s.c;
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
            s sVar = this.b;
            nVar.a();
            if (sVar.equals(nVar.b) && b() == nVar.b()) {
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
