package sf;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ h0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.F.manage_stories = !r2.manage_stories;
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                break;
            case 1:
                l0 l0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = l0Var2.F;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                l0Var2.c.U2.N(true);
                l0Var2.Y(true);
                break;
            case 2:
                l0 l0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var3.F;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                l0Var3.c.U2.N(true);
                l0Var3.Y(true);
                break;
            case 3:
                l0 l0Var4 = this.b;
                l0Var4.c.U2.N(true);
                l0Var4.Y(true);
                break;
            default:
                l0 l0Var5 = this.b;
                String obj = l0Var5.f.getText().toString();
                String str = l0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    l0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        rf.k1 k1Var = l0Var5.d;
                        l0Var5.y = obj;
                        int i10 = l0Var5.A;
                        l0Var5.A = i10 + 1;
                        k1Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        l0Var5.y = null;
                        l0Var5.d.b();
                        l0Var5.c.U2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
