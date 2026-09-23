package yh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class e2 implements wp0, fk0 {
    public final /* synthetic */ KeyEvent.Callback a;

    public /* synthetic */ e2(KeyEvent.Callback callback) {
        this.a = callback;
    }

    @Override // org.telegram.ui.Components.fk0
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.a;
        tVar.a.ab(null, tVar.e, tVar.b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new w2(this, 8));
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

    @Override // org.telegram.ui.Components.wp0
    public void u0() {
        qc k10 = ((y3) this.a).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // org.telegram.ui.Components.wp0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
