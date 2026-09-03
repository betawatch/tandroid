package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;

    public /* synthetic */ b(j jVar, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a = i10;
        this.b = jVar;
        this.c = d2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final j jVar = this.b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j.y0(jVar, d2Var, tLObject, tL_error);
                                break;
                            default:
                                j.z0(jVar, d2Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final j jVar2 = this.b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                j.y0(jVar2, d2Var2, tLObject, tL_error);
                                break;
                            default:
                                j.z0(jVar2, d2Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
