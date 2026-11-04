package qe;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import m2.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements Iterable {
    public final h a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.a = new h(new t(22, this, iVar), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        this.a.m(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
