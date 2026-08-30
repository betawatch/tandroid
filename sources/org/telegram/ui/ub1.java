package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd1 b;

    public /* synthetic */ ub1(cd1 cd1Var, int i10) {
        this.a = i10;
        this.b = cd1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final cd1 cd1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                cd1.V(cd1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        cd1 cd1Var2 = cd1Var;
                                        cd1Var2.T0 = tL_wallPaper;
                                        cd1Var2.b1(false);
                                        cd1Var2.j1();
                                        cd1Var2.R0.add(0, cd1Var2.T0);
                                        ad1 ad1Var = cd1Var2.N0;
                                        if (ad1Var != null) {
                                            ad1Var.l();
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
                final cd1 cd1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                cd1.V(cd1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        cd1 cd1Var22 = cd1Var2;
                                        cd1Var22.T0 = tL_wallPaper;
                                        cd1Var22.b1(false);
                                        cd1Var22.j1();
                                        cd1Var22.R0.add(0, cd1Var22.T0);
                                        ad1 ad1Var = cd1Var22.N0;
                                        if (ad1Var != null) {
                                            ad1Var.l();
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
