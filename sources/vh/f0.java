package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class f0 implements x9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ h0 d;

    public f0(h0 h0Var, Layout layout, int i10, int i11) {
        this.d = h0Var;
        this.a = layout;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.ui.Cells.x9
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.x9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.x9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.x9
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a E = this.d.c.E();
        return (E == null || (pageBlock = E.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : x5.r(richText, null, true);
    }

    @Override // org.telegram.ui.Cells.x9
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int getY() {
        return this.c;
    }
}
