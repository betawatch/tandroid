package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        return g.q(sb2, this.b, " }");
    }
}
