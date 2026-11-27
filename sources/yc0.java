// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
