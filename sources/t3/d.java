package t3;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d extends i {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final i[] f;

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z9;
        this.d = z10;
        this.e = strArr;
        this.f = iVarArr;
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
        int i7 = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i7 + (str != null ? str.hashCode() : 0);
    }
}
