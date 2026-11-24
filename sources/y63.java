// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class y63 {
    public final /* synthetic */ lh7 a;
    public final /* synthetic */ z49 b;
    public final /* synthetic */ c59 c;
    public final /* synthetic */ v73 d;

    public y63(lh7 lh7Var, z49 z49Var, c59 c59Var, v73 v73Var) {
        this.a = lh7Var;
        this.b = z49Var;
        this.c = c59Var;
        this.d = v73Var;
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
    /* JADX WARN: Type inference failed for: r4v3, types: [lh7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f63 f63Var, gw2 gw2Var) {
        x63 x63Var;
        int i;
        z49 z49Var;
        c59 c59Var;
        v73 v73Var;
        nh7 nh7Var;
        eq4 eq4Var;
        lh7 lh7Var;
        lh7 lh7Var2;
        c59 c59Var2;
        Object obj;
        try {
            if (gw2Var instanceof x63) {
                x63Var = (x63) gw2Var;
                int i2 = x63Var.n;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    x63Var.n = i2 - TLObject.FLAG_31;
                    Object obj2 = x63Var.f;
                    i = x63Var.n;
                    bx2 bx2Var = bx2.a;
                    if (i != 0) {
                        qse.b(obj2);
                        x63Var.a = f63Var;
                        lh7 lh7Var3 = this.a;
                        x63Var.b = lh7Var3;
                        z49Var = this.b;
                        x63Var.c = z49Var;
                        c59Var = this.c;
                        x63Var.d = c59Var;
                        v73Var = this.d;
                        x63Var.e = v73Var;
                        x63Var.n = 1;
                        nh7Var = (nh7) lh7Var3;
                        eq4Var = f63Var;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = x63Var.c;
                                c59Var2 = (c59) x63Var.b;
                                lh7Var = (lh7) x63Var.a;
                                try {
                                    qse.b(obj2);
                                    c59Var2.a = obj;
                                    Object obj3 = c59Var2.a;
                                    ((nh7) lh7Var).f(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((nh7) lh7Var).f(null);
                                    throw th;
                                }
                            }
                            v73Var = (v73) x63Var.c;
                            c59Var2 = (c59) x63Var.b;
                            lh7Var2 = (lh7) x63Var.a;
                            try {
                                qse.b(obj2);
                                if (!rp5.a(obj2, c59Var2.a)) {
                                    lh7Var = lh7Var2;
                                    Object obj32 = c59Var2.a;
                                    ((nh7) lh7Var).f(null);
                                    return obj32;
                                }
                                x63Var.a = lh7Var2;
                                x63Var.b = c59Var2;
                                x63Var.c = obj2;
                                x63Var.n = 3;
                                if (v73Var.i(obj2, false, x63Var) != bx2Var) {
                                    obj = obj2;
                                    lh7Var = lh7Var2;
                                    c59Var2.a = obj;
                                    Object obj322 = c59Var2.a;
                                    ((nh7) lh7Var).f(null);
                                    return obj322;
                                }
                                return bx2Var;
                            } catch (Throwable th2) {
                                th = th2;
                                lh7Var = lh7Var2;
                                ((nh7) lh7Var).f(null);
                                throw th;
                            }
                        }
                        v73Var = x63Var.e;
                        c59 c59Var3 = x63Var.d;
                        z49Var = (z49) x63Var.c;
                        ?? r4 = (lh7) x63Var.b;
                        eq4 eq4Var2 = (eq4) x63Var.a;
                        qse.b(obj2);
                        c59Var = c59Var3;
                        eq4Var = eq4Var2;
                        nh7Var = r4;
                    }
                    if (!z49Var.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = c59Var.a;
                    x63Var.a = nh7Var;
                    x63Var.b = c59Var;
                    x63Var.c = v73Var;
                    x63Var.d = null;
                    x63Var.e = null;
                    x63Var.n = 2;
                    Object invoke = eq4Var.invoke(obj4, x63Var);
                    if (invoke != bx2Var) {
                        lh7Var2 = nh7Var;
                        obj2 = invoke;
                        c59Var2 = c59Var;
                        if (!rp5.a(obj2, c59Var2.a)) {
                        }
                    }
                    return bx2Var;
                }
            }
            if (!z49Var.a) {
            }
        } catch (Throwable th3) {
            th = th3;
            lh7Var = nh7Var;
            ((nh7) lh7Var).f(null);
            throw th;
        }
        x63Var = new x63(this, gw2Var);
        Object obj22 = x63Var.f;
        i = x63Var.n;
        bx2 bx2Var2 = bx2.a;
        if (i != 0) {
        }
    }
}
