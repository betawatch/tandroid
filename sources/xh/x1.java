package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class x1 extends y81 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 T;
    public final /* synthetic */ bs0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(bs0 bs0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.U = bs0Var;
        this.T = m2Var;
    }

    @Override // org.telegram.ui.Components.y81
    public final void h() {
        bs0 bs0Var = this.U;
        x81 x81Var = bs0Var.n;
        if (!bs0Var.b() || x81Var == null) {
            return;
        }
        if (bs0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.f0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            qq qqVar = new qq(R.drawable.poll_add_plus, 0);
            qqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(qqVar, 0, 1, 33);
            bs0Var.J = spannableStringBuilder;
        }
        x81Var.a(-1, bs0Var.J);
    }

    @Override // org.telegram.ui.Components.y81
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override // org.telegram.ui.Components.y81
    public final void w(boolean z10) {
        bs0 bs0Var = this.U;
        bs0Var.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
            View fragmentView = m2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        bs0Var.o();
    }

    @Override // org.telegram.ui.Components.y81
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
        }
    }
}
