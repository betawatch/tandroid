package zh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ f6(di.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.e3[] e3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = e3VarArr;
        this.e = j10;
        this.r = activity;
        this.d = c6Var;
        this.c = z10;
        this.s = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                di.d dVar = (di.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.N) {
                    int i10 = this.b;
                    n5 y3 = n5.y(i10, false);
                    long j10 = this.e;
                    bi.y7 y7Var = new bi.y7(dVar, starsSubscription, i10, e3VarArr, j10, 14);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        y7Var.run();
                        break;
                    } else {
                        new e7(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, y7Var, j10).show();
                        break;
                    }
                }
                break;
            default:
                h8 h8Var = (h8) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                fo foVar = (fo) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!h8Var.S) {
                    long value = h8Var.r.getValue();
                    if ((h8Var.Q != null || (messageObject != null && foVar != null)) && h8Var.W == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            n5 y10 = n5.y(i11, false);
                            org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(h8Var, value, y10, messageObject, foVar, 15);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.c6 c6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new e7(context, c6Var, value, 5, chat == null ? "" : chat.title, fVar, j11).show();
                                    break;
                                } else {
                                    new e7(context, c6Var, value, 17, DialogObject.getShortName(i11, j11), fVar, j11).show();
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

    public /* synthetic */ f6(h8 h8Var, MessageObject messageObject, fo foVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TLRPC.Chat chat) {
        this.f = h8Var;
        this.h = messageObject;
        this.n = foVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = c6Var;
        this.e = j10;
        this.s = chat;
    }
}
