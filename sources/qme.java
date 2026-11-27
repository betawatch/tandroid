// default package

import java.util.NoSuchElementException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class qme {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(mm4 mm4Var, ax2 ax2Var) {
        en4 en4Var;
        int i;
        ow5 ow5Var;
        p89 p89Var;
        j1 e;
        dn4 dn4Var;
        Object obj;
        if (ax2Var instanceof en4) {
            en4Var = (en4) ax2Var;
            int i2 = en4Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                en4Var.d = i2 - TLObject.FLAG_31;
                Object obj2 = en4Var.c;
                i = en4Var.d;
                ow5Var = sfd.a;
                if (i != 0) {
                    ixe.b(obj2);
                    p89 p89Var2 = new p89();
                    p89Var2.a = ow5Var;
                    dn4 dn4Var2 = new dn4(p89Var2, (byte) 0);
                    try {
                        en4Var.a = p89Var2;
                        en4Var.b = dn4Var2;
                        en4Var.d = 1;
                        Object k = mm4Var.k(dn4Var2, en4Var);
                        Object obj3 = vx2.a;
                        if (k == obj3) {
                            return obj3;
                        }
                        p89Var = p89Var2;
                    } catch (j1 e2) {
                        p89Var = p89Var2;
                        e = e2;
                        dn4Var = dn4Var2;
                        if (e.a != dn4Var) {
                            throw e;
                        }
                        obj = p89Var.a;
                        if (obj == ow5Var) {
                        }
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dn4Var = en4Var.b;
                    p89Var = en4Var.a;
                    try {
                        ixe.b(obj2);
                    } catch (j1 e3) {
                        e = e3;
                        if (e.a != dn4Var) {
                        }
                        obj = p89Var.a;
                        if (obj == ow5Var) {
                        }
                    }
                }
                obj = p89Var.a;
                if (obj == ow5Var) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        en4Var = new en4(ax2Var);
        Object obj22 = en4Var.c;
        i = en4Var.d;
        ow5Var = sfd.a;
        if (i != 0) {
        }
        obj = p89Var.a;
        if (obj == ow5Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(mm4 mm4Var, ax2 ax2Var) {
        fn4 fn4Var;
        int i;
        p89 p89Var;
        j1 e;
        dn4 dn4Var;
        if (ax2Var instanceof fn4) {
            fn4Var = (fn4) ax2Var;
            int i2 = fn4Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                fn4Var.d = i2 - TLObject.FLAG_31;
                Object obj = fn4Var.c;
                i = fn4Var.d;
                if (i != 0) {
                    ixe.b(obj);
                    p89 p89Var2 = new p89();
                    dn4 dn4Var2 = new dn4(p89Var2, (byte) 1);
                    try {
                        fn4Var.a = p89Var2;
                        fn4Var.b = dn4Var2;
                        fn4Var.d = 1;
                        Object k = mm4Var.k(dn4Var2, fn4Var);
                        Object obj2 = vx2.a;
                        if (k == obj2) {
                            return obj2;
                        }
                        p89Var = p89Var2;
                    } catch (j1 e2) {
                        p89Var = p89Var2;
                        e = e2;
                        dn4Var = dn4Var2;
                        if (e.a != dn4Var) {
                        }
                        return p89Var.a;
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dn4Var = fn4Var.b;
                    p89Var = fn4Var.a;
                    try {
                        ixe.b(obj);
                    } catch (j1 e3) {
                        e = e3;
                        if (e.a != dn4Var) {
                            throw e;
                        }
                        return p89Var.a;
                    }
                }
                return p89Var.a;
            }
        }
        fn4Var = new fn4(ax2Var);
        Object obj3 = fn4Var.c;
        i = fn4Var.d;
        if (i != 0) {
        }
        return p89Var.a;
    }
}
