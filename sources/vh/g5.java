package vh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g5 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new g5());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        i5 i5Var = (i5) view;
        a aVar = (a) i51Var.G;
        y2 y2Var = (y2) i51Var.H;
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
            k5Var.setSelectionProvider(new rh.e(linkedHashSet, 16));
            i5Var.y();
            d1 d1Var = i5Var.r;
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
                    d1Var.setAutoBold(i5Var.a.r);
                    if (z11 || !String.valueOf(d1Var.getText()).equals(l10)) {
                        d1Var.setTextSilently(Emoji.replaceEmoji(r10, d1Var.getPaint().getFontMetricsInt(), false));
                        d1Var.invalidateEffects();
                    }
                }
            }
            i5Var.e();
            i5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        i5 i5Var = new i5(context, f6Var);
        i5Var.setBackground(new v1(j6.v0(j6.d6, f6Var)));
        return i5Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
