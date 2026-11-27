// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class yc0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(yc0.class, "notCompletedCount$volatile");
    public final rd3[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public yc0(rd3[] rd3VarArr) {
        this.a = rd3VarArr;
        this.notCompletedCount$volatile = rd3VarArr.length;
    }
}
