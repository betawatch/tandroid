// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
