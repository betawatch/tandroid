package th;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l3 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && l3.class == obj.getClass()) {
                l3 l3Var = (l3) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(l3Var.c)) || Objects.equals(this.c, l3Var.c);
                if (this.a != l3Var.a || this.b != l3Var.b || !z10) {
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
