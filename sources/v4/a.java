package v4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a = new LinkedHashSet();

    public a(p pVar) {
        pVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // v4.d
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
