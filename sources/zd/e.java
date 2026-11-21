package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
