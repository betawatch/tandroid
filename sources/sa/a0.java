package sa;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final pa.o a;
    public final pa.g b;
    public final wa.a c;
    public final pa.v d;
    public final org.telegram.ui.Cells.f1 e = new org.telegram.ui.Cells.f1(this, 18);
    public final boolean f;
    public volatile pa.u g;

    public a0(pa.o oVar, pa.g gVar, wa.a aVar, pa.v vVar, boolean z4) {
        this.a = oVar;
        this.b = gVar;
        this.c = aVar;
        this.d = vVar;
        this.f = z4;
    }

    @Override // sa.y
    public final pa.u a() {
        if (this.a != null) {
            return this;
        }
        pa.u uVar = this.g;
        if (uVar != null) {
            return uVar;
        }
        pa.u c3 = this.b.c(this.d, this.c);
        this.g = c3;
        return c3;
    }

    @Override // pa.u
    public final Object read(xa.a aVar) {
        pa.u uVar = this.g;
        if (uVar == null) {
            uVar = this.b.c(this.d, this.c);
            this.g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        pa.o oVar = this.a;
        if (oVar == null) {
            pa.u uVar = this.g;
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
            ra.d.l(oVar.serialize(obj, this.c.b, this.e), bVar);
        }
    }
}
