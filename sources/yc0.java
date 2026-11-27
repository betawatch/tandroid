// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
