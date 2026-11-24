// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x83 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ h93 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x83(h93 h93Var, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = h93Var;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        h93 h93Var = this.c;
        switch (b) {
            case 0:
                return new x83(h93Var, px2Var, (byte) 0);
            default:
                return new x83(h93Var, px2Var, (byte) 1);
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((x83) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r15 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r4.f(r14) != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r15.g(r0, r14) == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        if (r15 != r3) goto L36;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        ly2 ly2Var = ly2.a;
        h93 h93Var = this.c;
        switch (b) {
            case 0:
                byte b2 = this.b;
                g7c g7cVar = g7c.a;
                if (b2 == 0) {
                    tue.b(obj);
                    e7a e7aVar = h93Var.i;
                    this.b = (byte) 1;
                    Object h = ((nq2) e7aVar.b).h(this);
                    if (h != ly2Var) {
                        h = g7cVar;
                        break;
                    }
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            tue.b(obj);
                            return g7cVar;
                        }
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                im4 d = h93Var.c().d();
                boolean z = d instanceof ss4;
                w11 w11Var = w11.b;
                im4 D = z ? ((ss4) d).D(0, w11Var) : new ij1(d, k34.a, 0, w11Var, (byte) 1);
                s83 s83Var = new s83(h93Var, (byte) 1);
                this.b = (byte) 2;
                break;
            default:
                ni6 ni6Var = h93Var.h;
                byte b3 = this.b;
                try {
                    if (b3 == 0) {
                        tue.b(obj);
                        if (!(ni6Var.k() instanceof vh4)) {
                            this.b = (byte) 1;
                            break;
                        } else {
                            return ni6Var.k();
                        }
                    } else {
                        if (b3 != 1) {
                            if (b3 == 2) {
                                tue.b(obj);
                                return (iya) obj;
                            }
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tue.b(obj);
                    }
                    this.b = (byte) 2;
                    obj = h93Var.g(false, this);
                    break;
                } catch (Throwable th) {
                    return new o39(-1, th);
                }
        }
    }
}
