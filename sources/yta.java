// default package

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yta implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wjb d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ yta(u41 u41Var, int i, TL_stars.StarsSubscription starsSubscription, fx0[] fx0VarArr, long j, Activity activity, wjb wjbVar, boolean z, String str) {
        this.f = u41Var;
        this.b = i;
        this.h = starsSubscription;
        this.n = fx0VarArr;
        this.e = j;
        this.r = activity;
        this.d = wjbVar;
        this.c = z;
        this.s = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.s;
        boolean z = this.c;
        Object obj2 = this.n;
        Object obj3 = this.h;
        KeyEvent.Callback callback = this.f;
        switch (b) {
            case 0:
                u41 u41Var = (u41) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                fx0[] fx0VarArr = (fx0[]) obj2;
                Activity activity = (Activity) this.r;
                String str = (String) obj;
                if (!u41Var.R) {
                    int i = this.b;
                    gta v = gta.v(i, false);
                    long j = this.e;
                    wy wyVar = new wy((Object) u41Var, (Object) starsSubscription, i, (Object) fx0VarArr, j, (byte) 12);
                    if (v.f.amount >= starsSubscription.pricing.amount) {
                        wyVar.run();
                        break;
                    } else {
                        new zua(activity, this.d, starsSubscription.pricing.amount, z ? 8 : j < 0 ? 2 : 7, str, wyVar, j).show();
                        break;
                    }
                }
                break;
            default:
                bwa bwaVar = (bwa) callback;
                k27 k27Var = (k27) obj3;
                mu1 mu1Var = (mu1) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!bwaVar.N1) {
                    long value = bwaVar.s1.getValue();
                    if ((bwaVar.L1 != null || (k27Var != null && mu1Var != null)) && bwaVar.R1 == null) {
                        int i2 = this.b;
                        if (!na7.q1(i2).t2()) {
                            gta v2 = gta.v(i2, false);
                            o77 o77Var = new o77((Object) bwaVar, value, (Object) v2, (Object) k27Var, (Object) mu1Var, (byte) 20);
                            if (v2.e && v2.m().amount < value) {
                                Context context = this.r;
                                wjb wjbVar = this.d;
                                long j2 = this.e;
                                if (!z) {
                                    new zua(context, wjbVar, value, 5, chat == null ? "" : chat.title, o77Var, j2).show();
                                    break;
                                } else {
                                    new zua(context, wjbVar, value, 17, cf3.r(i2, j2), o77Var, j2).show();
                                    break;
                                }
                            } else {
                                o77Var.run();
                                break;
                            }
                        } else {
                            h5.b(i2);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ yta(bwa bwaVar, k27 k27Var, mu1 mu1Var, int i, boolean z, Context context, wjb wjbVar, long j, TLRPC.Chat chat) {
        this.f = bwaVar;
        this.h = k27Var;
        this.n = mu1Var;
        this.b = i;
        this.c = z;
        this.r = context;
        this.d = wjbVar;
        this.e = j;
        this.s = chat;
    }
}
