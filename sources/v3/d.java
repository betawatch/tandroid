package v3;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d extends b {
    public final long a;
    public final long b;
    public final List c;

    public d(long j3, long j10, List list) {
        this.a = j3;
        this.b = j10;
        this.c = DesugarCollections.unmodifiableList(list);
    }

    @Override // v3.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return p0.r(sb2, this.b, " }");
    }
}
