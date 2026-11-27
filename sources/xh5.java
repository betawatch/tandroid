// default package

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xh5 implements tf7 {
    public final String a;
    public final String b;
    public final List c;

    public xh5(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // tf7
    public final ko4 a() {
        return null;
    }

    @Override // tf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xh5.class == obj.getClass()) {
            xh5 xh5Var = (xh5) obj;
            if (TextUtils.equals(this.a, xh5Var.a) && TextUtils.equals(this.b, xh5Var.b) && this.c.equals(xh5Var.c)) {
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
        return "HlsTrackMetadataEntry".concat(str != null ? c00.k(ik8.p(" [", str, ", "), this.b, "]") : "");
    }

    @Override // tf7
    public final void b(lt6 lt6Var) {
    }
}
