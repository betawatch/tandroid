package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
