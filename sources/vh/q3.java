package vh;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q3 extends u1 {
    public final /* synthetic */ b4 A1;
    public final /* synthetic */ int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(b4 b4Var, Context context, org.telegram.ui.ActionBar.x4 x4Var, int i10) {
        super(context, x4Var, false, false);
        this.A1 = b4Var;
        this.z1 = i10;
    }

    @Override // vh.u1
    public final boolean I0(Integer num) {
        x3 x3Var = this.A1.A0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < x3Var.getChildCount(); i11++) {
                if (x3Var.getChildAt(i11) instanceof jg.h2) {
                    i10++;
                }
            }
            int i12 = vp.r1(this.a).p5;
            org.telegram.ui.ActionBar.p2 p2Var = this.c;
            if (i10 >= i12 && !d20.i(this.a).q()) {
                String G = cd.G(vp.r1(this.a).q5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    p2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new cc(p2Var, this.I0).I(R.raw.star_premium_2, cd.L0(2131749208, null), org.telegram.messenger.i0.R2(G, org.telegram.ui.ActionBar.t6.Uc, 0, new d0(this, 2), this.I0)).k(true);
                return false;
            }
            if (i10 >= vp.r1(this.a).q5) {
                try {
                    p2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new cc(p2Var, this.I0).I(R.raw.chats_infotip, cd.L0(2131748988, "LimitReached"), cd.G(vp.r1(this.a).q5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // vh.u1
    public final boolean J0(Integer num) {
        b4 b4Var = this.A1;
        x3 x3Var = b4Var.A0;
        boolean z10 = false;
        if (b4Var.G1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= x3Var.getChildCount()) {
                    break;
                }
                if (x3Var.getChildAt(i10) instanceof jg.h3) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return !z10;
        }
        return true;
    }

    @Override // vh.u1
    public final boolean K0(Runnable runnable) {
        o8 o8Var = ((s7) this.A1).j2;
        Activity activity = o8Var.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, zs.A1);
            o8Var.y2 = (org.telegram.utils.twidget.v) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, zs.A1);
        o8Var.y2 = (org.telegram.utils.twidget.v) runnable;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void n0() {
        this.A1.O0(this.z1);
    }
}
