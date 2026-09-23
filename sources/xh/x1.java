package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class x1 extends h81 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 T;
    public final /* synthetic */ nr0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(nr0 nr0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = nr0Var;
        this.T = n2Var;
    }

    @Override // org.telegram.ui.Components.h81
    public final void h() {
        nr0 nr0Var = this.U;
        g81 g81Var = nr0Var.n;
        if (!nr0Var.b() || g81Var == null) {
            return;
        }
        if (nr0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.z0.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            pq pqVar = new pq(R.drawable.poll_add_plus, 0);
            pqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
            nr0Var.J = spannableStringBuilder;
        }
        g81Var.a(-1, nr0Var.J);
    }

    @Override // org.telegram.ui.Components.h81
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override // org.telegram.ui.Components.h81
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

    @Override // org.telegram.ui.Components.h81
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
        }
    }
}
