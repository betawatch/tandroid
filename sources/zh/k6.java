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
import org.telegram.ui.co;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements View.OnClickListener {
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

    public /* synthetic */ k6(di.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = f3VarArr;
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
                di.d dVar = (di.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.N) {
                    int i10 = this.b;
                    s5 y3 = s5.y(i10, false);
                    long j3 = this.e;
                    bi.u7 u7Var = new bi.u7(dVar, starsSubscription, i10, f3VarArr, j3, 12);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        u7Var.run();
                        break;
                    } else {
                        new k7(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j3 < 0 ? 2 : 7, str, u7Var, j3).show();
                        break;
                    }
                }
                break;
            default:
                n8 n8Var = (n8) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                co coVar = (co) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!n8Var.R) {
                    long value = n8Var.r.getValue();
                    if ((n8Var.P != null || (messageObject != null && coVar != null)) && n8Var.V == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            s5 y10 = s5.y(i11, false);
                            org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(n8Var, value, y10, messageObject, coVar, 15);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.f6 f6Var = this.d;
                                long j10 = this.e;
                                if (!z10) {
                                    new k7(context, f6Var, value, 5, chat == null ? "" : chat.title, fVar, j10).show();
                                    break;
                                } else {
                                    new k7(context, f6Var, value, 17, DialogObject.getShortName(i11, j10), fVar, j10).show();
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

    public /* synthetic */ k6(n8 n8Var, MessageObject messageObject, co coVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, TLRPC.Chat chat) {
        this.f = n8Var;
        this.h = messageObject;
        this.n = coVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = f6Var;
        this.e = j3;
        this.s = chat;
    }
}
