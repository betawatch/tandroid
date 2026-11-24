// default package

/* loaded from: classes.dex */
public final class zpd extends wod {
    @Override // wod
    public final void a(Object obj, long j) {
        ((fcd) ((omd) x1e.l(obj, j))).a = false;
    }

    @Override // wod
    public final void b(xkd xkdVar, xkd xkdVar2, long j) {
        omd omdVar = (omd) x1e.l(xkdVar, j);
        omd omdVar2 = (omd) x1e.l(xkdVar2, j);
        int size = omdVar.size();
        int size2 = omdVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((fcd) omdVar).a) {
                omdVar = omdVar.f(size2 + size);
            }
            omdVar.addAll(omdVar2);
        }
        if (size > 0) {
            omdVar2 = omdVar;
        }
        x1e.d(xkdVar, j, omdVar2);
    }
}
