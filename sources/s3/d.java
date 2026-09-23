package s3;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        return a4.a.s(sb2, this.b, " }");
    }
}
