package vf;

import org.telegram.messenger.k7;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class b {
    public Runnable a;
    public Runnable b;
    public Runnable c;

    public b(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.c = runnable2;
    }

    public final void a(boolean z9) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        c(z9);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z9) {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            this.a = null;
        }
    }

    public final void e(k7 k7Var) {
        this.b = k7Var;
    }
}
