// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class zd3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ be3 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ z8d d;

    public /* synthetic */ zd3(be3 be3Var, Runnable runnable, z8d z8dVar, byte b) {
        this.a = b;
        this.b = be3Var;
        this.c = runnable;
        this.d = z8dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final z8d z8dVar = this.d;
        final Runnable runnable = this.c;
        be3 be3Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                be3Var.a.execute(new Runnable() { // from class: xd3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        z8d z8dVar2 = z8dVar;
                        Runnable runnable2 = runnable;
                        switch (b3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((de3) z8dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((de3) z8dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                de3 de3Var = (de3) z8dVar2.b;
                                try {
                                    runnable2.run();
                                    de3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    de3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 2;
                be3Var.a.execute(new Runnable() { // from class: xd3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        z8d z8dVar2 = z8dVar;
                        Runnable runnable2 = runnable;
                        switch (b32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((de3) z8dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((de3) z8dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                de3 de3Var = (de3) z8dVar2.b;
                                try {
                                    runnable2.run();
                                    de3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    de3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b4 = 1;
                be3Var.a.execute(new Runnable() { // from class: xd3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        z8d z8dVar2 = z8dVar;
                        Runnable runnable2 = runnable;
                        switch (b32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((de3) z8dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((de3) z8dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                de3 de3Var = (de3) z8dVar2.b;
                                try {
                                    runnable2.run();
                                    de3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    de3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
