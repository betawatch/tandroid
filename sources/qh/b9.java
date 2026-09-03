package qh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class b9 extends z2 {
    public final /* synthetic */ ba h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(ba baVar, int i10, Context context, oh.b bVar, MediaController.AlbumEntry albumEntry, boolean z4, boolean z10, boolean z11) {
        super(i10, context, bVar, albumEntry, z4, 1.39f, z10, z11);
        this.h0 = baVar;
    }

    @Override // qh.z2
    public final void a() {
        ba baVar = this.h0;
        baVar.J0.setTranslationY(baVar.n.getMeasuredHeight() - baVar.J0.g());
        o8 o8Var = baVar.n2;
        if (o8Var != null) {
            o8Var.run();
            baVar.n2 = null;
        }
    }

    @Override // qh.z2
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
        ba baVar = this.h0;
        baVar.I0 = true;
        baVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ba baVar = this.h0;
        if (baVar.h2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (baVar.n.getMeasuredHeight() - baVar.J0.g())), 1.0f, 0.0f);
            baVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            baVar.r.setAlpha(1.0f - (0.6f * clamp));
            baVar.f0.setAlpha(1.0f - clamp);
        }
    }
}
