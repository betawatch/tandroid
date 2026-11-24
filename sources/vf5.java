// default package

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vf5 implements jd7 {
    public final String a;
    public final String b;
    public final List c;

    public vf5(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // jd7
    public final fm4 a() {
        return null;
    }

    @Override // jd7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf5.class == obj.getClass()) {
            vf5 vf5Var = (vf5) obj;
            if (TextUtils.equals(this.a, vf5Var.a) && TextUtils.equals(this.b, vf5Var.b) && this.c.equals(vf5Var.c)) {
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
        return "HlsTrackMetadataEntry".concat(str != null ? b00.j(ug8.p(" [", str, ", "), this.b, "]") : "");
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
