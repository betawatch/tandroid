// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ywd {
    public final daf a;
    public final Boolean b;
    public final ehf c;

    public /* synthetic */ ywd(htd htdVar) {
        this.a = (daf) htdVar.b;
        this.b = (Boolean) htdVar.c;
        this.c = (ehf) htdVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ywd)) {
            return false;
        }
        ywd ywdVar = (ywd) obj;
        return vue.a(this.a, ywdVar.a) && vue.a(this.b, ywdVar.b) && vue.a(null, null) && vue.a(this.c, ywdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
