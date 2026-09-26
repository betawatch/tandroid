package s3;

import e2.v;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a extends b {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public a(long j3, long j10, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = j3;
                this.c = j10;
                break;
            default:
                this.b = j10;
                this.c = j3;
                break;
        }
    }

    public static long d(long j3, v vVar) {
        long x10 = vVar.x();
        if ((128 & x10) != 0) {
            return 8589934591L & ((((x10 & 1) << 32) | vVar.z()) + j3);
        }
        return -9223372036854775807L;
    }

    @Override // s3.b
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.b);
                sb2.append(", identifier= ");
                return a4.a.s(sb2, this.c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return a4.a.s(sb3, this.c, " }");
        }
    }
}
