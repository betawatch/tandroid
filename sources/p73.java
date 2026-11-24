// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p73 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ v73 d;
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p73(v73 v73Var, int i, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.d = v73Var;
        this.e = i;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        int i = this.e;
        v73 v73Var = this.d;
        switch (b) {
            case 0:
                p73 p73Var = new p73(v73Var, i, fw2Var, (byte) 0);
                p73Var.c = ((Boolean) obj).booleanValue();
                return p73Var;
            default:
                p73 p73Var2 = new p73(v73Var, i, fw2Var, (byte) 1);
                p73Var2.c = ((Boolean) obj).booleanValue();
                return p73Var2;
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
        }
        return ((p73) create(bool, fw2Var)).invokeSuspend(g5cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        fwa fwaVar;
        boolean z;
        boolean z2;
        Object obj2;
        byte b = this.a;
        int i = this.e;
        bx2 bx2Var = bx2.a;
        v73 v73Var = this.d;
        switch (b) {
            case 0:
                boolean z3 = this.b;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        kp5 c = v73Var.c();
                        this.f = th;
                        this.c = z3;
                        this.b = (byte) 2;
                        Object b2 = c.b(this);
                        if (b2 == bx2Var) {
                            return bx2Var;
                        }
                        obj = b2;
                        th = th;
                        z3 = z3;
                    }
                }
                if (z3 == 0) {
                    qse.b(obj);
                    boolean z4 = this.c;
                    this.c = z4;
                    this.b = (byte) 1;
                    obj = v73Var.h(z4, this);
                    z3 = z4;
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (z3 != 1) {
                        if (z3 != 2) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.c;
                        th = (Throwable) this.f;
                        qse.b(obj);
                        z3 = z5;
                        i = ((Number) obj).intValue();
                        th = th;
                        fwaVar = new l19(i, th);
                        z = z3;
                        return new ku7(fwaVar, Boolean.valueOf(z));
                    }
                    boolean z6 = this.c;
                    qse.b(obj);
                    z3 = z6;
                }
                fwaVar = (fwa) obj;
                z = z3;
                return new ku7(fwaVar, Boolean.valueOf(z));
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    qse.b(obj);
                    z2 = this.c;
                    this.c = z2;
                    this.b = (byte) 1;
                    obj = ((hb4) v73Var.j.getValue()).a(new e73(3, (fw2) null), this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.f;
                        qse.b(obj);
                        i = ((Number) obj).intValue();
                        obj = obj2;
                        return new s53(obj == null ? obj.hashCode() : 0, i, obj);
                    }
                    z2 = this.c;
                    qse.b(obj);
                }
                if (z2) {
                    kp5 c2 = v73Var.c();
                    this.f = obj;
                    this.b = (byte) 2;
                    Object b4 = c2.b(this);
                    if (b4 == bx2Var) {
                        return bx2Var;
                    }
                    Object obj3 = obj;
                    obj = b4;
                    obj2 = obj3;
                    i = ((Number) obj).intValue();
                    obj = obj2;
                }
                return new s53(obj == null ? obj.hashCode() : 0, i, obj);
        }
    }
}
