// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class um4 implements jm4 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final eeb d;

    public um4(jm4 jm4Var, cy2 cy2Var) {
        this.b = cy2Var;
        this.c = gfd.b(cy2Var);
        this.d = new hj1(jm4Var, null, (byte) 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r13 != r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    @Override // jm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, px2 px2Var) {
        tm4 tm4Var;
        Object obj2;
        int i;
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ly2 ly2Var = ly2.a;
        eeb eebVar = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                if (px2Var instanceof tm4) {
                    tm4Var = (tm4) px2Var;
                    int i2 = tm4Var.e;
                    if ((i2 & TLObject.FLAG_31) != 0) {
                        tm4Var.e = i2 - TLObject.FLAG_31;
                        obj2 = tm4Var.c;
                        i = tm4Var.e;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    obj = tm4Var.b;
                                    this = tm4Var.a;
                                    tue.b(obj2);
                                } else if (i != 3) {
                                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            tue.b(obj2);
                            return g7cVar;
                        }
                        tue.b(obj2);
                        if (!((b79) obj4).a) {
                            tm4Var.a = this;
                            tm4Var.b = obj;
                            tm4Var.e = 2;
                            obj2 = ((p83) eebVar).invoke(obj, tm4Var);
                            break;
                        } else {
                            tm4Var.e = 1;
                            if (((jm4) obj3).c(obj, tm4Var) != ly2Var) {
                                return g7cVar;
                            }
                        }
                        return ly2Var;
                        if (!((Boolean) obj2).booleanValue()) {
                            return g7cVar;
                        }
                        ((b79) this.b).a = true;
                        jm4 jm4Var = (jm4) this.c;
                        tm4Var.a = null;
                        tm4Var.b = null;
                        tm4Var.e = 3;
                        if (jm4Var.c(obj, tm4Var) != ly2Var) {
                            return g7cVar;
                        }
                        return ly2Var;
                    }
                }
                tm4Var = new tm4(this, px2Var);
                obj2 = tm4Var.c;
                i = tm4Var.e;
                if (i == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            default:
                Object a = wsd.a((cy2) obj4, obj, obj3, (hj1) eebVar, px2Var);
                return a == ly2Var ? a : g7cVar;
        }
    }

    public um4(b79 b79Var, jm4 jm4Var, p83 p83Var) {
        this.b = b79Var;
        this.c = jm4Var;
        this.d = p83Var;
    }
}
