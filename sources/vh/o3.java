package vh;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o3 {
    public final a a;
    public final int b;
    public final /* synthetic */ r3 c;

    public o3(r3 r3Var, a aVar, int i10) {
        this.c = r3Var;
        this.a = aVar;
        this.b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !e4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i10 = this.b;
        boolean z4 = i10 >= 0 && i10 < d.buttons.size();
        if (z4 || d.buttons.size() < 8) {
            r3 r3Var = this.c;
            c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.d();
            }
            TL_keyboard.PageButton pageButton = z4 ? d.buttons.get(i10) : new TL_keyboard.PageButton();
            pageButton.text = x5.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z4) {
                d.buttons.add(pageButton);
            }
            r3Var.V2.N(false);
            c2 c2Var2 = r3Var.G3;
            if (c2Var2 != null) {
                c2Var2.h();
            }
            r3Var.e3.onContentChanged();
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i10 = this.b) < 0 || i10 >= d.buttons.size()) {
            return;
        }
        r3 r3Var = this.c;
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        d.buttons.remove(i10);
        r3Var.V2.N(false);
        c2 c2Var2 = r3Var.G3;
        if (c2Var2 != null) {
            c2Var2.h();
        }
        r3Var.e3.onContentChanged();
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
