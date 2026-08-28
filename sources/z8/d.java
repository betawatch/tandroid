package z8;

import java.util.concurrent.ExecutorService;
import n5.a0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ a0 d;

    public /* synthetic */ d(f fVar, Runnable runnable, a0 a0Var, int i9) {
        this.a = i9;
        this.b = fVar;
        this.c = runnable;
        this.d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i9 = 0;
                final Runnable runnable = this.c;
                final a0 a0Var = this.d;
                executorService.execute(new Runnable() { // from class: z8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) a0Var.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) a0Var.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) a0Var.b;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.b.a;
                final int i10 = 2;
                final Runnable runnable2 = this.c;
                final a0 a0Var2 = this.d;
                executorService2.execute(new Runnable() { // from class: z8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) a0Var2.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) a0Var2.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) a0Var2.b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.b.a;
                final int i11 = 1;
                final Runnable runnable3 = this.c;
                final a0 a0Var3 = this.d;
                executorService3.execute(new Runnable() { // from class: z8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) a0Var3.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) a0Var3.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) a0Var3.b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
