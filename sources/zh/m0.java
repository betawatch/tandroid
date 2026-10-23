package zh;

import java.io.IOException;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
