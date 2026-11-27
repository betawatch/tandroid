// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua1 implements ks4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua1(wj7 wj7Var, vj7 vj7Var) {
        this.a = (byte) 1;
        this.b = wj7Var;
    }

    @Override // ks4
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((a2) obj4).invoke((Throwable) obj);
                break;
            case 1:
                wj7 wj7Var = (wj7) obj4;
                wj7.h.set(wj7Var, null);
                wj7Var.f(null);
                break;
            default:
                ((k4a) obj4).b();
                break;
        }
        return f9cVar;
    }

    public /* synthetic */ ua1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
