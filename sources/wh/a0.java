package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.x9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a0 implements x9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public a0(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
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
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.x9
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.x9
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int getY() {
        return 0;
    }
}
