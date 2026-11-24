// default package

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
