package rh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ y6(y8 y8Var, jj jjVar, un unVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, TLRPC.Chat chat) {
        this.f = y8Var;
        this.h = jjVar;
        this.n = unVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = p6Var;
        this.e = j10;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vh.d dVar = (vh.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.Q) {
                    int i10 = this.b;
                    e6 y3 = e6.y(i10, false);
                    long j10 = this.e;
                    org.telegram.ui.Cells.e1 e1Var = new org.telegram.ui.Cells.e1(dVar, starsSubscription, i10, z2VarArr, j10, 3);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        e1Var.run();
                        break;
                    } else {
                        new x7(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, e1Var, j10).show();
                        break;
                    }
                }
                break;
            default:
                y8 y8Var = (y8) this.f;
                jj jjVar = (jj) this.h;
                un unVar = (un) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!y8Var.K1) {
                    long value = y8Var.p1.getValue();
                    if ((y8Var.I1 != null || (jjVar != null && unVar != null)) && y8Var.O1 == null) {
                        int i11 = this.b;
                        if (!vp.r1(i11).u2()) {
                            e6 y10 = e6.y(i11, false);
                            org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(y8Var, value, y10, jjVar, unVar, 17);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.p6 p6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new x7(context, p6Var, value, 5, chat == null ? "" : chat.title, gVar, j11).show();
                                    break;
                                } else {
                                    new x7(context, p6Var, value, 17, org.telegram.messenger.o5.s(i11, j11), gVar, j11).show();
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

    public /* synthetic */ y6(vh.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.z2[] z2VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = z2VarArr;
        this.e = j10;
        this.r = activity;
        this.d = p6Var;
        this.c = z10;
        this.s = str;
    }
}
