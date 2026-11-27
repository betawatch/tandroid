// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        f9c f9cVar = f9c.a;
        switch (b) {
            case 0:
                return ((u73) create((nm4) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            default:
                return ((u73) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9cVar);
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
                return f9c.a;
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
                rj7 rj7Var = (rj7) obj;
                return rj7Var != null ? rj7Var.a() : y24.a;
        }
    }
}
