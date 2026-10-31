package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import s4.o0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new g());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        h hVar = (h) view;
        f fVar = (f) a51Var.G;
        TLRPC.User user = fVar.b;
        long j10 = fVar.a;
        e eVar = (e) a51Var.H;
        boolean z11 = fVar.c;
        boolean z12 = !a51Var.j;
        g9 g9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.E = eVar;
        hVar.F = j10;
        hVar.G = user.id;
        int i10 = hVar.b;
        TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
        hVar.f.setText(o5.l(d20.s0, j10));
        hVar.h.setText(i0.P2(cd.a0(null, null, Z1 != null ? 2131751898 : w3.V(L0) ? 2131751897 : 2131751896, o5.u(user)), t6.Wl, null, new r5.a(19), false));
        if (Z1 != null) {
            textView2.setVisibility(8);
        } else if (L0 == null || L0.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.s, 0, 1, 33);
            long j11 = L0.participants_count;
            spannableStringBuilder.append((CharSequence) (j11 < 1000000 ? cd.E(j11, ',') : i0.o0((int) j11, 1000000)));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.y = z12;
        if (Z1 != null) {
            g9Var.e(Z1, new r8(0, Z1));
        } else {
            g9Var.e(L0, new r8(L0));
        }
        hVar.e.e(user, new r8(0, user));
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        h hVar = new h(i10, context, p6Var);
        hVar.setLayoutParams(new o0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        f fVar = (f) a51Var.G;
        f fVar2 = (f) a51Var2.G;
        return fVar.a == fVar2.a && o5.d(fVar.b) == o5.d(fVar2.b);
    }
}
