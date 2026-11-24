// default package

/* loaded from: classes.dex */
public final class xrd implements vud {
    public final vid a;
    public final jyd b;
    public final jfd c;

    public xrd(jyd jydVar, jfd jfdVar, vid vidVar) {
        this.b = jydVar;
        jfdVar.getClass();
        this.c = jfdVar;
        this.a = vidVar;
    }

    @Override // vud
    public final Object a() {
        return ((tid) this.a.a(5)).c();
    }

    @Override // vud
    public final void b(Object obj) {
        this.b.getClass();
        ((vid) obj).zzjp.d = false;
        this.c.getClass();
        ir2.u(obj);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[EDGE_INSN: B:24:0x0061->B:25:0x0061 BREAK  A[LOOP:1: B:10:0x0032->B:18:0x0032], SYNTHETIC] */
    @Override // vud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, byte[] bArr, int i, int i2, sad sadVar) {
        vid vidVar = (vid) obj;
        dyd dydVar = vidVar.zzjp;
        if (dydVar == dyd.e) {
            dydVar = dyd.b();
            vidVar.zzjp = dydVar;
        }
        dyd dydVar2 = dydVar;
        while (i < i2) {
            int d = pze.d(bArr, i, sadVar);
            int i3 = sadVar.a;
            if (i3 != 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                sad sadVar2 = sadVar;
                i = (i3 & 7) == 2 ? pze.b(i3, bArr2, d, i4, dydVar2, sadVar2) : pze.a(i3, bArr2, d, i4, sadVar2);
            } else {
                byte[] bArr3 = bArr;
                int i5 = i2;
                sad sadVar3 = sadVar;
                int i6 = 0;
                cdd cddVar = null;
                while (true) {
                    if (d >= i5) {
                        i = d;
                        break;
                    }
                    i = pze.d(bArr3, d, sadVar3);
                    int i7 = sadVar3.a;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3 && i9 == 2) {
                            d = pze.i(bArr3, i, sadVar3);
                            cddVar = (cdd) sadVar3.c;
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            d = pze.a(i7, bArr3, i, i5, sadVar3);
                        }
                    } else if (i9 == 0) {
                        d = pze.d(bArr3, i, sadVar3);
                        i6 = sadVar3.a;
                    } else if (i7 != 12) {
                    }
                }
                if (cddVar != null) {
                    dydVar2.a((i6 << 3) | 2, cddVar);
                }
                bArr = bArr3;
                i2 = i5;
                sadVar = sadVar3;
            }
        }
        if (i != i2) {
            throw vkd.b();
        }
    }

    @Override // vud
    public final void d(vid vidVar, vid vidVar2) {
        gvd.a(this.b, vidVar, vidVar2);
    }

    @Override // vud
    public final int e(vid vidVar) {
        this.b.getClass();
        return vidVar.zzjp.hashCode();
    }

    @Override // vud
    public final boolean f(vid vidVar, vid vidVar2) {
        this.b.getClass();
        return vidVar.zzjp.equals(vidVar2.zzjp);
    }

    @Override // vud
    public final boolean g(Object obj) {
        this.c.getClass();
        ir2.u(obj);
        throw null;
    }
}
