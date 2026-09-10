package xh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wv;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        zh.w2 w2Var;
        switch (this.a) {
            case 0:
                nf.f.u(((x3) this.b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.c).fragment_listed_url);
                break;
            case 1:
                ((x3) this.b).n2((CharSequence) this.c);
                break;
            case 2:
                x2 x2Var = (x2) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                if (x2Var.E.getAlpha() >= 1.0f && !x2Var.h0 && !x2Var.j0 && x2Var.d0 != null) {
                    new s0(x2Var.getContext(), f6Var, x2Var.W, x2Var.c0, x2Var.d0, true).show();
                    break;
                }
                break;
            case 3:
                nf.f.s((Context) this.b, ((TL_stars.StarsTransaction) this.c).transaction_url);
                break;
            case 4:
                zh.t0 t0Var = (zh.t0) this.b;
                Context context = (Context) this.c;
                if (t0Var != null) {
                    int i10 = t0Var.e;
                    if (i10 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            launchActivity.K0(i10);
                        }
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(t0Var.c, t0Var.b);
                        if (u10 == null) {
                            u10 = t0Var.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i10, context, u10, null);
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(17), 200L);
                            break;
                        }
                    }
                }
                break;
            case 5:
                zh.a3 a3Var = (zh.a3) this.b;
                zh.j6 j6Var = (zh.j6) this.c;
                zh.u7 u7Var = a3Var.J0;
                if (j6Var.b == null) {
                    pc Q = new wc(a3Var.c1, a3Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (j6Var.b.longValue() >= 0) {
                        bundle.putLong("user_id", j6Var.b.longValue());
                    } else {
                        bundle.putLong("chat_id", -j6Var.b.longValue());
                    }
                    if (j6Var.e && (num = j6Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        u7Var.H(new eo(bundle));
                        break;
                    } else {
                        u7Var.H(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 6:
                zh.a3 a3Var2 = (zh.a3) this.b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                ((zh.l7) a3Var2.Q1).h(new qg.a1(a3Var2.J0.f, 14, false));
                h3Var.dismiss();
                break;
            default:
                zh.v2 v2Var = (zh.v2) this.b;
                zh.r6 r6Var = (zh.r6) this.c;
                zh.a3 a3Var3 = v2Var.l;
                wv alert = r6Var.getAlert();
                if (alert != null && (w2Var = a3Var3.Q1) != null) {
                    ((zh.l7) w2Var).h(alert);
                    a3Var3.t1.a();
                    break;
                }
                break;
        }
    }
}
