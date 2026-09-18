package yh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.xp0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class g2 implements xp0, fk0 {
    public final /* synthetic */ KeyEvent.Callback a;

    public /* synthetic */ g2(KeyEvent.Callback callback) {
        this.a = callback;
    }

    @Override // org.telegram.ui.Components.fk0
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.a;
        tVar.a.ab(null, tVar.e, tVar.b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new y2(this, 8));
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.xp0
    public void u0() {
        oc k10 = ((a4) this.a).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // org.telegram.ui.Components.xp0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
