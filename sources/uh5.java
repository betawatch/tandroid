// default package

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uh5 implements lf7 {
    public final String a;
    public final String b;
    public final List c;

    public uh5(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // lf7
    public final go4 a() {
        return null;
    }

    @Override // lf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uh5.class == obj.getClass()) {
            uh5 uh5Var = (uh5) obj;
            if (TextUtils.equals(this.a, uh5Var.a) && TextUtils.equals(this.b, uh5Var.b) && this.c.equals(uh5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? b10.j(wi8.p(" [", str, ", "), this.b, "]") : "");
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
