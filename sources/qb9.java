// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class qb9 implements pib {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ sb9 d;

    public qb9(sb9 sb9Var, Layout layout, int i, int i2) {
        this.d = sb9Var;
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
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        lk0 I0 = this.d.c.I0();
        return (I0 == null || (pageBlock = I0.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : yi9.r(richText, null, true);
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
