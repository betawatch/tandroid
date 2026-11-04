package u3;

import a1.g;
import g2.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends b {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public a(long j10, int i3, long j11) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = j10;
                this.c = j11;
                break;
            default:
                this.b = j11;
                this.c = j10;
                break;
        }
    }

    public static long d(long j10, y yVar) {
        long A = yVar.A();
        if ((128 & A) != 0) {
            return 8589934591L & ((((A & 1) << 32) | yVar.C()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // u3.b
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.b);
                sb2.append(", identifier= ");
                return g.r(sb2, this.c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return g.r(sb3, this.c, " }");
        }
    }
}
