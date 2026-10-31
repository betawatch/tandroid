package th;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends hg.b {
    public final long c;

    public j(long j10) {
        super(0, false);
        this.c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.c == ((j) obj).c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.c));
    }
}
