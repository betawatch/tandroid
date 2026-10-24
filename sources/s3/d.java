package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d extends b {
    public final long a;
    public final long b;
    public final List c;

    public d(long j10, long j11, List list) {
        this.a = j10;
        this.b = j11;
        this.c = DesugarCollections.unmodifiableList(list);
    }

    @Override // s3.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.b, " }");
    }
}
