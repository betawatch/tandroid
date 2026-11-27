// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
