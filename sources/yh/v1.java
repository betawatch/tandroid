package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class v1 extends k91 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 T;
    public final /* synthetic */ ns0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(ns0 ns0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.U = ns0Var;
        this.T = m2Var;
    }

    @Override // org.telegram.ui.Components.k91
    public final void h() {
        ns0 ns0Var = this.U;
        j91 j91Var = ns0Var.n;
        if (!ns0Var.b() || j91Var == null) {
            return;
        }
        if (ns0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            br brVar = new br(R.drawable.poll_add_plus, 0);
            brVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            ns0Var.J = spannableStringBuilder;
        }
        j91Var.a(-1, ns0Var.J);
    }

    @Override // org.telegram.ui.Components.k91
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override // org.telegram.ui.Components.k91
    public final void w(boolean z10) {
        ns0 ns0Var = this.U;
        ns0Var.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
            View fragmentView = m2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        ns0Var.o();
    }

    @Override // org.telegram.ui.Components.k91
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
        }
    }
}
