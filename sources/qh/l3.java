package qh;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l3 {
    public final a a;
    public final int b;
    public final /* synthetic */ o3 c;

    public l3(o3 o3Var, a aVar, int i9) {
        this.c = o3Var;
        this.a = aVar;
        this.b = i9;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !b4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i9 = this.b;
        boolean z10 = i9 >= 0 && i9 < d.buttons.size();
        if (z10 || d.buttons.size() < 8) {
            o3 o3Var = this.c;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? d.buttons.get(i9) : new TL_keyboard.PageButton();
            pageButton.text = u5.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                d.buttons.add(pageButton);
            }
            o3Var.U2.N(false);
            b2 b2Var2 = o3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            o3Var.d3.onContentChanged();
        }
    }

    public final void b() {
        int i9;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i9 = this.b) < 0 || i9 >= d.buttons.size()) {
            return;
        }
        o3 o3Var = this.c;
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        d.buttons.remove(i9);
        o3Var.U2.N(false);
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        o3Var.d3.onContentChanged();
    }

    public final boolean c() {
        int i9;
        TL_iv.pageBlockButtonRow d = d();
        return d != null && (i9 = this.b) >= 0 && i9 < d.buttons.size();
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
