// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uld extends x2f {
    @Override // x2f
    public final old a(wqd wqdVar) {
        old oldVar;
        old oldVar2 = old.d;
        synchronized (wqdVar) {
            oldVar = wqdVar.b;
            if (oldVar != oldVar2) {
                wqdVar.b = oldVar2;
            }
        }
        return oldVar;
    }

    @Override // x2f
    public final wld b(wqd wqdVar) {
        wld wldVar;
        wld wldVar2 = wld.c;
        synchronized (wqdVar) {
            wldVar = wqdVar.c;
            if (wldVar != wldVar2) {
                wqdVar.c = wldVar2;
            }
        }
        return wldVar;
    }

    @Override // x2f
    public final void c(wld wldVar, wld wldVar2) {
        wldVar.b = wldVar2;
    }

    @Override // x2f
    public final void d(wld wldVar, Thread thread) {
        wldVar.a = thread;
    }

    @Override // x2f
    public final boolean e(wqd wqdVar, old oldVar, old oldVar2) {
        synchronized (wqdVar) {
            if (wqdVar.b != oldVar) {
                return false;
            }
            wqdVar.b = oldVar2;
            return true;
        }
    }

    @Override // x2f
    public final boolean f(cmd cmdVar, Object obj, Object obj2) {
        synchronized (cmdVar) {
            if (cmdVar.a != obj) {
                return false;
            }
            cmdVar.a = obj2;
            return true;
        }
    }

    @Override // x2f
    public final boolean g(cmd cmdVar, wld wldVar, wld wldVar2) {
        synchronized (cmdVar) {
            if (cmdVar.c != wldVar) {
                return false;
            }
            cmdVar.c = wldVar2;
            return true;
        }
    }
}
