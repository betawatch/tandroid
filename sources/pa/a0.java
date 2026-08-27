package pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final ma.o a;
    public final ma.g b;
    public final ta.a c;
    public final ma.v d;
    public final m5.o e = new m5.o(this, 14);
    public final boolean f;
    public volatile ma.u g;

    public a0(ma.o oVar, ma.g gVar, ta.a aVar, ma.v vVar, boolean z10) {
        this.a = oVar;
        this.b = gVar;
        this.c = aVar;
        this.d = vVar;
        this.f = z10;
    }

    @Override // pa.y
    public final ma.u a() {
        if (this.a != null) {
            return this;
        }
        ma.u uVar = this.g;
        if (uVar != null) {
            return uVar;
        }
        ma.u c10 = this.b.c(this.d, this.c);
        this.g = c10;
        return c10;
    }

    @Override // ma.u
    public final Object read(ua.a aVar) {
        ma.u uVar = this.g;
        if (uVar == null) {
            uVar = this.b.c(this.d, this.c);
            this.g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        ma.o oVar = this.a;
        if (oVar == null) {
            ma.u uVar = this.g;
            if (uVar == null) {
                uVar = this.b.c(this.d, this.c);
                this.g = uVar;
            }
            uVar.write(bVar, obj);
            return;
        }
        if (this.f && obj == null) {
            bVar.i();
        } else {
            oa.d.l(oVar.serialize(obj, this.c.b, this.e), bVar);
        }
    }
}
