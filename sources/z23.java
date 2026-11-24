// default package

import android.os.CancellationSignal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z23 implements rr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z23(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((CancellationSignal) obj2).cancel();
                break;
            default:
                ((vb1) obj2).resumeWith(g7cVar);
                break;
        }
        return g7cVar;
    }
}
