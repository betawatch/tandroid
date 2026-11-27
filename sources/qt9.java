// default package

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qt9 implements ut9 {
    public final po a;
    public boolean b;
    public Bundle c;
    public final tgb d;

    public qt9(po poVar, shc shcVar) {
        poVar.getClass();
        this.a = poVar;
        this.d = new tgb(new ad4(shcVar, (byte) 3));
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

    @Override // ut9
    public final Bundle c() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((rt9) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle c = ((ot9) entry.getValue()).e.c();
            if (!ur5.a(c, Bundle.EMPTY)) {
                bundle.putBundle(str, c);
            }
        }
        this.b = false;
        return bundle;
    }
}
