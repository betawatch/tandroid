// default package

import androidx.datastore.core.NativeSharedCounter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wi7 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aj7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi7(aj7 aj7Var, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.b = aj7Var;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        aj7 aj7Var = this.b;
        switch (b) {
            case 0:
                return new wi7(aj7Var, zw2Var, (byte) 0);
            default:
                return new wi7(aj7Var, zw2Var, (byte) 1);
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((wi7) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        NativeSharedCounter nativeSharedCounter = yea.b;
        aj7 aj7Var = this.b;
        ixe.b(obj);
        switch (b) {
            case 0:
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((yea) aj7Var.i.getValue()).a));
            default:
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((yea) aj7Var.i.getValue()).a));
        }
    }
}
