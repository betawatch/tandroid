package xh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    public /* synthetic */ n6(bi.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.h3[] h3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = h3VarArr;
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
                bi.d dVar = (bi.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.N) {
                    int i10 = this.b;
                    v5 y3 = v5.y(i10, false);
                    long j3 = this.e;
                    org.telegram.messenger.k0 k0Var = new org.telegram.messenger.k0(dVar, starsSubscription, i10, h3VarArr, j3, 11);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        k0Var.run();
                        break;
                    } else {
                        new o7(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j3 < 0 ? 2 : 7, str, k0Var, j3).show();
                        break;
                    }
                }
                break;
            default:
                r8 r8Var = (r8) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                eo eoVar = (eo) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!r8Var.R) {
                    long value = r8Var.r.getValue();
                    if ((r8Var.P != null || (messageObject != null && eoVar != null)) && r8Var.V == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            v5 y10 = v5.y(i11, false);
                            org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(r8Var, value, y10, messageObject, eoVar, 15);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.f6 f6Var = this.d;
                                long j10 = this.e;
                                if (!z10) {
                                    new o7(context, f6Var, value, 5, chat == null ? "" : chat.title, gVar, j10).show();
                                    break;
                                } else {
                                    new o7(context, f6Var, value, 17, DialogObject.getShortName(i11, j10), gVar, j10).show();
                                    break;
                                }
                            } else {
                                gVar.run();
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

    public /* synthetic */ n6(r8 r8Var, MessageObject messageObject, eo eoVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, TLRPC.Chat chat) {
        this.f = r8Var;
        this.h = messageObject;
        this.n = eoVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = f6Var;
        this.e = j3;
        this.s = chat;
    }
}
