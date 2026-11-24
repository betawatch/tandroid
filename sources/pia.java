// default package

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pia implements kp5 {
    public final nh7 a = new nh7();
    public final i4d b = new i4d((byte) 7);
    public final v39 c = new v39(new oia(2, null), 5);

    public pia(String str) {
    }

    @Override // kp5
    public final Object a(u73 u73Var) {
        return new Integer(((AtomicInteger) this.b.a).incrementAndGet());
    }

    @Override // kp5
    public final Object b(fw2 fw2Var) {
        return new Integer(((AtomicInteger) this.b.a).get());
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
    /* JADX WARN: Type inference failed for: r6v0, types: [pia] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [nh7] */
    @Override // kp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(qp4 qp4Var, fw2 fw2Var) {
        mia miaVar;
        int i;
        Object obj;
        Object obj2;
        try {
            if (fw2Var instanceof mia) {
                miaVar = (mia) fw2Var;
                int i2 = miaVar.e;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    miaVar.e = i2 - TLObject.FLAG_31;
                    Object obj3 = miaVar.c;
                    i = miaVar.e;
                    bx2 bx2Var = bx2.a;
                    if (i != 0) {
                        qse.b(obj3);
                        miaVar.a = qp4Var;
                        nh7 nh7Var = this.a;
                        miaVar.b = nh7Var;
                        miaVar.e = 1;
                        Object d = nh7Var.d(miaVar);
                        obj = nh7Var;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                sc8.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj4 = (lh7) miaVar.a;
                            qse.b(obj3);
                            obj2 = obj4;
                            return obj3;
                        }
                        Object obj5 = miaVar.b;
                        qp4Var = (qp4) miaVar.a;
                        qse.b(obj3);
                        obj = obj5;
                    }
                    miaVar.a = obj;
                    miaVar.b = null;
                    miaVar.e = 2;
                    obj3 = qp4Var.invoke(miaVar);
                    obj2 = obj;
                }
            }
            if (i != 0) {
            }
            miaVar.a = obj;
            miaVar.b = null;
            miaVar.e = 2;
            obj3 = qp4Var.invoke(miaVar);
            obj2 = obj;
        } finally {
            ((nh7) this).f(null);
        }
        miaVar = new mia(this, fw2Var);
        Object obj32 = miaVar.c;
        i = miaVar.e;
        bx2 bx2Var2 = bx2.a;
    }

    @Override // kp5
    public final hk4 d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // kp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(eq4 eq4Var, fw2 fw2Var) {
        nia niaVar;
        int i;
        nh7 nh7Var;
        boolean z;
        Throwable th;
        if (fw2Var instanceof nia) {
            niaVar = (nia) fw2Var;
            int i2 = niaVar.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                niaVar.e = i2 - TLObject.FLAG_31;
                Object obj = niaVar.c;
                i = niaVar.e;
                if (i != 0) {
                    qse.b(obj);
                    nh7 nh7Var2 = this.a;
                    boolean e = nh7Var2.e();
                    try {
                        Object valueOf = Boolean.valueOf(e);
                        niaVar.a = nh7Var2;
                        niaVar.b = e;
                        niaVar.e = 1;
                        Object invoke = eq4Var.invoke(valueOf, niaVar);
                        Object obj2 = bx2.a;
                        if (invoke == obj2) {
                            return obj2;
                        }
                        nh7Var = nh7Var2;
                        z = e;
                        obj = invoke;
                    } catch (Throwable th2) {
                        nh7Var = nh7Var2;
                        z = e;
                        th = th2;
                        if (z) {
                            nh7Var.f(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = niaVar.b;
                    nh7Var = niaVar.a;
                    try {
                        qse.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    nh7Var.f(null);
                }
                return obj;
            }
        }
        niaVar = new nia(this, fw2Var);
        Object obj3 = niaVar.c;
        i = niaVar.e;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}
