// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
