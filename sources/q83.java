// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q83 extends eeb implements hs4 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q83(h93 h93Var, px2 px2Var) {
        super(3, px2Var);
        this.c = h93Var;
    }

    @Override // hs4
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return new q83((h93) this.c, (px2) obj3).invokeSuspend(g7cVar);
            default:
                ((Boolean) obj2).getClass();
                q83 q83Var = new q83(3, (px2) obj3);
                q83Var.c = (oc4) obj;
                return q83Var.invokeSuspend(g7cVar);
        }
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        ly2 ly2Var = ly2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    tue.b(obj);
                    h93 h93Var = (h93) this.c;
                    this.b = true;
                    if (h93Var.b(this) == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (!z) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                return g7c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        tue.b(obj);
                        return obj;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                oc4 oc4Var = (oc4) this.c;
                this.b = true;
                oc4Var.getClass();
                Object a = oc4.a(oc4Var, this);
                return a == ly2Var ? ly2Var : a;
        }
    }

    public /* synthetic */ q83(int i, px2 px2Var) {
        super(i, px2Var);
    }
}
