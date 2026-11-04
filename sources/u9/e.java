package u9;

import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ i9 d;

    public /* synthetic */ e(g gVar, Runnable runnable, i9 i9Var, int i3) {
        this.a = i3;
        this.b = gVar;
        this.c = runnable;
        this.d = i9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i3 = 0;
                final Runnable runnable = this.c;
                final i9 i9Var = this.d;
                executorService.execute(new Runnable() { // from class: u9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) i9Var.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) i9Var.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) i9Var.b;
                                try {
                                    runnable2.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.l(e12);
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
                final i9 i9Var2 = this.d;
                executorService2.execute(new Runnable() { // from class: u9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) i9Var2.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) i9Var2.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) i9Var2.b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.l(e12);
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
                final i9 i9Var3 = this.d;
                executorService3.execute(new Runnable() { // from class: u9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) i9Var3.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) i9Var3.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) i9Var3.b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
