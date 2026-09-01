package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed1 b;

    public /* synthetic */ vb1(ed1 ed1Var, int i10) {
        this.a = i10;
        this.b = ed1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final ed1 ed1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.tb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ed1.V(ed1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ed1 ed1Var2 = ed1Var;
                                        ed1Var2.T0 = tL_wallPaper;
                                        ed1Var2.b1(false);
                                        ed1Var2.j1();
                                        ed1Var2.R0.add(0, ed1Var2.T0);
                                        cd1 cd1Var = ed1Var2.N0;
                                        if (cd1Var != null) {
                                            cd1Var.l();
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
                final ed1 ed1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.tb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ed1.V(ed1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ed1 ed1Var22 = ed1Var2;
                                        ed1Var22.T0 = tL_wallPaper;
                                        ed1Var22.b1(false);
                                        ed1Var22.j1();
                                        ed1Var22.R0.add(0, ed1Var22.T0);
                                        cd1 cd1Var = ed1Var22.N0;
                                        if (cd1Var != null) {
                                            cd1Var.l();
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
