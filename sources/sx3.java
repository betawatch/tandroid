// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sx3 extends bhe {
    public final /* synthetic */ sk a;

    public sx3(sk skVar) {
        this.a = skVar;
    }

    @Override // bhe
    public final void a(Throwable th) {
        ((wx3) this.a.b).d(th);
    }

    @Override // bhe
    public final void b(e7a e7aVar) {
        sk skVar = this.a;
        skVar.c = e7aVar;
        skVar.a = new hi2((e7a) skVar.c, new jk2((byte) 19), ((wx3) skVar.b).h);
        wx3 wx3Var = (wx3) skVar.b;
        ArrayList arrayList = new ArrayList();
        wx3Var.a.writeLock().lock();
        try {
            wx3Var.c = (byte) 1;
            arrayList.addAll(wx3Var.b);
            wx3Var.b.clear();
            wx3Var.a.writeLock().unlock();
            wx3Var.d.post(new ux3(arrayList, wx3Var.c, null));
        } catch (Throwable th) {
            wx3Var.a.writeLock().unlock();
            throw th;
        }
    }
}
