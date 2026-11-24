// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rp3 extends tp3 implements my2, px2 {
    public static final /* synthetic */ long n = fy.a.objectFieldOffset(rp3.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final fy2 d;
    public final qx2 e;
    public Object f;
    public final Object h;

    public rp3(fy2 fy2Var, qx2 qx2Var) {
        super(-1);
        this.d = fy2Var;
        this.e = qx2Var;
        this.f = r5c.a;
        this.h = gfd.b(qx2Var.getContext());
    }

    @Override // my2
    public final my2 getCallerFrame() {
        return this.e;
    }

    @Override // px2
    public final cy2 getContext() {
        return this.e.getContext();
    }

    @Override // tp3
    public final Object i() {
        Object obj = this.f;
        this.f = r5c.a;
        return obj;
    }

    @Override // px2
    public final void resumeWith(Object obj) {
        Throwable a = tc9.a(obj);
        Object qq2Var = a == null ? obj : new qq2(a, false);
        qx2 qx2Var = this.e;
        cy2 context = qx2Var.getContext();
        fy2 fy2Var = this.d;
        if (fy2Var.d(context)) {
            this.f = qq2Var;
            this.c = 0;
            fy2Var.c(qx2Var.getContext(), this);
            return;
        }
        o54 a2 = epb.a();
        if (a2.c >= 4294967296L) {
            this.f = qq2Var;
            this.c = 0;
            lt ltVar = a2.e;
            if (ltVar == null) {
                ltVar = new lt();
                a2.e = ltVar;
            }
            ltVar.addLast(this);
            return;
        }
        a2.g(true);
        try {
            cy2 context2 = qx2Var.getContext();
            Object c = gfd.c(context2, this.h);
            try {
                qx2Var.resumeWith(obj);
                while (a2.i()) {
                }
            } finally {
                gfd.a(context2, c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + ea3.d(this.e) + ']';
    }

    @Override // tp3
    public final px2 d() {
        return this;
    }
}
