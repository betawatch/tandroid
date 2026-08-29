package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.v9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v4 implements v9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ v4(Layout layout, int i10, int i11, int i12) {
        this.a = i12;
        this.b = layout;
        this.c = i10;
        this.d = i11;
    }

    @Override // org.telegram.ui.Cells.v9
    public final Layout getLayout() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.Cells.v9
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Cells.v9
    public final /* synthetic */ Rect getSelectionBounds() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.v9
    public final CharSequence getText() {
        switch (this.a) {
        }
        return this.b.getText();
    }

    @Override // org.telegram.ui.Cells.v9
    public final int getX() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int getY() {
        switch (this.a) {
        }
        return this.d;
    }
}
