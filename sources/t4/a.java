package t4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a = new LinkedHashSet();

    public a(p pVar) {
        pVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // t4.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
