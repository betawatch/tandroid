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
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ n6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.g3[] g3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = g3VarArr;
        this.e = j3;
        this.r = activity;
        this.d = f6Var;
        this.c = z10;
        this.s = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ci.d dVar = (ci.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.N) {
                    int i10 = this.b;
                    v5 y3 = v5.y(i10, false);
                    long j3 = this.e;
                    ai.l8 l8Var = new ai.l8(dVar, starsSubscription, i10, g3VarArr, j3, 12);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        l8Var.run();
                        break;
                    } else {
                        new n7(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j3 < 0 ? 2 : 7, str, l8Var, j3).show();
                        break;
                    }
                }
                break;
            default:
                q8 q8Var = (q8) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                bo boVar = (bo) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!q8Var.R) {
                    long value = q8Var.r.getValue();
                    if ((q8Var.P != null || (messageObject != null && boVar != null)) && q8Var.V == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            v5 y10 = v5.y(i11, false);
                            org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(q8Var, value, y10, messageObject, boVar, 15);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.f6 f6Var = this.d;
                                long j10 = this.e;
                                if (!z10) {
                                    new n7(context, f6Var, value, 5, chat == null ? "" : chat.title, fVar, j10).show();
                                    break;
                                } else {
                                    new n7(context, f6Var, value, 17, DialogObject.getShortName(i11, j10), fVar, j10).show();
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

    public /* synthetic */ n6(q8 q8Var, MessageObject messageObject, bo boVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, TLRPC.Chat chat) {
        this.f = q8Var;
        this.h = messageObject;
        this.n = boVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = f6Var;
        this.e = j3;
        this.s = chat;
    }
}
