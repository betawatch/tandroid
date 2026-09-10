package r9;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ l2.h d;

    public /* synthetic */ d(f fVar, Runnable runnable, l2.h hVar, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = runnable;
        this.d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i10 = 0;
                final Runnable runnable = this.c;
                final l2.h hVar = this.d;
                executorService.execute(new Runnable() { // from class: r9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) hVar.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) hVar.b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar2 = (h) hVar.b;
                                try {
                                    runnable2.run();
                                    hVar2.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar2.l(e10);
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
                final l2.h hVar2 = this.d;
                executorService2.execute(new Runnable() { // from class: r9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) hVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) hVar2.b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar22 = (h) hVar2.b;
                                try {
                                    runnable22.run();
                                    hVar22.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar22.l(e10);
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
                final l2.h hVar3 = this.d;
                executorService3.execute(new Runnable() { // from class: r9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) hVar3.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) hVar3.b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar22 = (h) hVar3.b;
                                try {
                                    runnable22.run();
                                    hVar22.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar22.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
