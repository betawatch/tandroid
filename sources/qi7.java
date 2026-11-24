// default package

import androidx.datastore.core.NativeSharedCounter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qi7 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ui7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi7(ui7 ui7Var, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.b = ui7Var;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        ui7 ui7Var = this.b;
        switch (b) {
            case 0:
                return new qi7(ui7Var, px2Var, (byte) 0);
            default:
                return new qi7(ui7Var, px2Var, (byte) 1);
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((qi7) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        NativeSharedCounter nativeSharedCounter = hda.b;
        ui7 ui7Var = this.b;
        tue.b(obj);
        switch (b) {
            case 0:
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((hda) ui7Var.i.getValue()).a));
            default:
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((hda) ui7Var.i.getValue()).a));
        }
    }
}
