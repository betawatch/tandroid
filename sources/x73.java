// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class x73 extends yfb implements ks4 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x73(o83 o83Var, zw2 zw2Var) {
        super(3, zw2Var);
        this.c = o83Var;
    }

    @Override // ks4
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        switch (b) {
            case 0:
                return new x73((o83) this.c, (zw2) obj3).invokeSuspend(f9cVar);
            default:
                ((Boolean) obj2).getClass();
                x73 x73Var = new x73(3, (zw2) obj3);
                x73Var.c = (lc4) obj;
                return x73Var.invokeSuspend(f9cVar);
        }
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    ixe.b(obj);
                    o83 o83Var = (o83) this.c;
                    this.b = true;
                    if (o83Var.b(this) == vx2Var) {
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
                if (z2) {
                    if (z2) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                lc4 lc4Var = (lc4) this.c;
                this.b = true;
                lc4Var.getClass();
                Object a = lc4.a(lc4Var, this);
                return a == vx2Var ? vx2Var : a;
        }
    }

    public /* synthetic */ x73(int i, zw2 zw2Var) {
        super(i, zw2Var);
    }
}
