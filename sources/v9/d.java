package v9;

import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ qt d;

    public /* synthetic */ d(f fVar, Runnable runnable, qt qtVar, int i7) {
        this.a = i7;
        this.b = fVar;
        this.c = runnable;
        this.d = qtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i7 = 0;
                final Runnable runnable = this.c;
                final qt qtVar = this.d;
                executorService.execute(new Runnable() { // from class: v9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) qtVar.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) qtVar.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) qtVar.b;
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
                final qt qtVar2 = this.d;
                executorService2.execute(new Runnable() { // from class: v9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) qtVar2.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) qtVar2.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) qtVar2.b;
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
                final qt qtVar3 = this.d;
                executorService3.execute(new Runnable() { // from class: v9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) qtVar3.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) qtVar3.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) qtVar3.b;
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
