package zd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n0 implements x0 {
    public final boolean a;

    public n0(boolean z9) {
        this.a = z9;
    }

    @Override // zd.x0
    public final o1 b() {
        return null;
    }

    @Override // zd.x0
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Empty{");
        sb2.append(this.a ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
