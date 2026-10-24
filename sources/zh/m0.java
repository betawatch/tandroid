package zh;

import java.io.IOException;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class m0 implements y2.m {
    public final /* synthetic */ Object a;

    public /* synthetic */ m0(Object obj) {
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
