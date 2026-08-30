package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;

    public /* synthetic */ b(k kVar, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a = i10;
        this.b = kVar;
        this.c = d2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final k kVar = this.b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k.y0(kVar, d2Var, tLObject, tL_error);
                                break;
                            default:
                                k.z0(kVar, d2Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final k kVar2 = this.b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k.y0(kVar2, d2Var2, tLObject, tL_error);
                                break;
                            default:
                                k.z0(kVar2, d2Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
