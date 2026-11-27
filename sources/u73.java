// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class u73 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u73(Object obj, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new u73((o83) obj2, zw2Var, (byte) 0);
            default:
                return new u73((av5) obj2, zw2Var, (byte) 1);
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        switch (b) {
            case 0:
                return ((u73) create((nm4) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            default:
                return ((u73) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9cVar);
        }
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    ixe.b(obj);
                    this.b = true;
                    if (((o83) obj2).e(this) == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (!z) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                return g9c.a;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    ixe.b(obj);
                    mm4 data = ((av5) obj2).c.a.getData();
                    this.b = true;
                    obj = qme.b(data, this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (!z2) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                sj7 sj7Var = (sj7) obj;
                return sj7Var != null ? sj7Var.a() : y24.a;
        }
    }
}
