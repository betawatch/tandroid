package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.w9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f5 implements w9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public f5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override // org.telegram.ui.Cells.w9
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.w9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int getRow() {
        return this.d;
    }

    @Override // org.telegram.ui.Cells.w9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence getText() {
        return a6.h(this.e);
    }

    @Override // org.telegram.ui.Cells.w9
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int getY() {
        return this.c;
    }
}
