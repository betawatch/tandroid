package te;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import sg.i0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
