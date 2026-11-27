// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
