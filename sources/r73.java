// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class r73 {
    public final /* synthetic */ uj7 a;
    public final /* synthetic */ m89 b;
    public final /* synthetic */ p89 c;
    public final /* synthetic */ o83 d;

    public r73(uj7 uj7Var, m89 m89Var, p89 p89Var, o83 o83Var) {
        this.a = uj7Var;
        this.b = m89Var;
        this.c = p89Var;
        this.d = o83Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
    
        if (r10.d(r0) != r6) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #2 {all -> 0x00c9, blocks: (B:27:0x004b, B:28:0x00a1, B:30:0x00a9), top: B:26:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0086, B:42:0x008a, B:45:0x00cc, B:46:0x00d3), top: B:39:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0086, B:42:0x008a, B:45:0x00cc, B:46:0x00d3), top: B:39:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v3, types: [uj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y63 y63Var, ax2 ax2Var) {
        q73 q73Var;
        int i;
        m89 m89Var;
        p89 p89Var;
        o83 o83Var;
        wj7 wj7Var;
        is4 is4Var;
        uj7 uj7Var;
        uj7 uj7Var2;
        p89 p89Var2;
        Object obj;
        try {
            if (ax2Var instanceof q73) {
                q73Var = (q73) ax2Var;
                int i2 = q73Var.n;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    q73Var.n = i2 - TLObject.FLAG_31;
                    Object obj2 = q73Var.f;
                    i = q73Var.n;
                    vx2 vx2Var = vx2.a;
                    if (i != 0) {
                        ixe.b(obj2);
                        q73Var.a = y63Var;
                        uj7 uj7Var3 = this.a;
                        q73Var.b = uj7Var3;
                        m89Var = this.b;
                        q73Var.c = m89Var;
                        p89Var = this.c;
                        q73Var.d = p89Var;
                        o83Var = this.d;
                        q73Var.e = o83Var;
                        q73Var.n = 1;
                        wj7Var = (wj7) uj7Var3;
                        is4Var = y63Var;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    grb.i("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = q73Var.c;
                                p89Var2 = (p89) q73Var.b;
                                uj7Var = (uj7) q73Var.a;
                                try {
                                    ixe.b(obj2);
                                    p89Var2.a = obj;
                                    Object obj3 = p89Var2.a;
                                    ((wj7) uj7Var).f(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((wj7) uj7Var).f(null);
                                    throw th;
                                }
                            }
                            o83Var = (o83) q73Var.c;
                            p89Var2 = (p89) q73Var.b;
                            uj7Var2 = (uj7) q73Var.a;
                            try {
                                ixe.b(obj2);
                                if (!ur5.a(obj2, p89Var2.a)) {
                                    uj7Var = uj7Var2;
                                    Object obj32 = p89Var2.a;
                                    ((wj7) uj7Var).f(null);
                                    return obj32;
                                }
                                q73Var.a = uj7Var2;
                                q73Var.b = p89Var2;
                                q73Var.c = obj2;
                                q73Var.n = 3;
                                if (o83Var.i(obj2, false, q73Var) != vx2Var) {
                                    obj = obj2;
                                    uj7Var = uj7Var2;
                                    p89Var2.a = obj;
                                    Object obj322 = p89Var2.a;
                                    ((wj7) uj7Var).f(null);
                                    return obj322;
                                }
                                return vx2Var;
                            } catch (Throwable th2) {
                                th = th2;
                                uj7Var = uj7Var2;
                                ((wj7) uj7Var).f(null);
                                throw th;
                            }
                        }
                        o83Var = q73Var.e;
                        p89 p89Var3 = q73Var.d;
                        m89Var = (m89) q73Var.c;
                        ?? r4 = (uj7) q73Var.b;
                        is4 is4Var2 = (is4) q73Var.a;
                        ixe.b(obj2);
                        p89Var = p89Var3;
                        is4Var = is4Var2;
                        wj7Var = r4;
                    }
                    if (!m89Var.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = p89Var.a;
                    q73Var.a = wj7Var;
                    q73Var.b = p89Var;
                    q73Var.c = o83Var;
                    q73Var.d = null;
                    q73Var.e = null;
                    q73Var.n = 2;
                    Object invoke = is4Var.invoke(obj4, q73Var);
                    if (invoke != vx2Var) {
                        uj7Var2 = wj7Var;
                        obj2 = invoke;
                        p89Var2 = p89Var;
                        if (!ur5.a(obj2, p89Var2.a)) {
                        }
                    }
                    return vx2Var;
                }
            }
            if (!m89Var.a) {
            }
        } catch (Throwable th3) {
            th = th3;
            uj7Var = wj7Var;
            ((wj7) uj7Var).f(null);
            throw th;
        }
        q73Var = new q73(this, ax2Var);
        Object obj22 = q73Var.f;
        i = q73Var.n;
        vx2 vx2Var2 = vx2.a;
        if (i != 0) {
        }
    }
}
