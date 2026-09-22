package zg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rk0;
import yh.s2;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t implements rk0 {
    public final /* synthetic */ Object a;

    @Override // org.telegram.ui.Components.rk0
    public void h(View view, p0 p0Var, boolean z10, boolean z11) {
        u uVar = (u) this.a;
        uVar.a.ab(null, uVar.e, uVar.b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new s2(this, 9));
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
