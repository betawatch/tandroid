package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
