package td;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements Iterable {
    public final h a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.a = new h(new e3(23, this, iVar), interpolator, j10);
    }

    public final void i(Object obj, boolean z10) {
        this.a.r(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
