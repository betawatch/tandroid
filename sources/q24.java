// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
