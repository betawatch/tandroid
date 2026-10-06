package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
