package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.w9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class p0 implements w9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ r0 d;

    public p0(r0 r0Var, Layout layout, int i10, int i11) {
        this.d = r0Var;
        this.a = layout;
        this.b = i10;
        this.c = i11;
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
        return 0;
    }

    @Override // org.telegram.ui.Cells.w9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence getText() {
        a aVar = this.d.f;
        if (aVar == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        return pageBlock instanceof TL_iv.pageBlockDetails ? y5.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true) : "";
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
