// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class yb9 implements pib {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ac9 d;

    public yb9(ac9 ac9Var, Layout layout, int i, int i2) {
        this.d = ac9Var;
        this.a = layout;
        this.b = i;
        this.c = i2;
    }

    @Override // pib, jg7
    public final Layout a() {
        return this.a;
    }

    @Override // pib
    public final Rect c() {
        return null;
    }

    @Override // pib
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // pib
    public final int getRow() {
        return 0;
    }

    @Override // pib
    public final CharSequence getText() {
        lk0 lk0Var = this.d.f;
        if (lk0Var == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = lk0Var.b;
        return pageBlock instanceof TL_iv.pageBlockDetails ? yi9.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true) : "";
    }

    @Override // pib
    public final int getX() {
        return this.b;
    }

    @Override // pib
    public final int getY() {
        return this.c;
    }
}
