package rh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class e5 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new e5());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        g5 g5Var = (g5) view;
        a aVar = (a) n41Var.G;
        w2 w2Var = (w2) n41Var.H;
        i5 i5Var = g5Var.v;
        boolean z11 = true;
        boolean z12 = g5Var.a != aVar;
        g5Var.a = aVar;
        g5Var.A = w2Var;
        g5Var.y = LocaleController.isRTL;
        g5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            x5 x5Var = new x5((TL_iv.pageBlockTable) pageBlock);
            g5Var.B = x5Var;
            i5Var.setModel(x5Var);
            LinkedHashSet linkedHashSet = g5Var.D;
            Objects.requireNonNull(linkedHashSet);
            i5Var.setSelectionProvider(new lh.p(linkedHashSet, 28));
            g5Var.y();
            d1 d1Var = g5Var.r;
            a aVar2 = g5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l10 = v5.l(pageblocktable.title);
                    SpannableStringBuilder r10 = v5.r(pageblocktable.title, null, true);
                    a aVar3 = g5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (v5.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    d1Var.setAutoBold(g5Var.a.r);
                    if (z12 || !String.valueOf(d1Var.getText()).equals(l10)) {
                        d1Var.setTextSilently(Emoji.replaceEmoji(r10, d1Var.getPaint().getFontMetricsInt(), false));
                        d1Var.invalidateEffects();
                    }
                }
            }
            g5Var.d();
            g5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        g5 g5Var = new g5(context, c6Var);
        g5Var.setBackground(new u1(g6.v0(g6.d6, c6Var)));
        return g5Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean isClickable() {
        return false;
    }
}
