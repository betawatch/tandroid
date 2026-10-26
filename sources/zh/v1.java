package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v1 extends u91 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 V;
    public final /* synthetic */ vs0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(vs0 vs0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.W = vs0Var;
        this.V = r2Var;
    }

    @Override // org.telegram.ui.Components.u91
    public final void A(int i10) {
        this.W.l();
        org.telegram.ui.ActionBar.r2 r2Var = this.V;
        if (r2Var instanceof ProfileActivity) {
            ((ProfileActivity) r2Var).S();
        }
    }

    @Override // org.telegram.ui.Components.u91
    public final void h() {
        vs0 vs0Var = this.W;
        t91 t91Var = vs0Var.n;
        if (!vs0Var.b() || t91Var == null) {
            return;
        }
        if (vs0Var.J == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.t.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            zq zqVar = new zq(R.drawable.poll_add_plus, 0);
            zqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            vs0Var.J = spannableStringBuilder;
        }
        t91Var.a(-1, vs0Var.J);
    }

    @Override // org.telegram.ui.Components.u91
    public final boolean i(MotionEvent motionEvent) {
        return !this.W.g();
    }

    @Override // org.telegram.ui.Components.u91
    public final void w(boolean z10) {
        vs0 vs0Var = this.W;
        vs0Var.l();
        org.telegram.ui.ActionBar.r2 r2Var = this.V;
        if (r2Var instanceof ProfileActivity) {
            ((ProfileActivity) r2Var).S();
            View fragmentView = r2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        vs0Var.p();
    }
}
