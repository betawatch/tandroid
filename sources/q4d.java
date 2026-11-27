// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q4d {
    public final byte a;
    public final long b;

    /* JADX WARN: Multi-variable type inference failed */
    public q4d(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q4d)) {
            return false;
        }
        q4d q4dVar = (q4d) obj;
        return this.a == q4dVar.a && this.b == q4dVar.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append((int) this.a);
        sb.append(", eventTimestamp=");
        return qu6.p(sb, this.b, "}");
    }
}
