package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ ua1(bb1 bb1Var, int i7) {
        this.a = i7;
        this.b = bb1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final bb1 bb1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wa1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                bb1.g0(bb1Var, tL_error, tLObject);
                                break;
                            default:
                                bb1.m0(bb1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                org.telegram.messenger.g0.h3(new xa1(this.b, tL_error, 0));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new xa1(this.b, tL_error, 1));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new xa1(this.b, tL_error, 2));
                break;
            default:
                final int i10 = 1;
                final bb1 bb1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wa1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                bb1.g0(bb1Var2, tL_error, tLObject);
                                break;
                            default:
                                bb1.m0(bb1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
