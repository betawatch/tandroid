package vd;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import v5.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k implements Iterable {
    public final i a;

    public k(j jVar, Interpolator interpolator, long j10) {
        this.a = new i(new n(this, jVar, false, 1), interpolator, j10);
    }

    public final void i(Object obj, boolean z10) {
        this.a.r(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
