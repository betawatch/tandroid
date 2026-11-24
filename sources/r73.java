// default package

import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class r73 extends ccb implements qp4 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public final /* synthetic */ v73 c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r73(c59 c59Var, v73 v73Var, a59 a59Var, fw2 fw2Var) {
        super(1, fw2Var);
        this.e = c59Var;
        this.c = v73Var;
        this.f = a59Var;
    }

    @Override // of0
    public final fw2 create(fw2 fw2Var) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        v73 v73Var = this.c;
        switch (b) {
            case 0:
                return new r73((c59) obj2, v73Var, (a59) obj, fw2Var);
            default:
                return new r73(v73Var, (sw2) obj2, (eq4) obj, fw2Var);
        }
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        fw2 fw2Var = (fw2) obj;
        switch (b) {
        }
        return ((r73) create(fw2Var)).invokeSuspend(g5cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c59 c59Var;
        a59 a59Var;
        s53 s53Var;
        Object obj2;
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        bx2 bx2Var = bx2.a;
        v73 v73Var = this.c;
        fw2 fw2Var = null;
        switch (b) {
            case 0:
                a59 a59Var2 = (a59) obj3;
                c59 c59Var2 = (c59) obj4;
                byte b2 = this.b;
                try {
                } catch (fx2 unused) {
                    Object obj5 = c59Var2.a;
                    this.d = a59Var2;
                    this.b = (byte) 3;
                    obj = v73Var.i(obj5, true, this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                }
                if (b2 == 0) {
                    qse.b(obj);
                    this.d = c59Var2;
                    this.b = (byte) 1;
                    obj = ((hb4) v73Var.j.getValue()).a(new e73(3, (fw2) null), this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                    c59Var = c59Var2;
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            a59Var = (a59) ((Serializable) this.d);
                            qse.b(obj);
                            a59Var.a = ((Number) obj).intValue();
                            return g5c.a;
                        }
                        if (b2 != 3) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a59Var2 = (a59) ((Serializable) this.d);
                        qse.b(obj);
                        a59Var2.a = ((Number) obj).intValue();
                        return g5c.a;
                    }
                    c59Var = (c59) ((Serializable) this.d);
                    qse.b(obj);
                }
                c59Var.a = obj;
                kp5 c = v73Var.c();
                this.d = a59Var2;
                this.b = (byte) 2;
                obj = c.b(this);
                if (obj == bx2Var) {
                    return bx2Var;
                }
                a59Var = a59Var2;
                a59Var.a = ((Number) obj).intValue();
                return g5c.a;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    qse.b(obj);
                    this.b = (byte) 1;
                    obj = v73Var.h(true, this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 != 3) {
                                sc8.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.d;
                            qse.b(obj);
                            return obj6;
                        }
                        s53Var = (s53) this.d;
                        qse.b(obj);
                        obj2 = s53Var.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == s53Var.c) {
                            sc8.j("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!rp5.a(s53Var.b, obj)) {
                            this.d = obj;
                            this.b = (byte) 3;
                            if (v73Var.i(obj, true, this) == bx2Var) {
                                return bx2Var;
                            }
                        }
                        return obj;
                    }
                    qse.b(obj);
                }
                s53Var = (s53) obj;
                ai1 ai1Var = new ai1((eq4) obj3, s53Var, fw2Var, (byte) 4);
                this.d = s53Var;
                this.b = (byte) 2;
                obj = ppd.c((sw2) obj4, ai1Var, this);
                if (obj == bx2Var) {
                    return bx2Var;
                }
                obj2 = s53Var.b;
                if ((obj2 == null ? obj2.hashCode() : 0) == s53Var.c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r73(v73 v73Var, sw2 sw2Var, eq4 eq4Var, fw2 fw2Var) {
        super(1, fw2Var);
        this.c = v73Var;
        this.e = sw2Var;
        this.f = eq4Var;
    }
}
