package uf;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ g0(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.G.manage_stories = !r2.manage_stories;
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                break;
            case 1:
                k0 k0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = k0Var2.G;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                k0Var2.c.V2.N(true);
                k0Var2.Y(true);
                break;
            case 2:
                k0 k0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = k0Var3.G;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                k0Var3.c.V2.N(true);
                k0Var3.Y(true);
                break;
            case 3:
                k0 k0Var4 = this.b;
                k0Var4.c.V2.N(true);
                k0Var4.Y(true);
                break;
            default:
                k0 k0Var5 = this.b;
                String obj = k0Var5.f.getText().toString();
                String str = k0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    k0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        tf.k1 k1Var = k0Var5.d;
                        k0Var5.y = obj;
                        int i10 = k0Var5.B;
                        k0Var5.B = i10 + 1;
                        k1Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        k0Var5.y = null;
                        k0Var5.d.b();
                        k0Var5.c.V2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
