package zh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class k extends s4.g0 {
    public final /* synthetic */ k0 c;

    public k(k0 k0Var) {
        this.c = k0Var;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.s;
    }

    @Override // s4.g0
    public final int j(int i10) {
        k0 k0Var = this.c;
        o oVar = (o) k0Var.n.get(k0Var.f(i10));
        return (oVar.b == null || i10 != oVar.d) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        k0 k0Var = this.c;
        o oVar = (o) k0Var.n.get(k0Var.f(i10));
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            ((l) view).set((TLRPC.Document) oVar.c.get((i10 - oVar.d) - (oVar.b == null ? 0 : 1)));
            return;
        }
        n nVar = (n) view;
        String str = oVar.b;
        int i12 = (k0Var.w || oVar.a != 2) ? 0 : 1;
        TextView textView = nVar.b;
        TextView textView2 = nVar.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(nVar.c.x);
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
        View lVar;
        k0 k0Var = this.c;
        if (i10 == 0) {
            lVar = new n(k0Var, viewGroup.getContext());
            lVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), k0Var.a);
            lVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new j(lVar);
    }
}
