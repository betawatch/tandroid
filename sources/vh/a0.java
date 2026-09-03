package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.w9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a0 implements w9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public a0(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
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
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.w9
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int getY() {
        return 0;
    }
}
