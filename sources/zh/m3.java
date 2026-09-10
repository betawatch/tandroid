package zh;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m3 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m3.class == obj.getClass()) {
                m3 m3Var = (m3) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(m3Var.c)) || Objects.equals(this.c, m3Var.c);
                if (this.a != m3Var.a || this.b != m3Var.b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c);
    }
}
