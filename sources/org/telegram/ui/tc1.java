package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae1 b;

    public /* synthetic */ tc1(ae1 ae1Var, int i10) {
        this.a = i10;
        this.b = ae1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final ae1 ae1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.rc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ae1.W(ae1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ae1 ae1Var2 = ae1Var;
                                        ae1Var2.W0 = tL_wallPaper;
                                        ae1Var2.b1(false);
                                        ae1Var2.j1();
                                        ae1Var2.U0.add(0, ae1Var2.W0);
                                        yd1 yd1Var = ae1Var2.Q0;
                                        if (yd1Var != null) {
                                            yd1Var.l();
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final ae1 ae1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.rc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ae1.W(ae1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ae1 ae1Var22 = ae1Var2;
                                        ae1Var22.W0 = tL_wallPaper;
                                        ae1Var22.b1(false);
                                        ae1Var22.j1();
                                        ae1Var22.U0.add(0, ae1Var22.W0);
                                        yd1 yd1Var = ae1Var22.Q0;
                                        if (yd1Var != null) {
                                            yd1Var.l();
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
