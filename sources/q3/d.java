package q3;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d extends j {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final j[] f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z10;
        this.d = z11;
        this.e = strArr;
        this.f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.c == dVar.c && this.d == dVar.d && Objects.equals(this.b, dVar.b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f, dVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
