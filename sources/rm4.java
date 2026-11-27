// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rm4 implements mm4 {
    public final /* synthetic */ wz4 a;
    public final /* synthetic */ x73 b;

    public rm4(wz4 wz4Var, x73 x73Var) {
        this.a = wz4Var;
        this.b = x73Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(5:(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|30|31|(3:33|15|16)|34))|30|31|(0)|34)|45|6|7|(0)(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        if (r10.k(r9, r0) != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        r10 = new irb(r9);
        r9 = r8.b;
        r0.d = r9;
        r0.e = null;
        r0.b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (xle.a(r10, r9, r9, r0) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // mm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(nm4 nm4Var, zw2 zw2Var) {
        qm4 qm4Var;
        int i;
        vx2 vx2Var;
        gs9 gs9Var;
        gs9 gs9Var2;
        x73 x73Var;
        try {
            if (zw2Var instanceof qm4) {
                qm4Var = (qm4) zw2Var;
                int i2 = qm4Var.b;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    qm4Var.b = i2 - TLObject.FLAG_31;
                    Object obj = qm4Var.a;
                    i = qm4Var.b;
                    vx2Var = vx2.a;
                    if (i != 0) {
                        ixe.b(obj);
                        wz4 wz4Var = this.a;
                        qm4Var.d = this;
                        qm4Var.e = nm4Var;
                        qm4Var.b = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) qm4Var.d;
                                ixe.b(obj);
                                throw th;
                            }
                            if (i != 3) {
                                grb.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gs9Var2 = (gs9) qm4Var.d;
                            try {
                                ixe.b(obj);
                                gs9Var2.releaseIntercepted();
                                return f9c.a;
                            } catch (Throwable th2) {
                                th = th2;
                                gs9Var2.releaseIntercepted();
                                throw th;
                            }
                        }
                        nm4Var = qm4Var.e;
                        this = (rm4) qm4Var.d;
                        ixe.b(obj);
                    }
                    gs9Var = new gs9(nm4Var, qm4Var.getContext());
                    x73Var = this.b;
                    qm4Var.d = gs9Var;
                    qm4Var.e = null;
                    qm4Var.b = 3;
                    if (x73Var.a(gs9Var, null, qm4Var) != vx2Var) {
                        gs9Var2 = gs9Var;
                        gs9Var2.releaseIntercepted();
                        return f9c.a;
                    }
                    return vx2Var;
                }
            }
            x73Var = this.b;
            qm4Var.d = gs9Var;
            qm4Var.e = null;
            qm4Var.b = 3;
            if (x73Var.a(gs9Var, null, qm4Var) != vx2Var) {
            }
            return vx2Var;
        } catch (Throwable th3) {
            th = th3;
            gs9Var2 = gs9Var;
            gs9Var2.releaseIntercepted();
            throw th;
        }
        qm4Var = new qm4(this, zw2Var);
        Object obj2 = qm4Var.a;
        i = qm4Var.b;
        vx2Var = vx2.a;
        if (i != 0) {
        }
        gs9Var = new gs9(nm4Var, qm4Var.getContext());
    }
}
