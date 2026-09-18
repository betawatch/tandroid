package r9;

import java.util.concurrent.ExecutorService;
import k2.u;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ u d;

    public /* synthetic */ d(f fVar, Runnable runnable, u uVar, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = runnable;
        this.d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i10 = 0;
                final Runnable runnable = this.c;
                final u uVar = this.d;
                executorService.execute(new Runnable() { // from class: r9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) uVar.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) uVar.b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) uVar.b;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.b.a;
                final int i11 = 2;
                final Runnable runnable2 = this.c;
                final u uVar2 = this.d;
                executorService2.execute(new Runnable() { // from class: r9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) uVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) uVar2.b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) uVar2.b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.b.a;
                final int i12 = 1;
                final Runnable runnable3 = this.c;
                final u uVar3 = this.d;
                executorService3.execute(new Runnable() { // from class: r9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) uVar3.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) uVar3.b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) uVar3.b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
