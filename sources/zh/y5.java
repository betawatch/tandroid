package zh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class y5 {
    public final int a;
    public final ru b;
    public final x20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.g5 f;
    public final org.telegram.ui.Components.g5 g;

    public y5(View view) {
        ru ruVar = new ru(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = ruVar;
        wr wrVar = wr.h;
        this.f = new org.telegram.ui.Components.g5(ruVar, 350L, wrVar);
        this.g = new org.telegram.ui.Components.g5(ruVar, 350L, wrVar);
        x20 x20Var = new x20();
        this.c = x20Var;
        x20Var.a = true;
        x20Var.b = true;
        b(false);
        x20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        x20Var.c.setStyle(Paint.Style.STROKE);
        x20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        x20 x20Var = this.c;
        x20Var.d(a2, a10, 0, 0);
        x20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return x20Var.c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f.a(i10, true);
            this.g.a(i11, true);
        }
        ru ruVar = this.b;
        if (ruVar != null) {
            ruVar.run();
        }
    }
}
