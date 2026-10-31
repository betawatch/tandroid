package xh;

import android.content.Context;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ p6 f;

    public /* synthetic */ q2(Object obj, Context context, int i10, long j10, p6 p6Var, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = context;
        this.d = i10;
        this.e = j10;
        this.f = p6Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                final org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final int i10 = 0;
                final Context context = this.c;
                final int i11 = this.d;
                final long j10 = this.e;
                final p6 p6Var = this.f;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    z2Var.dismiss();
                                    z2.I0(context, i11, userFull2.starref_program, j10, p6Var, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    z2Var.dismiss();
                                    z2.I0(context, i11, userFull3.starref_program, j10, p6Var, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) this.b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final int i12 = 1;
                final Context context2 = this.c;
                final int i13 = this.d;
                final long j11 = this.e;
                final p6 p6Var2 = this.f;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    z2Var2.dismiss();
                                    z2.I0(context2, i13, userFull22.starref_program, j11, p6Var2, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    z2Var2.dismiss();
                                    z2.I0(context2, i13, userFull3.starref_program, j11, p6Var2, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ((org.telegram.ui.ActionBar.z2[]) this.b)[0].dismiss();
                z2.J0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                break;
        }
    }
}
