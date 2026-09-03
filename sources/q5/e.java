package q5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import l7.w0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice a;
    public final r5.e0 b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ e(w0 w0Var) {
        this.a = (CastDevice) w0Var.b;
        this.b = (r5.e0) w0Var.c;
        this.c = (Bundle) w0Var.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r3 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (b6.m.l(this.a, eVar.a)) {
            Bundle bundle = eVar.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!b6.m.l(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (b6.m.l(this.d, eVar.d)) {
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
