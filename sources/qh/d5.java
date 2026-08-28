package qh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d5 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new d5());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        f5 f5Var = (f5) view;
        a aVar = (a) l41Var.G;
        v2 v2Var = (v2) l41Var.H;
        h5 h5Var = f5Var.v;
        boolean z11 = true;
        boolean z12 = f5Var.a != aVar;
        f5Var.a = aVar;
        f5Var.A = v2Var;
        f5Var.y = LocaleController.isRTL;
        f5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            w5 w5Var = new w5((TL_iv.pageBlockTable) pageBlock);
            f5Var.B = w5Var;
            h5Var.setModel(w5Var);
            LinkedHashSet linkedHashSet = f5Var.D;
            Objects.requireNonNull(linkedHashSet);
            h5Var.setSelectionProvider(new kh.p(linkedHashSet, 28));
            f5Var.y();
            d1 d1Var = f5Var.r;
            a aVar2 = f5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l10 = u5.l(pageblocktable.title);
                    SpannableStringBuilder r10 = u5.r(pageblocktable.title, null, true);
                    a aVar3 = f5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (u5.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    d1Var.setAutoBold(f5Var.a.r);
                    if (z12 || !String.valueOf(d1Var.getText()).equals(l10)) {
                        d1Var.setTextSilently(Emoji.replaceEmoji(r10, d1Var.getPaint().getFontMetricsInt(), false));
                        d1Var.invalidateEffects();
                    }
                }
            }
            f5Var.d();
            f5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        f5 f5Var = new f5(context, b6Var);
        f5Var.setBackground(new u1(f6.v0(f6.d6, b6Var)));
        return f5Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean isClickable() {
        return false;
    }
}
