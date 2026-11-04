package tb;

import android.support.v4.media.session.a0;
import java.util.Arrays;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public a(float f10, int i3, String str, String str2) {
        int i10 = a8.b.a;
        this.a = str == null ? "" : str;
        this.b = f10;
        this.c = i3;
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
        a0 a0Var = new a0(a.class.getSimpleName(), 2);
        a0 a0Var2 = new a0(1, false);
        ((a0) a0Var.d).d = a0Var2;
        a0Var.d = a0Var2;
        a0Var2.c = this.a;
        a0Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        boolean z10 = false;
        a8.a aVar = new a8.a(1, z10);
        ((a0) a0Var.d).d = aVar;
        a0Var.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        a8.a aVar2 = new a8.a(1, z10);
        ((a0) a0Var.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        a0 a0Var3 = new a0(1, z10);
        aVar2.d = a0Var3;
        a0Var.d = a0Var3;
        a0Var3.c = this.d;
        a0Var3.b = "mid";
        return a0Var.toString();
    }
}
