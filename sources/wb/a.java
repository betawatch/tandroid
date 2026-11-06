package wb;

import android.support.v4.media.session.a0;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public a(float f10, int i7, String str, String str2) {
        int i10 = b8.b.a;
        this.a = str == null ? "" : str;
        this.b = f10;
        this.c = i7;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.k(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c && m.k(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        a0 a0Var = new a0(a.class.getSimpleName(), 12);
        a0 a0Var2 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var2;
        a0Var.d = a0Var2;
        a0Var2.c = this.a;
        a0Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        boolean z9 = false;
        b8.a aVar = new b8.a(11, z9);
        ((a0) a0Var.d).d = aVar;
        a0Var.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        b8.a aVar2 = new b8.a(11, z9);
        ((a0) a0Var.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        a0 a0Var3 = new a0(11, z9);
        aVar2.d = a0Var3;
        a0Var.d = a0Var3;
        a0Var3.c = this.d;
        a0Var3.b = "mid";
        return a0Var.toString();
    }
}
