// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zh1 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh1(Object obj, Object obj2, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                zh1 zh1Var = new zh1((ik4) obj3, (bi1) obj2, fw2Var, (byte) 0);
                zh1Var.c = obj;
                return zh1Var;
            default:
                zh1 zh1Var2 = new zh1((v73) obj3, (eq4) obj2, fw2Var, (byte) 1);
                zh1Var2.c = obj;
                return zh1Var2;
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
        }
        return ((zh1) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        bx2 bx2Var = bx2.a;
        Object obj3 = this.d;
        fw2 fw2Var = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                g5c g5cVar = g5c.a;
                if (!z) {
                    qse.b(obj);
                    ax2 ax2Var = (ax2) this.c;
                    ik4 ik4Var = (ik4) obj3;
                    bi1 bi1Var = (bi1) obj2;
                    sw2 sw2Var = bi1Var.a;
                    int i = bi1Var.b;
                    if (i == -3) {
                        i = -2;
                    }
                    o01 o01Var = bi1Var.c;
                    eq4 ai1Var = new ai1(bi1Var, fw2Var, (byte) 0);
                    fl8 fl8Var = new fl8(qzd.b(ax2Var, sw2Var), wqd.a(i, o01Var, 4));
                    fl8Var.R(dx2.b, fl8Var, ai1Var);
                    this.b = true;
                    Object a = wge.a(ik4Var, fl8Var, true, this);
                    if (a != bx2Var) {
                        a = g5cVar;
                    }
                    if (a == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (!z) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                return g5cVar;
            default:
                v73 v73Var = (v73) obj3;
                boolean z2 = this.b;
                if (!z2) {
                    qse.b(obj);
                    ax2 ax2Var2 = (ax2) this.c;
                    cp2 a2 = hsd.a();
                    d17 d17Var = new d17((eq4) obj2, a2, v73Var.h.G(), ax2Var2.c());
                    c5a c5aVar = v73Var.l;
                    Object d = ((q01) c5aVar.d).d(d17Var);
                    if (d instanceof ej1) {
                        Throwable th = ((ej1) d).a;
                        if (th == null) {
                            throw new zi2("Channel was closed normally");
                        }
                        throw th;
                    }
                    if (!(d instanceof fj1)) {
                        if (((AtomicInteger) ((i4d) c5aVar.e).a).getAndIncrement() == 0) {
                            ppd.b((ax2) c5aVar.b, new eh4(c5aVar, null));
                        }
                        this.b = true;
                        Object h = a2.h(this);
                        return h == bx2Var ? bx2Var : h;
                    }
                    sc8.j("Check failed.");
                } else {
                    if (z2) {
                        qse.b(obj);
                        return obj;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
