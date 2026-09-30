package qb;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ n(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Deque deque = (Deque) h.b.get();
                n6.l.h(deque);
                Runnable runnable = this.b;
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
                h.b.set(new ArrayDeque());
                this.b.run();
                break;
        }
    }
}
