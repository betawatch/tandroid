package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yr0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class x1 extends x81 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 U;
    public final /* synthetic */ yr0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(yr0 yr0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.V = yr0Var;
        this.U = n2Var;
    }

    @Override // org.telegram.ui.Components.x81
    public final void A(int i10) {
        this.V.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.U;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final void h() {
        yr0 yr0Var = this.V;
        w81 w81Var = yr0Var.n;
        if (!yr0Var.b() || w81Var == null) {
            return;
        }
        if (yr0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.l0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            oq oqVar = new oq(R.drawable.poll_add_plus, 0);
            oqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            yr0Var.J = spannableStringBuilder;
        }
        w81Var.a(-1, yr0Var.J);
    }

    @Override // org.telegram.ui.Components.x81
    public final boolean i(MotionEvent motionEvent) {
        return !this.V.g();
    }

    @Override // org.telegram.ui.Components.x81
    public final void w(boolean z10) {
        yr0 yr0Var = this.V;
        yr0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.U;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        yr0Var.o();
    }
}
