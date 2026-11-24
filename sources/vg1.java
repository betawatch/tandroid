// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vg1 extends tx9 {
    public final /* synthetic */ qg1 f2;
    public final /* synthetic */ kx9[] g2;
    public final /* synthetic */ nh1 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg1(nh1 nh1Var, nh1 nh1Var2, Activity activity, Integer num, int i, wjb wjbVar, int i2, int i3, qg1 qg1Var, kx9[] kx9VarArr) {
        super(nh1Var2, activity, true, num, i, true, wjbVar, i2, i3);
        this.h2 = nh1Var;
        this.f2 = qg1Var;
        this.g2 = kx9VarArr;
    }

    @Override // tx9
    public final long getDialogId() {
        return this.h2.a;
    }

    @Override // tx9
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // tx9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(Long.valueOf(l == null ? 0L : l.longValue()), num, tL_starGiftUnique);
        kx9 kx9Var = this.g2[0];
        if (kx9Var != null) {
            this.h2.R = null;
            kx9Var.dismiss();
        }
    }
}
