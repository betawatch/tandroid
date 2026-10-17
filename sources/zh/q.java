package zh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class q extends s4.g0 {
    public final /* synthetic */ k0 c;

    public q(k0 k0Var) {
        this.c = k0Var;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.s;
    }

    @Override // s4.g0
    public final int j(int i10) {
        k0 k0Var = this.c;
        u uVar = (u) k0Var.n.get(k0Var.f(i10));
        return (uVar.b == null || i10 != uVar.d) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        k0 k0Var = this.c;
        u uVar = (u) k0Var.n.get(k0Var.f(i10));
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            ((r) view).set((TLRPC.Document) uVar.c.get((i10 - uVar.d) - (uVar.b == null ? 0 : 1)));
            return;
        }
        t tVar = (t) view;
        String str = uVar.b;
        int i12 = (k0Var.w || uVar.a != 2) ? 0 : 1;
        TextView textView = tVar.b;
        TextView textView2 = tVar.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(tVar.c.x);
        textView.setVisibility(i12 != 0 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int dp = AndroidUtilities.dp(15.0f) + (i12 != 0 ? AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) : 0);
        if (layoutParams.rightMargin != dp) {
            layoutParams.rightMargin = dp;
            textView2.setLayoutParams(layoutParams);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View rVar;
        k0 k0Var = this.c;
        if (i10 == 0) {
            rVar = new t(k0Var, viewGroup.getContext());
            rVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            rVar = new r(viewGroup.getContext(), k0Var.a);
            rVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new p(rVar);
    }
}
