package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b5 implements y9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public b5(Layout layout, int i9, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.e = pagetablecell;
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
        return this.d;
    }

    @Override // org.telegram.ui.Cells.y9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.y9
    public final CharSequence getText() {
        return w5.h(this.e);
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
