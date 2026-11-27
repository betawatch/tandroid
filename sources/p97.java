// default package

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p97 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ p97(uc7 uc7Var, Context context, id idVar, ef7 ef7Var, long j, ea2 ea2Var, e eVar, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = uc7Var;
        this.c = context;
        this.e = idVar;
        this.f = ef7Var;
        this.b = j;
        this.g = ea2Var;
        this.h = eVar;
        this.i = tL_messages_migrateChat;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) obj6;
                id idVar = (id) obj5;
                ef7 ef7Var = (ef7) obj4;
                ea2 ea2Var = (ea2) obj3;
                e eVar = (e) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                Context context = this.c;
                if (tL_error != null) {
                    if (ea2Var != null) {
                        ea2Var.run();
                    }
                    hl.c3(new ra7((Object) uc7Var, (Object) ef7Var, (Object) context, (Object) idVar, (Object) tL_error, (Object) eVar, (Object) tL_messages_migrateChat, (byte) 0));
                    break;
                } else {
                    if (context != null) {
                        hl.c3(new vd(idVar, context));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7Var.Y3(updates, false);
                    hl.c3(new cq6((Object) ef7Var, (Object) updates, this.b, (byte) 6));
                    break;
                }
            default:
                final jxa jxaVar = (jxa) obj6;
                final icc iccVar = (icc) obj5;
                final String str = (String) obj4;
                final vnb vnbVar = (vnb) obj3;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) obj2;
                final String str2 = (String) obj;
                final long j = this.b;
                final Context context2 = this.c;
                hl.c3(new Runnable() { // from class: zva
                    @Override // java.lang.Runnable
                    public final void run() {
                        y16 y16Var;
                        jxa jxaVar2 = jxa.this;
                        TLObject tLObject2 = tLObject;
                        icc iccVar2 = iccVar;
                        long j2 = j;
                        String str3 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        vnb vnbVar2 = vnbVar;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str4 = str2;
                        e Q = LaunchActivity.Q();
                        d31 b0 = !hl.s1(Q) ? d31.b0(Q) : d31.Y();
                        byte b2 = 1;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                iccVar2.a(0L, Boolean.FALSE);
                                b0.Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                return;
                            } else if (!uc7.s1(jxaVar2.a).i5()) {
                                iccVar2.a(0L, Boolean.FALSE);
                                jxa.d0(context3, vnbVar2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                dza dzaVar = new dza(context3, vnbVar2, j2, 1, chatInvite2.title, new cp7((Object) jxaVar2, (Object) zArr, (Object) str4, (Object) chatInvite2, (Object) iccVar2, (byte) 27), 0L);
                                dzaVar.setOnDismissListener(new gwa((byte) 0, iccVar2, zArr));
                                dzaVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.d.c(new fwa(jxaVar2, tL_payments_paymentResult, b2));
                        TLRPC.Updates updates2 = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates2.update;
                        long j3 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates2.updates != null) {
                            for (int i = 0; i < tL_payments_paymentResult.updates.updates.size(); i++) {
                                if (tL_payments_paymentResult.updates.updates.get(i) instanceof TL_update.TL_updateChannel) {
                                    j3 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i)).channel_id;
                                }
                            }
                        }
                        iccVar2.a(Long.valueOf(j3), Boolean.TRUE);
                        if (j3 == 0) {
                            b0.I(R.raw.stars_send, ob6.M0(2131744651, null), hl.S2(ob6.G((int) j2, "StarsSubscriptionCompletedText", str3))).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && (y16Var = launchActivity.w0) != null) {
                            y16Var.c(true);
                        }
                        jxaVar2.Q(true);
                        jxaVar2.P();
                    }
                });
                break;
        }
    }

    public /* synthetic */ p97(jxa jxaVar, icc iccVar, long j, String str, Context context, vnb vnbVar, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = jxaVar;
        this.e = iccVar;
        this.b = j;
        this.f = str;
        this.c = context;
        this.g = vnbVar;
        this.h = chatInvite;
        this.i = str2;
    }
}
