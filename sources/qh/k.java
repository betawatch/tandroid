package qh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import s4.c1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends s4.g0 {
    public final /* synthetic */ g0 c;

    public k(g0 g0Var) {
        this.c = g0Var;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.s;
    }

    @Override // s4.g0
    public final int d(int i10) {
        g0 g0Var = this.c;
        o oVar = (o) g0Var.n.get(g0Var.f(i10));
        return (oVar.b == null || i10 != oVar.d) ? 1 : 0;
    }

    @Override // s4.g0
    public final void t(c1 c1Var, int i10) {
        g0 g0Var = this.c;
        o oVar = (o) g0Var.n.get(g0Var.f(i10));
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            ((l) view).set((TLRPC.Document) oVar.c.get((i10 - oVar.d) - (oVar.b == null ? 0 : 1)));
            return;
        }
        n nVar = (n) view;
        String str = oVar.b;
        int i12 = (g0Var.x || oVar.a != 2) ? 0 : 1;
        TextView textView = nVar.b;
        TextView textView2 = nVar.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(nVar.c.y);
        textView.setVisibility(i12 != 0 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L = org.telegram.messenger.i0.L(15.0f) + (i12 != 0 ? org.telegram.messenger.i0.L(6.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) : 0);
        if (layoutParams.rightMargin != L) {
            layoutParams.rightMargin = L;
            textView2.setLayoutParams(layoutParams);
        }
    }

    @Override // s4.g0
    public final c1 w(ViewGroup viewGroup, int i10) {
        View lVar;
        g0 g0Var = this.c;
        if (i10 == 0) {
            lVar = new n(g0Var, viewGroup.getContext());
            lVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), g0Var.a);
            lVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new j(lVar);
    }
}
