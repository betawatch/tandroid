package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.y9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z implements y9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public z(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
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
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.y9
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getY() {
        return 0;
    }
}
