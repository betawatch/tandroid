// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uk4 implements ik4 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final ccb d;

    public uk4(ik4 ik4Var, sw2 sw2Var) {
        this.b = sw2Var;
        this.c = edd.b(sw2Var);
        this.d = new ai1(ik4Var, null, (byte) 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r13 != r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    @Override // ik4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, fw2 fw2Var) {
        tk4 tk4Var;
        Object obj2;
        int i;
        byte b = this.a;
        g5c g5cVar = g5c.a;
        bx2 bx2Var = bx2.a;
        ccb ccbVar = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                if (fw2Var instanceof tk4) {
                    tk4Var = (tk4) fw2Var;
                    int i2 = tk4Var.e;
                    if ((i2 & TLObject.FLAG_31) != 0) {
                        tk4Var.e = i2 - TLObject.FLAG_31;
                        obj2 = tk4Var.c;
                        i = tk4Var.e;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    obj = tk4Var.b;
                                    this = tk4Var.a;
                                    qse.b(obj2);
                                } else if (i != 3) {
                                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            qse.b(obj2);
                            return g5cVar;
                        }
                        qse.b(obj2);
                        if (!((z49) obj4).a) {
                            tk4Var.a = this;
                            tk4Var.b = obj;
                            tk4Var.e = 2;
                            obj2 = ((d73) ccbVar).invoke(obj, tk4Var);
                            break;
                        } else {
                            tk4Var.e = 1;
                            if (((ik4) obj3).c(obj, tk4Var) != bx2Var) {
                                return g5cVar;
                            }
                        }
                        return bx2Var;
                        if (!((Boolean) obj2).booleanValue()) {
                            return g5cVar;
                        }
                        ((z49) this.b).a = true;
                        ik4 ik4Var = (ik4) this.c;
                        tk4Var.a = null;
                        tk4Var.b = null;
                        tk4Var.e = 3;
                        if (ik4Var.c(obj, tk4Var) != bx2Var) {
                            return g5cVar;
                        }
                        return bx2Var;
                    }
                }
                tk4Var = new tk4(this, fw2Var);
                obj2 = tk4Var.c;
                i = tk4Var.e;
                if (i == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            default:
                Object a = tqd.a((sw2) obj4, obj, obj3, (ai1) ccbVar, fw2Var);
                return a == bx2Var ? a : g5cVar;
        }
    }

    public uk4(z49 z49Var, ik4 ik4Var, d73 d73Var) {
        this.b = z49Var;
        this.c = ik4Var;
        this.d = d73Var;
    }
}
