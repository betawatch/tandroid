package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g5 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new g5());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        i5 i5Var = (i5) view;
        a aVar = (a) h51Var.G;
        y2 y2Var = (y2) h51Var.H;
        k5 k5Var = i5Var.v;
        boolean z10 = true;
        boolean z11 = i5Var.a != aVar;
        i5Var.a = aVar;
        i5Var.B = y2Var;
        i5Var.y = LocaleController.isRTL;
        i5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            z5 z5Var = new z5((TL_iv.pageBlockTable) pageBlock);
            i5Var.C = z5Var;
            k5Var.setModel(z5Var);
            LinkedHashSet linkedHashSet = i5Var.E;
            Objects.requireNonNull(linkedHashSet);
            k5Var.setSelectionProvider(new sf.h(linkedHashSet, 20));
            i5Var.y();
            e1 e1Var = i5Var.r;
            a aVar2 = i5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l10 = x5.l(pageblocktable.title);
                    SpannableStringBuilder r10 = x5.r(pageblocktable.title, null, true);
                    a aVar3 = i5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (x5.q(0, r10.length(), r10) & 1) == 0) {
                            z10 = false;
                        }
                        aVar3.r = z10;
                    }
                    e1Var.setAutoBold(i5Var.a.r);
                    if (z11 || !String.valueOf(e1Var.getText()).equals(l10)) {
                        e1Var.setTextSilently(Emoji.replaceEmoji(r10, e1Var.getPaint().getFontMetricsInt(), false));
                        e1Var.invalidateEffects();
                    }
                }
            }
            i5Var.e();
            i5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        i5 i5Var = new i5(context, g6Var);
        i5Var.setBackground(new w1(k6.v0(k6.d6, g6Var)));
        return i5Var;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
