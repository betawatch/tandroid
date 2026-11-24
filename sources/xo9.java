// default package

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xo9 implements Runnable {
    public final /* synthetic */ byte a;
    public final Runnable b;

    public /* synthetic */ xo9(Runnable runnable, byte b) {
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
                    xne.b("Executor", "Background execution failure.", e);
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
                Deque deque = (Deque) ce7.b.get();
                fre.h(deque);
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
                ce7.b.set(new ArrayDeque());
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
