// default package

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xm4 implements nm4 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ nm4 b;
    public final /* synthetic */ Serializable c;

    public xm4(nm4 nm4Var, p89 p89Var) {
        this.b = nm4Var;
        this.c = p89Var;
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
    @Override // nm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, zw2 zw2Var) {
        wm4 wm4Var;
        int i;
        cn4 cn4Var;
        Object obj2;
        int i2;
        ?? r9;
        xm4 xm4Var;
        byte b = this.a;
        Object obj3 = f9c.a;
        Object obj4 = vx2.a;
        boolean z = true;
        switch (b) {
            case 0:
                try {
                    if (zw2Var instanceof wm4) {
                        wm4Var = (wm4) zw2Var;
                        int i3 = wm4Var.d;
                        if ((i3 & TLObject.FLAG_31) != 0) {
                            wm4Var.d = i3 - TLObject.FLAG_31;
                            Object obj5 = wm4Var.b;
                            i = wm4Var.d;
                            if (i != 0) {
                                ixe.b(obj5);
                                nm4 nm4Var = this.b;
                                wm4Var.a = this;
                                wm4Var.d = 1;
                                Object c = nm4Var.c(obj, wm4Var);
                                this = c;
                                if (c == obj4) {
                                    obj3 = obj4;
                                    this = c;
                                }
                            } else {
                                if (i != 1) {
                                    grb.i("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                xm4 xm4Var2 = wm4Var.a;
                                ixe.b(obj5);
                                this = xm4Var2;
                            }
                            return obj3;
                        }
                    }
                    if (i != 0) {
                    }
                    return obj3;
                } catch (Throwable th) {
                    ((p89) this.c).a = th;
                    throw th;
                }
                wm4Var = new wm4(this, zw2Var);
                Object obj52 = wm4Var.b;
                i = wm4Var.d;
            default:
                if (zw2Var instanceof cn4) {
                    cn4Var = (cn4) zw2Var;
                    int i4 = cn4Var.c;
                    if ((i4 & TLObject.FLAG_31) != 0) {
                        cn4Var.c = i4 - TLObject.FLAG_31;
                        obj2 = cn4Var.b;
                        i2 = cn4Var.c;
                        if (i2 != 0) {
                            ixe.b(obj2);
                            v73 v73Var = (v73) this.c;
                            cn4Var.a = this;
                            cn4Var.e = obj;
                            cn4Var.c = 1;
                            obj2 = v73Var.invoke(obj, cn4Var);
                            this = this;
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    grb.i("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                xm4 xm4Var3 = cn4Var.a;
                                ixe.b(obj2);
                                xm4Var = xm4Var3;
                                if (z) {
                                    return obj3;
                                }
                                throw new j1(xm4Var);
                            }
                            obj = cn4Var.e;
                            xm4 xm4Var4 = cn4Var.a;
                            ixe.b(obj2);
                            r9 = xm4Var4;
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            nm4 nm4Var2 = r9.b;
                            cn4Var.a = r9;
                            cn4Var.e = null;
                            cn4Var.c = 2;
                            xm4Var = r9;
                            break;
                        } else {
                            z = false;
                            xm4Var = r9;
                        }
                        if (z) {
                        }
                    }
                }
                cn4Var = new cn4(this, zw2Var);
                obj2 = cn4Var.b;
                i2 = cn4Var.c;
                if (i2 != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
        }
    }

    public xm4(v73 v73Var, nm4 nm4Var) {
        this.c = v73Var;
        this.b = nm4Var;
    }
}
