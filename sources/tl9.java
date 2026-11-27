// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class tl9 implements kmb {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public tl9(Layout layout, int i, int i2, int i3, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pagetablecell;
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
        return this.d;
    }

    @Override // kmb
    public final CharSequence getText() {
        return ajb.h(this.e);
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
