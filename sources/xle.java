// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class xle {
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(irb irbVar, x73 x73Var, Throwable th, zw2 zw2Var) {
        pm4 pm4Var;
        int i;
        try {
            if (zw2Var instanceof pm4) {
                pm4Var = (pm4) zw2Var;
                int i2 = pm4Var.c;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    pm4Var.c = i2 - TLObject.FLAG_31;
                    Object obj = pm4Var.b;
                    i = pm4Var.c;
                    if (i != 0) {
                        ixe.b(obj);
                        pm4Var.a = th;
                        pm4Var.c = 1;
                        Object a = x73Var.a(irbVar, th, pm4Var);
                        Object obj2 = vx2.a;
                        if (a == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = pm4Var.a;
                        ixe.b(obj);
                    }
                    return f9c.a;
                }
            }
            if (i != 0) {
            }
            return f9c.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                kke.a(th2, th);
            }
            throw th2;
        }
        pm4Var = new pm4(zw2Var);
        Object obj3 = pm4Var.b;
        i = pm4Var.c;
    }
}
