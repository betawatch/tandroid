// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sbe implements cde {
    public final utd a;
    public final a8d b;

    public sbe(a8d a8dVar, utd utdVar) {
        ied iedVar = e0e.a;
        this.b = a8dVar;
        this.a = utdVar;
    }

    @Override // cde
    public final void a(Object obj, byte[] bArr, int i, int i2, nl6 nl6Var) {
        f4e f4eVar = (f4e) obj;
        if (f4eVar.zzc == jge.f) {
            f4eVar.zzc = jge.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // cde
    public final boolean b(f4e f4eVar, f4e f4eVar2) {
        return f4eVar.zzc.equals(f4eVar2.zzc);
    }

    @Override // cde
    public final int c(f4e f4eVar) {
        return f4eVar.zzc.hashCode();
    }

    @Override // cde
    public final void d(Object obj, cf9 cf9Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // cde
    public final boolean e(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // cde
    public final int f(f4e f4eVar) {
        jge jgeVar = f4eVar.zzc;
        int i = jgeVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < jgeVar.a; i3++) {
            int i4 = jgeVar.b[i3] >>> 3;
            cxd cxdVar = (cxd) jgeVar.c[i3];
            int b = fyd.b(8) << 1;
            int b2 = fyd.b(i4) + fyd.b(16);
            int b3 = fyd.b(24);
            int j = cxdVar.j();
            i2 += b + b2 + mlb.g(j, j, b3);
        }
        jgeVar.d = i2;
        return i2;
    }

    @Override // cde
    public final f4e zze() {
        utd utdVar = this.a;
        if (utdVar instanceof f4e) {
            return (f4e) ((f4e) utdVar).d(4);
        }
        h2e h2eVar = (h2e) ((f4e) utdVar).d(5);
        boolean m = h2eVar.b.m();
        f4e f4eVar = h2eVar.b;
        if (!m) {
            return f4eVar;
        }
        f4eVar.getClass();
        kce.c.a(f4eVar.getClass()).zzf(f4eVar);
        f4eVar.j();
        return h2eVar.b;
    }

    @Override // cde
    public final void zzf(Object obj) {
        this.b.getClass();
        jge jgeVar = ((f4e) obj).zzc;
        if (jgeVar.e) {
            jgeVar.e = false;
        }
        ied iedVar = e0e.a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // cde
    public final void zzg(Object obj, Object obj2) {
        qde.o(obj, obj2);
    }
}
