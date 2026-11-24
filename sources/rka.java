// default package

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rka implements kr5 {
    public final qj7 a = new qj7();
    public final k6d b = new k6d((byte) 7);
    public final oo8 c = new oo8(new qka(2, null), 9);

    public rka(String str) {
    }

    @Override // kr5
    public final Object a(g93 g93Var) {
        return new Integer(((AtomicInteger) this.b.b).incrementAndGet());
    }

    @Override // kr5
    public final Object b(px2 px2Var) {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r8 != r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r8 != r5) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [rka] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [qj7] */
    @Override // kr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rr4 rr4Var, px2 px2Var) {
        oka okaVar;
        int i;
        Object obj;
        Object obj2;
        try {
            if (px2Var instanceof oka) {
                okaVar = (oka) px2Var;
                int i2 = okaVar.e;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    okaVar.e = i2 - TLObject.FLAG_31;
                    Object obj3 = okaVar.c;
                    i = okaVar.e;
                    ly2 ly2Var = ly2.a;
                    if (i != 0) {
                        tue.b(obj3);
                        okaVar.a = rr4Var;
                        qj7 qj7Var = this.a;
                        okaVar.b = qj7Var;
                        okaVar.e = 1;
                        Object d = qj7Var.d(okaVar);
                        obj = qj7Var;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                dq9.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj4 = (oj7) okaVar.a;
                            tue.b(obj3);
                            obj2 = obj4;
                            return obj3;
                        }
                        Object obj5 = okaVar.b;
                        rr4Var = (rr4) okaVar.a;
                        tue.b(obj3);
                        obj = obj5;
                    }
                    okaVar.a = obj;
                    okaVar.b = null;
                    okaVar.e = 2;
                    obj3 = rr4Var.invoke(okaVar);
                    obj2 = obj;
                }
            }
            if (i != 0) {
            }
            okaVar.a = obj;
            okaVar.b = null;
            okaVar.e = 2;
            obj3 = rr4Var.invoke(okaVar);
            obj2 = obj;
        } finally {
            ((qj7) this).f(null);
        }
        okaVar = new oka(this, px2Var);
        Object obj32 = okaVar.c;
        i = okaVar.e;
        ly2 ly2Var2 = ly2.a;
    }

    @Override // kr5
    public final im4 d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // kr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(fs4 fs4Var, px2 px2Var) {
        pka pkaVar;
        int i;
        qj7 qj7Var;
        boolean z;
        Throwable th;
        if (px2Var instanceof pka) {
            pkaVar = (pka) px2Var;
            int i2 = pkaVar.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                pkaVar.e = i2 - TLObject.FLAG_31;
                Object obj = pkaVar.c;
                i = pkaVar.e;
                if (i != 0) {
                    tue.b(obj);
                    qj7 qj7Var2 = this.a;
                    boolean e = qj7Var2.e();
                    try {
                        Object valueOf = Boolean.valueOf(e);
                        pkaVar.a = qj7Var2;
                        pkaVar.b = e;
                        pkaVar.e = 1;
                        Object invoke = fs4Var.invoke(valueOf, pkaVar);
                        Object obj2 = ly2.a;
                        if (invoke == obj2) {
                            return obj2;
                        }
                        qj7Var = qj7Var2;
                        z = e;
                        obj = invoke;
                    } catch (Throwable th2) {
                        qj7Var = qj7Var2;
                        z = e;
                        th = th2;
                        if (z) {
                            qj7Var.f(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = pkaVar.b;
                    qj7Var = pkaVar.a;
                    try {
                        tue.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    qj7Var.f(null);
                }
                return obj;
            }
        }
        pkaVar = new pka(this, px2Var);
        Object obj3 = pkaVar.c;
        i = pkaVar.e;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}
