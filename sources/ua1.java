// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua1 implements ks4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua1(xj7 xj7Var, wj7 wj7Var) {
        this.a = (byte) 1;
        this.b = xj7Var;
    }

    @Override // ks4
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((a2) obj4).invoke((Throwable) obj);
                break;
            case 1:
                xj7 xj7Var = (xj7) obj4;
                xj7.h.set(xj7Var, null);
                xj7Var.f(null);
                break;
            default:
                ((k4a) obj4).b();
                break;
        }
        return g9cVar;
    }

    public /* synthetic */ ua1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
