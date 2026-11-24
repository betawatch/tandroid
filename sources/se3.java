// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class se3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ue3 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ k6d d;

    public /* synthetic */ se3(ue3 ue3Var, Runnable runnable, k6d k6dVar, byte b) {
        this.a = b;
        this.b = ue3Var;
        this.c = runnable;
        this.d = k6dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final k6d k6dVar = this.d;
        final Runnable runnable = this.c;
        ue3 ue3Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                ue3Var.a.execute(new Runnable() { // from class: qe3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        k6d k6dVar2 = k6dVar;
                        Runnable runnable2 = runnable;
                        switch (b3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((we3) k6dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((we3) k6dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                we3 we3Var = (we3) k6dVar2.b;
                                try {
                                    runnable2.run();
                                    we3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    we3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 2;
                ue3Var.a.execute(new Runnable() { // from class: qe3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        k6d k6dVar2 = k6dVar;
                        Runnable runnable2 = runnable;
                        switch (b32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((we3) k6dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((we3) k6dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                we3 we3Var = (we3) k6dVar2.b;
                                try {
                                    runnable2.run();
                                    we3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    we3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b4 = 1;
                ue3Var.a.execute(new Runnable() { // from class: qe3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        k6d k6dVar2 = k6dVar;
                        Runnable runnable2 = runnable;
                        switch (b32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((we3) k6dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((we3) k6dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                we3 we3Var = (we3) k6dVar2.b;
                                try {
                                    runnable2.run();
                                    we3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    we3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
