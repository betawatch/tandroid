package zh;

import java.io.IOException;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class l0 implements y2.m {
    public final /* synthetic */ Object a;

    public /* synthetic */ l0(Object obj) {
        this.a = obj;
    }

    @Override // y2.m
    public void a() {
        l2.h hVar = (l2.h) this.a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }
}
