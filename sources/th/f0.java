package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.v9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f0 implements v9 {
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

    @Override // org.telegram.ui.Cells.v9
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.v9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.v9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.v9
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a G = this.d.c.G();
        return (G == null || (pageBlock = G.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : v5.r(richText, null, true);
    }

    @Override // org.telegram.ui.Cells.v9
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int getY() {
        return this.c;
    }
}
