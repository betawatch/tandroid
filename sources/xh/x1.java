package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.rq;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class x1 extends h91 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 V;
    public final /* synthetic */ gs0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(gs0 gs0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.W = gs0Var;
        this.V = n2Var;
    }

    @Override // org.telegram.ui.Components.h91
    public final void A(int i10) {
        this.W.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.V;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).P();
        }
    }

    @Override // org.telegram.ui.Components.h91
    public final void h() {
        gs0 gs0Var = this.W;
        g91 g91Var = gs0Var.n;
        if (!gs0Var.b() || g91Var == null) {
            return;
        }
        if (gs0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            rq rqVar = new rq(R.drawable.poll_add_plus, 0);
            rqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
            gs0Var.J = spannableStringBuilder;
        }
        g91Var.a(-1, gs0Var.J);
    }

    @Override // org.telegram.ui.Components.h91
    public final boolean i(MotionEvent motionEvent) {
        return !this.W.g();
    }

    @Override // org.telegram.ui.Components.h91
    public final void w(boolean z10) {
        gs0 gs0Var = this.W;
        gs0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.V;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).P();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        gs0Var.o();
    }
}
