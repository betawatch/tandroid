// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wib {
    public static final wib e = new wib(false, new tib(TLObject.FLAG_31, -2147483647), zib.T, 0.0f);
    public final boolean a;
    public final tib b;
    public final lib c;
    public final float d;

    public wib(boolean z, tib tibVar, lib libVar, float f) {
        this.a = z;
        this.b = tibVar;
        this.c = libVar;
        this.d = f;
    }

    public final lib a(boolean z) {
        lib libVar = zib.T;
        lib libVar2 = this.c;
        return libVar2 != libVar ? libVar2 : this.d == 0.0f ? z ? zib.U : zib.V : zib.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wib.class != obj.getClass()) {
            return false;
        }
        wib wibVar = (wib) obj;
        return this.c.equals(wibVar.c) && this.b.equals(wibVar.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
