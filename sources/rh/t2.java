package rh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ f6 f;

    public /* synthetic */ t2(Object obj, Context context, int i10, long j10, f6 f6Var, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = context;
        this.d = i10;
        this.e = j10;
        this.f = f6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                final org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final int i10 = 0;
                final Context context = this.c;
                final int i11 = this.d;
                final long j10 = this.e;
                final f6 f6Var = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.u2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    g3Var.dismiss();
                                    e3.G0(context, i11, userFull2.starref_program, j10, f6Var, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    g3Var.dismiss();
                                    e3.G0(context, i11, userFull3.starref_program, j10, f6Var, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final int i12 = 1;
                final Context context2 = this.c;
                final int i13 = this.d;
                final long j11 = this.e;
                final f6 f6Var2 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.u2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    g3Var2.dismiss();
                                    e3.G0(context2, i13, userFull22.starref_program, j11, f6Var2, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    g3Var2.dismiss();
                                    e3.G0(context2, i13, userFull3.starref_program, j11, f6Var2, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ((org.telegram.ui.ActionBar.g3[]) this.b)[0].dismiss();
                e3.H0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                break;
        }
    }
}
