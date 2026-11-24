// default package

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yc1 implements vn {
    public final CastDevice a;
    public final uhf b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ yc1(mv6 mv6Var) {
        this.a = (CastDevice) mv6Var.b;
        this.b = (uhf) mv6Var.c;
        this.c = (Bundle) mv6Var.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r3 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yc1)) {
            return false;
        }
        yc1 yc1Var = (yc1) obj;
        if (cqe.a(this.a, yc1Var.a)) {
            Bundle bundle = yc1Var.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!cqe.a(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (cqe.a(this.d, yc1Var.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, 0, this.d});
    }
}
