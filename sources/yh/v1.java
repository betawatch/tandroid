package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class v1 extends c91 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 T;
    public final /* synthetic */ is0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(is0 is0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = is0Var;
        this.T = n2Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final void h() {
        is0 is0Var = this.U;
        b91 b91Var = is0Var.n;
        if (!is0Var.b() || b91Var == null) {
            return;
        }
        if (is0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            yq yqVar = new yq(R.drawable.poll_add_plus, 0);
            yqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
            is0Var.J = spannableStringBuilder;
        }
        b91Var.a(-1, is0Var.J);
    }

    @Override // org.telegram.ui.Components.c91
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override // org.telegram.ui.Components.c91
    public final void w(boolean z10) {
        is0 is0Var = this.U;
        is0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        is0Var.o();
    }

    @Override // org.telegram.ui.Components.c91
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
        }
    }
}
