package th;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class m3 {
    public final a a;
    public final int b;
    public final /* synthetic */ p3 c;

    public m3(p3 p3Var, a aVar, int i10) {
        this.c = p3Var;
        this.a = aVar;
        this.b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !c4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i10 = this.b;
        boolean z10 = i10 >= 0 && i10 < d.buttons.size();
        if (z10 || d.buttons.size() < 8) {
            p3 p3Var = this.c;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? d.buttons.get(i10) : new TL_keyboard.PageButton();
            pageButton.text = v5.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                d.buttons.add(pageButton);
            }
            p3Var.U2.N(false);
            b2 b2Var2 = p3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            p3Var.d3.onContentChanged();
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i10 = this.b) < 0 || i10 >= d.buttons.size()) {
            return;
        }
        p3 p3Var = this.c;
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        d.buttons.remove(i10);
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.d3.onContentChanged();
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        return d != null && (i10 = this.b) >= 0 && i10 < d.buttons.size();
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.a;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            return (TL_iv.pageBlockButtonRow) pageBlock;
        }
        return null;
    }
}
