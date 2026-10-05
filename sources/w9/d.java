package w9;

import android.os.Process;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class d implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
