package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;

    public /* synthetic */ sa1(za1 za1Var, int i7) {
        this.a = i7;
        this.b = za1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final za1 za1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ua1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                za1.g0(za1Var, tL_error, tLObject);
                                break;
                            default:
                                za1.m0(za1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                org.telegram.messenger.g0.h3(new va1(this.b, tL_error, 0));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new va1(this.b, tL_error, 1));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new va1(this.b, tL_error, 2));
                break;
            default:
                final int i10 = 1;
                final za1 za1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ua1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                za1.g0(za1Var2, tL_error, tLObject);
                                break;
                            default:
                                za1.m0(za1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
