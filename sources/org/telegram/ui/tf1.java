package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag1 b;

    public /* synthetic */ tf1(ag1 ag1Var, int i9) {
        this.a = i9;
        this.b = ag1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final ag1 ag1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                ag1.a0(ag1Var, tL_error, tLObject);
                                break;
                            default:
                                ag1.g0(ag1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new wf1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new wf1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new wf1(this.b, tL_error, 2));
                break;
            default:
                final int i10 = 1;
                final ag1 ag1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ag1.a0(ag1Var2, tL_error, tLObject);
                                break;
                            default:
                                ag1.g0(ag1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
