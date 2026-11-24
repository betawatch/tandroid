// default package

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rk4 implements ik4 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ik4 b;
    public final /* synthetic */ Serializable c;

    public rk4(ik4 ik4Var, c59 c59Var) {
        this.b = ik4Var;
        this.c = c59Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r11.c(r10, r0) == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r11 != r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Type inference failed for: r9v14 */
    @Override // ik4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, fw2 fw2Var) {
        qk4 qk4Var;
        int i;
        xk4 xk4Var;
        Object obj2;
        int i2;
        ?? r9;
        rk4 rk4Var;
        byte b = this.a;
        Object obj3 = g5c.a;
        Object obj4 = bx2.a;
        boolean z = true;
        switch (b) {
            case 0:
                try {
                    if (fw2Var instanceof qk4) {
                        qk4Var = (qk4) fw2Var;
                        int i3 = qk4Var.d;
                        if ((i3 & TLObject.FLAG_31) != 0) {
                            qk4Var.d = i3 - TLObject.FLAG_31;
                            Object obj5 = qk4Var.b;
                            i = qk4Var.d;
                            if (i != 0) {
                                qse.b(obj5);
                                ik4 ik4Var = this.b;
                                qk4Var.a = this;
                                qk4Var.d = 1;
                                Object c = ik4Var.c(obj, qk4Var);
                                this = c;
                                if (c == obj4) {
                                    obj3 = obj4;
                                    this = c;
                                }
                            } else {
                                if (i != 1) {
                                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                rk4 rk4Var2 = qk4Var.a;
                                qse.b(obj5);
                                this = rk4Var2;
                            }
                            return obj3;
                        }
                    }
                    if (i != 0) {
                    }
                    return obj3;
                } catch (Throwable th) {
                    ((c59) this.c).a = th;
                    throw th;
                }
                qk4Var = new qk4(this, fw2Var);
                Object obj52 = qk4Var.b;
                i = qk4Var.d;
            default:
                if (fw2Var instanceof xk4) {
                    xk4Var = (xk4) fw2Var;
                    int i4 = xk4Var.c;
                    if ((i4 & TLObject.FLAG_31) != 0) {
                        xk4Var.c = i4 - TLObject.FLAG_31;
                        obj2 = xk4Var.b;
                        i2 = xk4Var.c;
                        if (i2 != 0) {
                            qse.b(obj2);
                            c73 c73Var = (c73) this.c;
                            xk4Var.a = this;
                            xk4Var.e = obj;
                            xk4Var.c = 1;
                            obj2 = c73Var.invoke(obj, xk4Var);
                            this = this;
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                rk4 rk4Var3 = xk4Var.a;
                                qse.b(obj2);
                                rk4Var = rk4Var3;
                                if (z) {
                                    return obj3;
                                }
                                throw new i1(rk4Var);
                            }
                            obj = xk4Var.e;
                            rk4 rk4Var4 = xk4Var.a;
                            qse.b(obj2);
                            r9 = rk4Var4;
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            ik4 ik4Var2 = r9.b;
                            xk4Var.a = r9;
                            xk4Var.e = null;
                            xk4Var.c = 2;
                            rk4Var = r9;
                            break;
                        } else {
                            z = false;
                            rk4Var = r9;
                        }
                        if (z) {
                        }
                    }
                }
                xk4Var = new xk4(this, fw2Var);
                obj2 = xk4Var.b;
                i2 = xk4Var.c;
                if (i2 != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
        }
    }

    public rk4(c73 c73Var, ik4 ik4Var) {
        this.c = c73Var;
        this.b = ik4Var;
    }
}
