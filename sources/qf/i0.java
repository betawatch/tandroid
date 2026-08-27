package qf;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ i0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m0Var.F.manage_stories = !r2.manage_stories;
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                break;
            case 1:
                m0 m0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = m0Var2.F;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                m0Var2.c.U2.N(true);
                m0Var2.Y(true);
                break;
            case 2:
                m0 m0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var3.F;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                m0Var3.c.U2.N(true);
                m0Var3.Y(true);
                break;
            case 3:
                m0 m0Var4 = this.b;
                m0Var4.c.U2.N(true);
                m0Var4.Y(true);
                break;
            default:
                m0 m0Var5 = this.b;
                String obj = m0Var5.f.getText().toString();
                String str = m0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    m0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        pf.j1 j1Var = m0Var5.d;
                        m0Var5.y = obj;
                        int i10 = m0Var5.A;
                        m0Var5.A = i10 + 1;
                        j1Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        m0Var5.y = null;
                        m0Var5.d.b();
                        m0Var5.c.U2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
