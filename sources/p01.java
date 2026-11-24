// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p01 {
    public final /* synthetic */ byte a = 1;
    public int b;
    public long c;
    public int d;

    public p01(long j, int i, int i2) {
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
                return hg9.k(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p01() {
    }
}
