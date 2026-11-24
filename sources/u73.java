// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class u73 extends ccb implements eq4 {
    public a59 a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a59 d;
    public final /* synthetic */ v73 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u73(a59 a59Var, v73 v73Var, Object obj, boolean z, fw2 fw2Var) {
        super(2, fw2Var);
        this.d = a59Var;
        this.e = v73Var;
        this.f = obj;
        this.h = z;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        u73 u73Var = new u73(this.d, this.e, this.f, this.h, fw2Var);
        u73Var.c = obj;
        return u73Var;
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        return ((u73) create((sb4) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.b(r2, r8) == r7) goto L15;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        sb4 sb4Var;
        a59 a59Var;
        byte b = this.b;
        Object obj2 = this.f;
        v73 v73Var = this.e;
        a59 a59Var2 = this.d;
        bx2 bx2Var = bx2.a;
        if (b == 0) {
            qse.b(obj);
            sb4 sb4Var2 = (sb4) this.c;
            kp5 c = v73Var.c();
            this.c = sb4Var2;
            this.a = a59Var2;
            this.b = (byte) 1;
            Object a = c.a(this);
            if (a != bx2Var) {
                sb4Var = sb4Var2;
                obj = a;
                a59Var = a59Var2;
            }
            return bx2Var;
        }
        if (b != 1) {
            if (b != 2) {
                sc8.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qse.b(obj);
            if (this.h) {
                v73Var.h.L(new s53(obj2 != null ? obj2.hashCode() : 0, a59Var2.a, obj2));
            }
            return g5c.a;
        }
        a59Var = this.a;
        sb4Var = (sb4) this.c;
        qse.b(obj);
        a59Var.a = ((Number) obj).intValue();
        this.c = null;
        this.a = null;
        this.b = (byte) 2;
    }
}
