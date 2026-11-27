// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class sgd implements og1 {
    public final kdd a;

    public sgd(kdd kddVar) {
        this.a = kddVar;
    }

    @Override // og1
    public final void a(fjd fjdVar) {
        xve.i(fjdVar, "channel must not be null");
    }

    @Override // og1
    public final void b(fjd fjdVar) {
        xve.i(fjdVar, "channel must not be null");
    }

    @Override // og1
    public final void c(fjd fjdVar) {
        xve.i(fjdVar, "channel must not be null");
    }

    @Override // og1
    public final void d(fjd fjdVar) {
        xve.i(fjdVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && sgd.class == obj.getClass() && this.a == ((sgd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
