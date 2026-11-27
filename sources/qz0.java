// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
