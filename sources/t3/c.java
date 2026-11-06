package t3;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c extends i {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final i[] g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i7;
        this.d = i10;
        this.e = j3;
        this.f = j10;
        this.g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Objects.equals(this.b, cVar.b) && Arrays.equals(this.g, cVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i7 + (str != null ? str.hashCode() : 0);
    }
}
