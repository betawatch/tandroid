package te;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import sg.h0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class j implements Iterable {
    public final h a;

    public j(i iVar, Interpolator interpolator, long j3) {
        this.a = new h(new h0(this, iVar, false, 1), interpolator, j3);
    }

    public final void f(Object obj, boolean z10) {
        this.a.m(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
