// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class std {
    public final pxe a;
    public final Boolean b;
    public final b2f c;

    public /* synthetic */ std(htd htdVar) {
        this.a = (pxe) htdVar.b;
        this.b = (Boolean) htdVar.c;
        this.c = (b2f) htdVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof std)) {
            return false;
        }
        std stdVar = (std) obj;
        return vue.a(this.a, stdVar.a) && vue.a(this.b, stdVar.b) && vue.a(null, null) && vue.a(this.c, stdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
