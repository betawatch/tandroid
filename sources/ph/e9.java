package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class e9 extends a3 {
    public final /* synthetic */ da h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(da daVar, int i10, Context context, nh.b bVar, MediaController.AlbumEntry albumEntry, boolean z4, boolean z10, boolean z11) {
        super(i10, context, bVar, albumEntry, z4, 1.39f, z10, z11);
        this.h0 = daVar;
    }

    @Override // ph.a3
    public final void a() {
        da daVar = this.h0;
        daVar.J0.setTranslationY(daVar.n.getMeasuredHeight() - daVar.J0.g());
        q8 q8Var = daVar.n2;
        if (q8Var != null) {
            q8Var.run();
            daVar.n2 = null;
        }
    }

    @Override // ph.a3
    public final void c(boolean z4) {
        if (this.h0.c0 == 0 && z4) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 26));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        da daVar = this.h0;
        daVar.I0 = true;
        daVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        da daVar = this.h0;
        if (daVar.h2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (daVar.n.getMeasuredHeight() - daVar.J0.g())), 1.0f, 0.0f);
            daVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            daVar.r.setAlpha(1.0f - (0.6f * clamp));
            daVar.f0.setAlpha(1.0f - clamp);
        }
    }
}
