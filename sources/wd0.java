// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wd0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(wd0.class, "notCompletedCount$volatile");
    public final le3[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public wd0(le3[] le3VarArr) {
        this.a = le3VarArr;
        this.notCompletedCount$volatile = le3VarArr.length;
    }
}
