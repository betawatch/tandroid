package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class v1 extends i81 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 T;
    public final /* synthetic */ nr0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(nr0 nr0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = nr0Var;
        this.T = n2Var;
    }

    @Override // org.telegram.ui.Components.i81
    public final void h() {
        nr0 nr0Var = this.U;
        h81 h81Var = nr0Var.n;
        if (!nr0Var.b() || h81Var == null) {
            return;
        }
        if (nr0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            nq nqVar = new nq(R.drawable.poll_add_plus, 0);
            nqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            nr0Var.J = spannableStringBuilder;
        }
        h81Var.a(-1, nr0Var.J);
    }

    @Override // org.telegram.ui.Components.i81
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override // org.telegram.ui.Components.i81
    public final void w(boolean z10) {
        nr0 nr0Var = this.U;
        nr0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        nr0Var.o();
    }

    @Override // org.telegram.ui.Components.i81
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
        }
    }
}
