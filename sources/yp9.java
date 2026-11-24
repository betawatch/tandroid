// default package

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yp9 implements cq9 {
    public final oo a;
    public boolean b;
    public Bundle c;
    public final ycb d;

    public yp9(oo ooVar, tdc tdcVar) {
        ooVar.getClass();
        this.a = ooVar;
        this.d = new ycb(new db4(tdcVar, (byte) 3));
    }

    public final void a() {
        if (this.b) {
            return;
        }
        Bundle c = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c != null) {
            bundle.putAll(c);
        }
        this.c = bundle;
        this.b = true;
    }

    @Override // cq9
    public final Bundle c() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((zp9) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle c = ((wp9) entry.getValue()).e.c();
            if (!rp5.a(c, Bundle.EMPTY)) {
                bundle.putBundle(str, c);
            }
        }
        this.b = false;
        return bundle;
    }
}
