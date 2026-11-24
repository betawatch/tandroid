// default package

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class tz9 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && tz9.class == obj.getClass()) {
                tz9 tz9Var = (tz9) obj;
                boolean z = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(tz9Var.c)) || Objects.equals(this.c, tz9Var.c);
                if (this.a != tz9Var.a || this.b != tz9Var.b || !z) {
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
