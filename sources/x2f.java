// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class x2f {
    public old a(wqd wqdVar) {
        return (old) tld.d.getAndSet(wqdVar, old.d);
    }

    public wld b(wqd wqdVar) {
        return (wld) tld.c.getAndSet(wqdVar, wld.c);
    }

    public void c(wld wldVar, wld wldVar2) {
        tld.b.lazySet(wldVar, wldVar2);
    }

    public void d(wld wldVar, Thread thread) {
        tld.a.lazySet(wldVar, thread);
    }

    public boolean e(wqd wqdVar, old oldVar, old oldVar2) {
        return z2f.a(tld.d, wqdVar, oldVar, oldVar2);
    }

    public boolean f(cmd cmdVar, Object obj, Object obj2) {
        return z2f.a(tld.e, cmdVar, obj, obj2);
    }

    public boolean g(cmd cmdVar, wld wldVar, wld wldVar2) {
        return z2f.a(tld.c, cmdVar, wldVar, wldVar2);
    }
}
