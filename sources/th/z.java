package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.v9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class z implements v9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public z(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
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
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.v9
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.v9
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int getY() {
        return 0;
    }
}
