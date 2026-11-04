package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ xf0(dg0 dg0Var, int i3) {
        this.a = i3;
        this.b = dg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final dg0 dg0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                dg0.Z(dg0Var, tL_error, tLObject);
                                break;
                            case 1:
                                dg0.b0(dg0Var, tL_error, tLObject);
                                break;
                            default:
                                dg0.a0(dg0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final dg0 dg0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                dg0.Z(dg0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                dg0.b0(dg0Var2, tL_error, tLObject);
                                break;
                            default:
                                dg0.a0(dg0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final dg0 dg0Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                dg0.Z(dg0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                dg0.b0(dg0Var3, tL_error, tLObject);
                                break;
                            default:
                                dg0.a0(dg0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
