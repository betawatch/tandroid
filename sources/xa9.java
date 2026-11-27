// default package

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xa9 implements Iterable {
    public final b76 a;

    public xa9(wa9 wa9Var, Interpolator interpolator, long j) {
        this.a = new b76(new um4(this, wa9Var, false, (byte) 24), interpolator, j);
    }

    public final void h(Object obj, boolean z) {
        this.a.m(obj != null ? Collections.singletonList(obj) : null, z);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
