// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
