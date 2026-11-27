// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class sl9 implements kmb {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xl9 d;

    public sl9(xl9 xl9Var, Layout layout, int i, int i2) {
        this.d = xl9Var;
        this.a = layout;
        this.b = i;
        this.c = i2;
    }

    @Override // kmb
    public final Layout a() {
        return this.a;
    }

    @Override // kmb
    public final Rect c() {
        return null;
    }

    @Override // kmb
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // kmb
    public final int getRow() {
        return 0;
    }

    @Override // kmb
    public final CharSequence getText() {
        TL_iv.RichText richText;
        mk0 mk0Var = this.d.a;
        if (mk0Var == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = mk0Var.b;
        return (!(pageBlock instanceof TL_iv.pageBlockTable) || (richText = ((TL_iv.pageBlockTable) pageBlock).title) == null) ? "" : mm9.r(richText, null, true);
    }

    @Override // kmb
    public final int getX() {
        return this.b;
    }

    @Override // kmb
    public final int getY() {
        return this.c;
    }
}
