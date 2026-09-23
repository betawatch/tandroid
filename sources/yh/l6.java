package yh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class l6 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ l6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = f3VarArr;
        this.e = j3;
        this.r = activity;
        this.d = d6Var;
        this.c = z10;
        this.s = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ci.d dVar = (ci.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.N) {
                    int i10 = this.b;
                    t5 y3 = t5.y(i10, false);
                    long j3 = this.e;
                    ai.m8 m8Var = new ai.m8(dVar, starsSubscription, i10, f3VarArr, j3, 13);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        m8Var.run();
                        break;
                    } else {
                        new l7(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j3 < 0 ? 2 : 7, str, m8Var, j3).show();
                        break;
                    }
                }
                break;
            default:
                o8 o8Var = (o8) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                xn xnVar = (xn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!o8Var.R) {
                    long value = o8Var.r.getValue();
                    if ((o8Var.P != null || (messageObject != null && xnVar != null)) && o8Var.V == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            t5 y10 = t5.y(i11, false);
                            org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(o8Var, value, y10, messageObject, xnVar, 15);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.d6 d6Var = this.d;
                                long j10 = this.e;
                                if (!z10) {
                                    new l7(context, d6Var, value, 5, chat == null ? "" : chat.title, fVar, j10).show();
                                    break;
                                } else {
                                    new l7(context, d6Var, value, 17, DialogObject.getShortName(i11, j10), fVar, j10).show();
                                    break;
                                }
                            } else {
                                fVar.run();
                                break;
                            }
                        } else {
                            org.telegram.ui.b.b(i11);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ l6(o8 o8Var, MessageObject messageObject, xn xnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, TLRPC.Chat chat) {
        this.f = o8Var;
        this.h = messageObject;
        this.n = xnVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = d6Var;
        this.e = j3;
        this.s = chat;
    }
}
