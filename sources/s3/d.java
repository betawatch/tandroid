package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
