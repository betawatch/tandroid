package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
