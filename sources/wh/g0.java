package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g0 implements x9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ i0 d;

    public g0(i0 i0Var, Layout layout, int i10, int i11) {
        this.d = i0Var;
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
        a G = this.d.c.G();
        return (G == null || (pageBlock = G.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : x5.r(richText, null, true);
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
