package xd;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import q5.g0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
