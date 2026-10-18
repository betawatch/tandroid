package zh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import s4.b1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class k extends s4.g0 {
    public final /* synthetic */ d0 c;

    public k(d0 d0Var) {
        this.c = d0Var;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.s;
    }

    @Override // s4.g0
    public final int j(int i10) {
        d0 d0Var = this.c;
        o oVar = (o) d0Var.n.get(d0Var.f(i10));
        return (oVar.b == null || i10 != oVar.d) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        d0 d0Var = this.c;
        o oVar = (o) d0Var.n.get(d0Var.f(i10));
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            ((l) view).set((TLRPC.Document) oVar.c.get((i10 - oVar.d) - (oVar.b == null ? 0 : 1)));
            return;
        }
        n nVar = (n) view;
        String str = oVar.b;
        int i12 = (d0Var.w || oVar.a != 2) ? 0 : 1;
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
    public final b1 x(ViewGroup viewGroup, int i10) {
        View lVar;
        d0 d0Var = this.c;
        if (i10 == 0) {
            lVar = new n(d0Var, viewGroup.getContext());
            lVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), d0Var.a);
            lVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new j(lVar);
    }
}
