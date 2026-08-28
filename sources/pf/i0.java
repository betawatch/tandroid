package pf;

import android.text.TextUtils;
import of.v1;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ i0(m0 m0Var, int i9) {
        this.a = i9;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m0Var.F.manage_stories = !r2.manage_stories;
                m0Var.c.U2.N(true);
                m0Var.X(true);
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
                m0Var2.X(true);
                break;
            case 2:
                m0 m0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var3.F;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                m0Var3.c.U2.N(true);
                m0Var3.X(true);
                break;
            case 3:
                m0 m0Var4 = this.b;
                m0Var4.c.U2.N(true);
                m0Var4.X(true);
                break;
            default:
                m0 m0Var5 = this.b;
                String obj = m0Var5.f.getText().toString();
                String str = m0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    m0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        v1 v1Var = m0Var5.d;
                        m0Var5.y = obj;
                        int i9 = m0Var5.A;
                        m0Var5.A = i9 + 1;
                        v1Var.h(obj, true, false, true, false, false, 0L, false, 0, i9, 0L, null);
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
