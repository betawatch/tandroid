package v9;

import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ nd0 d;

    public /* synthetic */ e(g gVar, Runnable runnable, nd0 nd0Var, int i7) {
        this.a = i7;
        this.b = gVar;
        this.c = runnable;
        this.d = nd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i7 = 0;
                final Runnable runnable = this.c;
                final nd0 nd0Var = this.d;
                executorService.execute(new Runnable() { // from class: v9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) nd0Var.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) nd0Var.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) nd0Var.b;
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
                final nd0 nd0Var2 = this.d;
                executorService2.execute(new Runnable() { // from class: v9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) nd0Var2.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) nd0Var2.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) nd0Var2.b;
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
                final nd0 nd0Var3 = this.d;
                executorService3.execute(new Runnable() { // from class: v9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) nd0Var3.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) nd0Var3.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) nd0Var3.b;
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
