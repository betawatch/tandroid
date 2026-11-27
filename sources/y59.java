// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class y59 implements ut9 {
    public final LinkedHashSet a = new LinkedHashSet();

    public y59(po poVar) {
        poVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // ut9
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
