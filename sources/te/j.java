package te;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import sg.i0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class j implements Iterable {
    public final h a;

    public j(i iVar, Interpolator interpolator, long j3) {
        this.a = new h(new i0(this, iVar, false, 1), interpolator, j3);
    }

    public final void f(Object obj, boolean z9) {
        this.a.m(obj != null ? Collections.singletonList(obj) : null, z9);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
