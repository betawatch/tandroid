// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qz0 {
    public final /* synthetic */ byte a = 1;
    public int b;
    public long c;
    public int d;

    public qz0(long j, int i, int i2) {
        this.c = j;
        this.b = i;
        this.d = i2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("part{");
                sb.append(this.c);
                sb.append(", ch=");
                sb.append(this.b);
                sb.append(", q=");
                return uh9.l(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qz0() {
    }
}
