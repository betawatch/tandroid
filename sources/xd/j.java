package xd;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import q5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j implements Iterable {
    public final h a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.a = new h(new c0(this, iVar, false, 18), interpolator, j10);
    }

    public final void i(Object obj, boolean z4) {
        this.a.r(obj != null ? Collections.singletonList(obj) : null, z4);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
