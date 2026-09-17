package s3;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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

    @Override // s3.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.r(sb2, this.b, " }");
    }
}
