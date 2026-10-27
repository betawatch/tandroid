package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    public /* synthetic */ yf1(fg1 fg1Var, int i10) {
        this.a = i10;
        this.b = fg1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final fg1 fg1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ag1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                fg1.c0(fg1Var, tL_error, tLObject);
                                break;
                            default:
                                fg1.i0(fg1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new bg1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bg1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new bg1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final fg1 fg1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ag1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                fg1.c0(fg1Var2, tL_error, tLObject);
                                break;
                            default:
                                fg1.i0(fg1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
