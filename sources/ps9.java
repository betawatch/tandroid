// default package

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ps9 implements Runnable {
    public final /* synthetic */ byte a;
    public final Runnable b;

    public /* synthetic */ ps9(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                try {
                    runnable.run();
                    break;
                } catch (Exception e) {
                    pse.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                runnable.run();
                break;
            case 2:
                Process.setThreadPriority(0);
                runnable.run();
                break;
            case 3:
                Deque deque = (Deque) lg7.b.get();
                xve.h(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                lg7.b.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
