// default package

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sm4 implements jm4 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ jm4 b;
    public final /* synthetic */ Serializable c;

    public sm4(jm4 jm4Var, e79 e79Var) {
        this.b = jm4Var;
        this.c = e79Var;
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
    @Override // jm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, px2 px2Var) {
        rm4 rm4Var;
        int i;
        xm4 xm4Var;
        Object obj2;
        int i2;
        ?? r9;
        sm4 sm4Var;
        byte b = this.a;
        Object obj3 = g7c.a;
        Object obj4 = ly2.a;
        boolean z = true;
        switch (b) {
            case 0:
                try {
                    if (px2Var instanceof rm4) {
                        rm4Var = (rm4) px2Var;
                        int i3 = rm4Var.d;
                        if ((i3 & TLObject.FLAG_31) != 0) {
                            rm4Var.d = i3 - TLObject.FLAG_31;
                            Object obj5 = rm4Var.b;
                            i = rm4Var.d;
                            if (i != 0) {
                                tue.b(obj5);
                                jm4 jm4Var = this.b;
                                rm4Var.a = this;
                                rm4Var.d = 1;
                                Object c = jm4Var.c(obj, rm4Var);
                                this = c;
                                if (c == obj4) {
                                    obj3 = obj4;
                                    this = c;
                                }
                            } else {
                                if (i != 1) {
                                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                sm4 sm4Var2 = rm4Var.a;
                                tue.b(obj5);
                                this = sm4Var2;
                            }
                            return obj3;
                        }
                    }
                    if (i != 0) {
                    }
                    return obj3;
                } catch (Throwable th) {
                    ((e79) this.c).a = th;
                    throw th;
                }
                rm4Var = new rm4(this, px2Var);
                Object obj52 = rm4Var.b;
                i = rm4Var.d;
            default:
                if (px2Var instanceof xm4) {
                    xm4Var = (xm4) px2Var;
                    int i4 = xm4Var.c;
                    if ((i4 & TLObject.FLAG_31) != 0) {
                        xm4Var.c = i4 - TLObject.FLAG_31;
                        obj2 = xm4Var.b;
                        i2 = xm4Var.c;
                        if (i2 != 0) {
                            tue.b(obj2);
                            o83 o83Var = (o83) this.c;
                            xm4Var.a = this;
                            xm4Var.e = obj;
                            xm4Var.c = 1;
                            obj2 = o83Var.invoke(obj, xm4Var);
                            this = this;
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                sm4 sm4Var3 = xm4Var.a;
                                tue.b(obj2);
                                sm4Var = sm4Var3;
                                if (z) {
                                    return obj3;
                                }
                                throw new i1(sm4Var);
                            }
                            obj = xm4Var.e;
                            sm4 sm4Var4 = xm4Var.a;
                            tue.b(obj2);
                            r9 = sm4Var4;
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            jm4 jm4Var2 = r9.b;
                            xm4Var.a = r9;
                            xm4Var.e = null;
                            xm4Var.c = 2;
                            sm4Var = r9;
                            break;
                        } else {
                            z = false;
                            sm4Var = r9;
                        }
                        if (z) {
                        }
                    }
                }
                xm4Var = new xm4(this, px2Var);
                obj2 = xm4Var.b;
                i2 = xm4Var.c;
                if (i2 != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
        }
    }

    public sm4(o83 o83Var, jm4 jm4Var) {
        this.c = o83Var;
        this.b = jm4Var;
    }
}
