package qa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final na.o a;
    public final na.g b;
    public final ua.a c;
    public final na.v d;
    public final org.telegram.ui.Components.n e = new org.telegram.ui.Components.n(this, 12);
    public final boolean f;
    public volatile na.u g;

    public a0(na.o oVar, na.g gVar, ua.a aVar, na.v vVar, boolean z10) {
        this.a = oVar;
        this.b = gVar;
        this.c = aVar;
        this.d = vVar;
        this.f = z10;
    }

    @Override // qa.y
    public final na.u a() {
        if (this.a != null) {
            return this;
        }
        na.u uVar = this.g;
        if (uVar != null) {
            return uVar;
        }
        na.u c3 = this.b.c(this.d, this.c);
        this.g = c3;
        return c3;
    }

    @Override // na.u
    public final Object read(va.a aVar) {
        na.u uVar = this.g;
        if (uVar == null) {
            uVar = this.b.c(this.d, this.c);
            this.g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        na.o oVar = this.a;
        if (oVar == null) {
            na.u uVar = this.g;
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
            pa.d.l(oVar.serialize(obj, this.c.b, this.e), bVar);
        }
    }
}
