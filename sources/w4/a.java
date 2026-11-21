package w4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.p;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a = new LinkedHashSet();

    public a(p pVar) {
        pVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // w4.d
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
