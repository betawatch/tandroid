package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f0 implements y9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ h0 d;

    public f0(h0 h0Var, Layout layout, int i9, int i10) {
        this.d = h0Var;
        this.a = layout;
        this.b = i9;
        this.c = i10;
    }

    @Override // org.telegram.ui.Cells.y9
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.y9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.y9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.y9
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a I = this.d.c.I();
        return (I == null || (pageBlock = I.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : u5.r(richText, null, true);
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getY() {
        return this.c;
    }
}
