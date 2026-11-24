// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yg1 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ylb f;

    public /* synthetic */ yg1(Object obj, Context context, int i, long j, ylb ylbVar, byte b) {
        this.a = b;
        this.b = obj;
        this.c = context;
        this.d = i;
        this.e = j;
        this.f = ylbVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                final my0 my0Var = (my0) obj2;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final byte b2 = 0;
                final Context context = this.c;
                final int i = this.d;
                final long j = this.e;
                final ylb ylbVar = this.f;
                gm.c3(new Runnable() { // from class: zg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        my0 my0Var2 = my0Var;
                        TLRPC.UserFull userFull2 = userFull;
                        switch (b3) {
                            case 0:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    my0Var2.dismiss();
                                    mh1.J0(context, i, userFull2.starref_program, j, ylbVar, true);
                                    break;
                                }
                                break;
                            default:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    my0Var2.dismiss();
                                    mh1.J0(context, i, userFull2.starref_program, j, ylbVar, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final my0 my0Var2 = (my0) obj2;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final byte b3 = 1;
                final Context context2 = this.c;
                final int i2 = this.d;
                final long j2 = this.e;
                final ylb ylbVar2 = this.f;
                gm.c3(new Runnable() { // from class: zg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        my0 my0Var22 = my0Var2;
                        TLRPC.UserFull userFull22 = userFull2;
                        switch (b32) {
                            case 0:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    my0Var22.dismiss();
                                    mh1.J0(context2, i2, userFull22.starref_program, j2, ylbVar2, true);
                                    break;
                                }
                                break;
                            default:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    my0Var22.dismiss();
                                    mh1.J0(context2, i2, userFull22.starref_program, j2, ylbVar2, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ((my0[]) obj2)[0].dismiss();
                mh1.K0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                break;
        }
    }
}
