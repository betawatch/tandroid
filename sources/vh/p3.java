package vh;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class p3 {
    public final a a;
    public final int b;
    public final /* synthetic */ s3 c;

    public p3(s3 s3Var, a aVar, int i10) {
        this.c = s3Var;
        this.a = aVar;
        this.b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !f4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i10 = this.b;
        boolean z4 = i10 >= 0 && i10 < d.buttons.size();
        if (z4 || d.buttons.size() < 8) {
            s3 s3Var = this.c;
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            TL_keyboard.PageButton pageButton = z4 ? d.buttons.get(i10) : new TL_keyboard.PageButton();
            pageButton.text = y5.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z4) {
                d.buttons.add(pageButton);
            }
            s3Var.V2.N(false);
            d2 d2Var2 = s3Var.G3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            s3Var.e3.onContentChanged();
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i10 = this.b) < 0 || i10 >= d.buttons.size()) {
            return;
        }
        s3 s3Var = this.c;
        d2 d2Var = s3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        d.buttons.remove(i10);
        s3Var.V2.N(false);
        d2 d2Var2 = s3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        s3Var.e3.onContentChanged();
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
