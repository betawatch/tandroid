package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final h0[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }
}
