package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r61 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ r61(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final x71 x71Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.p61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                x71.b0(x71Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        x71 x71Var2 = x71Var;
                                        x71Var2.X0 = tL_wallPaper;
                                        x71Var2.g1(false);
                                        x71Var2.o1();
                                        x71Var2.V0.add(0, x71Var2.X0);
                                        v71 v71Var = x71Var2.R0;
                                        if (v71Var != null) {
                                            v71Var.f();
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
                final int i10 = 0;
                final x71 x71Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.p61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                x71.b0(x71Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        x71 x71Var22 = x71Var2;
                                        x71Var22.X0 = tL_wallPaper;
                                        x71Var22.g1(false);
                                        x71Var22.o1();
                                        x71Var22.V0.add(0, x71Var22.X0);
                                        v71 v71Var = x71Var22.R0;
                                        if (v71Var != null) {
                                            v71Var.f();
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
