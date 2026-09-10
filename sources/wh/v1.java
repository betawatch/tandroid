package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class v1 extends v81 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 T;
    public final /* synthetic */ wr0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(wr0 wr0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        this.U = wr0Var;
        this.T = p2Var;
    }

    @Override // org.telegram.ui.Components.v81
    public final void h() {
        wr0 wr0Var = this.U;
        u81 u81Var = wr0Var.n;
        if (!wr0Var.b() || u81Var == null) {
            return;
        }
        if (wr0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.a2.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            uq uqVar = new uq(R.drawable.poll_add_plus, 0);
            uqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            wr0Var.J = spannableStringBuilder;
        }
        u81Var.a(-1, wr0Var.J);
    }

    @Override // org.telegram.ui.Components.v81
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override // org.telegram.ui.Components.v81
    public final void w(boolean z10) {
        wr0 wr0Var = this.U;
        wr0Var.l();
        org.telegram.ui.ActionBar.p2 p2Var = this.T;
        if (p2Var instanceof ProfileActivity) {
            ((ProfileActivity) p2Var).R();
            View fragmentView = p2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        wr0Var.o();
    }

    @Override // org.telegram.ui.Components.v81
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.p2 p2Var = this.T;
        if (p2Var instanceof ProfileActivity) {
            ((ProfileActivity) p2Var).R();
        }
    }
}
