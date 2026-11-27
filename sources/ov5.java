// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ov5 extends fe9 implements is4 {
    public qm7 b;
    public yg2 c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sv5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov5(zw2 zw2Var, sv5 sv5Var) {
        super(2, zw2Var);
        this.f = sv5Var;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        ov5 ov5Var = new ov5(zw2Var, this.f);
        ov5Var.e = obj;
        return ov5Var;
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        return ((ov5) create((g8a) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005f -> B:6:0x0071). Please report as a decompilation issue!!! */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qm7 b;
        qm7 qm7Var;
        ud6 ud6Var;
        g8a g8aVar;
        byte b2 = this.d;
        vx2 vx2Var = vx2.a;
        if (b2 == 0) {
            ixe.b(obj);
            g8a g8aVar2 = (g8a) this.e;
            Object v = this.f.v();
            if (v instanceof yg2) {
                ah2 ah2Var = ((yg2) v).e;
                this.d = (byte) 1;
                g8aVar2.c(ah2Var, this);
                return vx2Var;
            }
            if ((v instanceof hp5) && (b = ((hp5) v).b()) != null) {
                Object f = b.f();
                f.getClass();
                ud6 ud6Var2 = (ud6) f;
                qm7Var = b;
                ud6Var = ud6Var2;
                g8aVar = g8aVar2;
                if (!ud6Var.equals(qm7Var)) {
                }
            }
        } else if (b2 == 1) {
            ixe.b(obj);
        } else {
            if (b2 != 2) {
                grb.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ud6Var = this.c;
            qm7Var = this.b;
            g8aVar = (g8a) this.e;
            ixe.b(obj);
            ud6Var = ud6Var.g();
            if (!ud6Var.equals(qm7Var)) {
                if (ud6Var instanceof yg2) {
                    yg2 yg2Var = (yg2) ud6Var;
                    ah2 ah2Var2 = yg2Var.e;
                    this.e = g8aVar;
                    this.b = qm7Var;
                    this.c = yg2Var;
                    this.d = (byte) 2;
                    g8aVar.c(ah2Var2, this);
                    return vx2Var;
                }
                ud6Var = ud6Var.g();
                if (!ud6Var.equals(qm7Var)) {
                }
            }
        }
        return f9c.a;
    }
}
