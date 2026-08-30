package xd;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import q5.g0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j implements Iterable {
    public final h a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.a = new h(new g0(this, iVar, false, 17), interpolator, j10);
    }

    public final void i(Object obj, boolean z4) {
        this.a.r(obj != null ? Collections.singletonList(obj) : null, z4);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
