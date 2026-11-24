// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ve9 {
    public final lk0 a;
    public final int b;
    public final /* synthetic */ ye9 c;

    public ve9(ye9 ye9Var, lk0 lk0Var, int i) {
        this.c = ye9Var;
        this.a = lk0Var;
        this.b = i;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !mf9.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i = this.b;
        boolean z = i >= 0 && i < d.buttons.size();
        if (z || d.buttons.size() < 8) {
            ye9 ye9Var = this.c;
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            TL_keyboard.PageButton pageButton = z ? d.buttons.get(i) : new TL_keyboard.PageButton();
            pageButton.text = yi9.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z) {
                d.buttons.add(pageButton);
            }
            ye9Var.g3.O(false);
            ld9 ld9Var2 = ye9Var.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            ye9Var.p3.onContentChanged();
        }
    }

    public final void b() {
        int i;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i = this.b) < 0 || i >= d.buttons.size()) {
            return;
        }
        ye9 ye9Var = this.c;
        ld9 ld9Var = ye9Var.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        d.buttons.remove(i);
        ye9Var.g3.O(false);
        ld9 ld9Var2 = ye9Var.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        ye9Var.p3.onContentChanged();
    }

    public final boolean c() {
        int i;
        TL_iv.pageBlockButtonRow d = d();
        return d != null && (i = this.b) >= 0 && i < d.buttons.size();
    }

    public final TL_iv.pageBlockButtonRow d() {
        lk0 lk0Var = this.a;
        if (lk0Var == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            return (TL_iv.pageBlockButtonRow) pageBlock;
        }
        return null;
    }
}
