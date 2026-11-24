// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qte {
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hn8 hn8Var, dd4 dd4Var, qx2 qx2Var) {
        gn8 gn8Var;
        int i;
        try {
            if (qx2Var instanceof gn8) {
                gn8Var = (gn8) qx2Var;
                int i2 = gn8Var.c;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    gn8Var.c = i2 - TLObject.FLAG_31;
                    Object obj = gn8Var.b;
                    i = gn8Var.c;
                    if (i != 0) {
                        tue.b(obj);
                        if (gn8Var.getContext().get(nf5.c) != hn8Var) {
                            dq9.m("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        gn8Var.a = dd4Var;
                        gn8Var.c = 1;
                        vb1 vb1Var = new vb1(1, fne.a(gn8Var));
                        vb1Var.s();
                        hn8Var.S(new z23(vb1Var, (byte) 1));
                        Object q = vb1Var.q();
                        ly2 ly2Var = ly2.a;
                        if (q == ly2Var) {
                            return ly2Var;
                        }
                    } else {
                        if (i != 1) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dd4Var = gn8Var.a;
                        tue.b(obj);
                    }
                    dd4Var.invoke();
                    return g7c.a;
                }
            }
            if (i != 0) {
            }
            dd4Var.invoke();
            return g7c.a;
        } catch (Throwable th) {
            dd4Var.invoke();
            throw th;
        }
        gn8Var = new gn8(qx2Var);
        Object obj2 = gn8Var.b;
        i = gn8Var.c;
    }
}
