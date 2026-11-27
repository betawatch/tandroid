// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wn8 extends cpa {
    public final /* synthetic */ byte a;
    public final long b;
    public final long c;

    public wn8(long j, long j2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, ey7 ey7Var) {
        long A = ey7Var.A();
        if ((128 & A) != 0) {
            return ((((A & 1) << 32) | ey7Var.C()) + j) & 8589934591L;
        }
        return -9223372036854775807L;
    }

    @Override // cpa
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return qu6.p(sb, this.c, " }");
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return qu6.p(sb2, this.c, " }");
        }
    }
}
