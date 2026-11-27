// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class q24 implements hp5 {
    public final boolean a;

    public q24(boolean z) {
        this.a = z;
    }

    @Override // hp5
    public final qm7 b() {
        return null;
    }

    @Override // hp5
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
