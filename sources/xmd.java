// default package

import java.util.Collection;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class xmd {
    public static final Object a(zc3[] zc3VarArr, ccb ccbVar) {
        if (zc3VarArr.length == 0) {
            return c24.a;
        }
        wc0 wc0Var = new wc0(zc3VarArr);
        na1 na1Var = new na1(1, dle.a(ccbVar));
        na1Var.s();
        int length = zc3VarArr.length;
        uc0[] uc0VarArr = new uc0[length];
        for (int i = 0; i < length; i++) {
            zc3 zc3Var = zc3VarArr[i];
            zc3Var.start();
            uc0 uc0Var = new uc0(wc0Var, na1Var);
            uc0Var.f = nle.c(zc3Var, true, uc0Var);
            uc0VarArr[i] = uc0Var;
        }
        vc0 vc0Var = new vc0(uc0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            uc0 uc0Var2 = uc0VarArr[i2];
            uc0Var2.getClass();
            ex.a.putObjectVolatile(uc0Var2, uc0.n, vc0Var);
        }
        if (na1Var.r() instanceof tj7) {
            na1Var.v(vc0Var);
        } else {
            vc0Var.b();
        }
        return na1Var.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Collection collection, gw2 gw2Var) {
        yc0 yc0Var;
        int i;
        Iterator it;
        if (gw2Var instanceof yc0) {
            yc0Var = (yc0) gw2Var;
            int i2 = yc0Var.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                yc0Var.c = i2 - TLObject.FLAG_31;
                Object obj = yc0Var.b;
                i = yc0Var.c;
                if (i != 0) {
                    qse.b(obj);
                    it = collection.iterator();
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = yc0Var.a;
                    qse.b(obj);
                }
                while (it.hasNext()) {
                    bt5 bt5Var = (bt5) it.next();
                    yc0Var.a = it;
                    yc0Var.c = 1;
                    Object join = bt5Var.join(yc0Var);
                    bx2 bx2Var = bx2.a;
                    if (join == bx2Var) {
                        return bx2Var;
                    }
                }
                return g5c.a;
            }
        }
        yc0Var = new yc0(gw2Var);
        Object obj2 = yc0Var.b;
        i = yc0Var.c;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return g5c.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:10:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(bt5[] bt5VarArr, gw2 gw2Var) {
        xc0 xc0Var;
        int i;
        int i2;
        bt5[] bt5VarArr2;
        int length;
        if (gw2Var instanceof xc0) {
            xc0Var = (xc0) gw2Var;
            int i3 = xc0Var.e;
            if ((i3 & TLObject.FLAG_31) != 0) {
                xc0Var.e = i3 - TLObject.FLAG_31;
                Object obj = xc0Var.d;
                i = xc0Var.e;
                if (i != 0) {
                    qse.b(obj);
                    i2 = 0;
                    bt5VarArr2 = bt5VarArr;
                    length = bt5VarArr.length;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = xc0Var.c;
                    i2 = xc0Var.b;
                    bt5[] bt5VarArr3 = (bt5[]) xc0Var.a;
                    qse.b(obj);
                    bt5VarArr2 = bt5VarArr3;
                    i2++;
                    if (i2 < length) {
                        bt5 bt5Var = bt5VarArr2[i2];
                        xc0Var.a = bt5VarArr2;
                        xc0Var.b = i2;
                        xc0Var.c = length;
                        xc0Var.e = 1;
                        Object join = bt5Var.join(xc0Var);
                        bx2 bx2Var = bx2.a;
                        if (join == bx2Var) {
                            return bx2Var;
                        }
                        i2++;
                        if (i2 < length) {
                            return g5c.a;
                        }
                    }
                }
            }
        }
        xc0Var = new xc0(gw2Var);
        Object obj2 = xc0Var.d;
        i = xc0Var.e;
        if (i != 0) {
        }
    }
}
