package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya1 b;

    public /* synthetic */ ra1(ya1 ya1Var, int i7) {
        this.a = i7;
        this.b = ya1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ya1 ya1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ta1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                ya1.g0(ya1Var, tL_error, tLObject);
                                break;
                            default:
                                ya1.m0(ya1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ua1(this.b, tL_error, 0));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ua1(this.b, tL_error, 1));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ua1(this.b, tL_error, 2));
                break;
            default:
                final int i10 = 1;
                final ya1 ya1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ta1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ya1.g0(ya1Var2, tL_error, tLObject);
                                break;
                            default:
                                ya1.m0(ya1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
