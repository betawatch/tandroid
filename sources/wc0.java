// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wc0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(wc0.class, "notCompletedCount$volatile");
    public final zc3[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public wc0(zc3[] zc3VarArr) {
        this.a = zc3VarArr;
        this.notCompletedCount$volatile = zc3VarArr.length;
    }
}
