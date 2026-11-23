package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final e0[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(e0[] e0VarArr) {
        this.a = e0VarArr;
        this.notCompletedCount$volatile = e0VarArr.length;
    }
}
