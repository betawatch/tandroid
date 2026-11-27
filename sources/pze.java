// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pze implements o1f {
    public final hie a;
    public final d4f b;
    public final npe c;

    public pze(d4f d4fVar, npe npeVar, hie hieVar) {
        this.b = d4fVar;
        npeVar.getClass();
        this.c = npeVar;
        this.a = hieVar;
    }

    @Override // o1f
    public final boolean a(Object obj) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override // o1f
    public final void b(Object obj) {
        this.b.getClass();
        ((ese) obj).zzb.e = false;
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override // o1f
    public final void c(Object obj, byte[] bArr, int i, int i2, lfd lfdVar) {
        ese eseVar = (ese) obj;
        if (eseVar.zzb == h4f.f) {
            eseVar.zzb = h4f.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // o1f
    public final void d(ese eseVar, ese eseVar2) {
        w1f.h(this.b, eseVar, eseVar2);
    }

    @Override // o1f
    public final void e(Object obj, g9d g9dVar) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override // o1f
    public final boolean f(ese eseVar, ese eseVar2) {
        this.b.getClass();
        return eseVar.zzb.equals(eseVar2.zzb);
    }

    @Override // o1f
    public final int g(ese eseVar) {
        this.b.getClass();
        return eseVar.zzb.hashCode();
    }

    @Override // o1f
    public final Object zza() {
        return ((ase) ((ese) this.a).d(5)).e();
    }

    @Override // o1f
    public final int zzb(Object obj) {
        this.b.getClass();
        h4f h4fVar = ((ese) obj).zzb;
        int i = h4fVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < h4fVar.a; i3++) {
            int i4 = h4fVar.b[i3] >>> 3;
            i2 += coe.i(3, (jne) h4fVar.c[i3]) + coe.s(2, i4) + (coe.t(8) << 1);
        }
        h4fVar.d = i2;
        return i2;
    }
}
