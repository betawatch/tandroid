package t4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a = new LinkedHashSet();

    public a(p pVar) {
        pVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // t4.d
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
