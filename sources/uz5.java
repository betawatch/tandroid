// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uz5 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ tg5 h;

    public /* synthetic */ uz5(LaunchActivity launchActivity, TLObject tLObject, int i, String str, TLRPC.TL_error tL_error, tg5 tg5Var) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.e = str;
        this.f = tL_error;
        this.h = tg5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d31 b0;
        int i;
        int i2;
        byte b = this.a;
        tg5 tg5Var = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str = this.e;
        TLObject tLObject = this.c;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (tL_error != null) {
                    e S = LaunchActivity.S();
                    if (S != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            b0 = d31.b0(S);
                            i = R.raw.fire_on;
                            i2 = 2131743535;
                        } else {
                            b0 = d31.b0(S);
                            i = R.raw.error;
                            i2 = 2131743536;
                        }
                        bs2.v(null, i2, b0, i, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    uc7.s1(launchActivity.P).j4(tL_payments_uniqueStarGift.users, false);
                    uc7.s1(launchActivity.P).c4(tL_payments_uniqueStarGift.chats, false);
                    e S2 = LaunchActivity.S();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        wua wuaVar = new wua(launchActivity, this.d, 0L, null, null);
                        wuaVar.n2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (S2 == null) {
                            wuaVar.show();
                        } else if (S2.getLastStoryViewer() == null || !S2.getLastStoryViewer().K0) {
                            S2.showDialog(wuaVar);
                        } else {
                            S2.getLastStoryViewer().u(wuaVar);
                        }
                    }
                }
                try {
                    tg5Var.run();
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            default:
                String str3 = LaunchActivity.C1;
                boolean z = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    uc7.s1(this.d).i4(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.t0(new zu1(bundle));
                } else {
                    StringBuilder p = ik8.p("cant import contact token. token=", str, " err=");
                    p.append(tL_error == null ? null : tL_error.text);
                    cc4.d(p.toString());
                    xnb.x(null, 2131747865, d31.b0((e) c00.g(1, launchActivity2.e0)), null);
                }
                try {
                    tg5Var.run();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
        }
    }

    public /* synthetic */ uz5(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, String str, tg5 tg5Var) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.e = str;
        this.h = tg5Var;
    }
}
