// default package

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
                Deque deque = (Deque) mg7.b.get();
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
                mg7.b.set(new ArrayDeque());
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
