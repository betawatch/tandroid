package qh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class c9 extends a3 {
    public final /* synthetic */ ca h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(ca caVar, int i10, Context context, oh.b bVar, MediaController.AlbumEntry albumEntry, boolean z4, boolean z10, boolean z11) {
        super(i10, context, bVar, albumEntry, z4, 1.39f, z10, z11);
        this.h0 = caVar;
    }

    @Override // qh.a3
    public final void a() {
        ca caVar = this.h0;
        caVar.J0.setTranslationY(caVar.n.getMeasuredHeight() - caVar.J0.g());
        p8 p8Var = caVar.n2;
        if (p8Var != null) {
            p8Var.run();
            caVar.n2 = null;
        }
    }

    @Override // qh.a3
    public final void c(boolean z4) {
        if (this.h0.c0 == 0 && z4) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.s0(this, 27));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        ca caVar = this.h0;
        caVar.I0 = true;
        caVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ca caVar = this.h0;
        if (caVar.h2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (caVar.n.getMeasuredHeight() - caVar.J0.g())), 1.0f, 0.0f);
            caVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            caVar.r.setAlpha(1.0f - (0.6f * clamp));
            caVar.f0.setAlpha(1.0f - clamp);
        }
    }
}
