// default package

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class tw7 extends zw3 {
    public final /* synthetic */ int D1;
    public final /* synthetic */ dx7 E1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw7(dx7 dx7Var, Context context, uk5 uk5Var, int i) {
        super(uk5Var, context, false, false);
        this.E1 = dx7Var;
        this.D1 = i;
    }

    @Override // zw3
    public final boolean E0(Integer num) {
        zw7 zw7Var = this.E1.B0;
        if (num.intValue() == 3) {
            int i = 0;
            for (int i2 = 0; i2 < zw7Var.getChildCount(); i2++) {
                if (zw7Var.getChildAt(i2) instanceof s39) {
                    i++;
                }
            }
            int f = uc7.s1(this.a).k4.F1.f();
            ex0 ex0Var = this.c;
            if (i >= f && !yac.h(this.a).p()) {
                String G = ob6.G(uc7.s1(this.a).k4.G1.f(), "StoryPremiumWidgets2", new Object[0]);
                try {
                    ex0Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new d31(ex0Var, this.J0).I(R.raw.star_premium_2, ob6.M0(2131748953, null), hl.N2(G, aob.Xc, 0, new zg3(this, (byte) 28), this.J0)).k(true);
                return false;
            }
            if (i >= uc7.s1(this.a).k4.G1.f()) {
                try {
                    ex0Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new d31(ex0Var, this.J0).I(R.raw.chats_infotip, ob6.M0(2131748732, "LimitReached"), ob6.G(uc7.s1(this.a).k4.G1.f(), "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041 A[RETURN] */
    @Override // zw3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F0(Integer num) {
        gc1 gc1Var;
        dx7 dx7Var = this.E1;
        zw7 zw7Var = dx7Var.B0;
        boolean z = false;
        if (dx7Var.H1) {
            return num.intValue() == 2;
        }
        if (num.intValue() == 5) {
            int i = 0;
            while (true) {
                if (i >= zw7Var.getChildCount()) {
                    break;
                }
                if (zw7Var.getChildAt(i) instanceof xwc) {
                    z = true;
                    break;
                }
                i++;
            }
            return !z;
        }
        if (num.intValue() != 6 || ((gc1Var = dx7Var.U1) != null && gc1Var.c())) {
        }
    }

    @Override // zw3
    public final boolean G0(Runnable runnable) {
        rbb rbbVar = ((vab) this.E1).o2;
        Activity activity = rbbVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, jn7.z1);
            rbbVar.z2 = (hl3) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, jn7.z1);
        rbbVar.z2 = (hl3) runnable;
        return false;
    }

    @Override // nx0
    public final void k0() {
        this.E1.Q0(this.D1);
    }
}
