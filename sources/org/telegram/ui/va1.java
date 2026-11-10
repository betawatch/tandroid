package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb1 b;

    public /* synthetic */ va1(cb1 cb1Var, int i7) {
        this.a = i7;
        this.b = cb1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final cb1 cb1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xa1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                cb1.g0(cb1Var, tL_error, tLObject);
                                break;
                            default:
                                cb1.m0(cb1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ya1(this.b, tL_error, 0));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ya1(this.b, tL_error, 1));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ya1(this.b, tL_error, 2));
                break;
            default:
                final int i10 = 1;
                final cb1 cb1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xa1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                cb1.g0(cb1Var2, tL_error, tLObject);
                                break;
                            default:
                                cb1.m0(cb1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
