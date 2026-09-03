package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.w9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class y4 implements w9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ y4(Layout layout, int i10, int i11, int i12) {
        this.a = i12;
        this.b = layout;
        this.c = i10;
        this.d = i11;
    }

    @Override // org.telegram.ui.Cells.w9
    public final Layout getLayout() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.Cells.w9
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.w9
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

    @Override // org.telegram.ui.Cells.w9
    public final /* synthetic */ Rect getSelectionBounds() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence getText() {
        switch (this.a) {
        }
        return this.b.getText();
    }

    @Override // org.telegram.ui.Cells.w9
    public final int getX() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int getY() {
        switch (this.a) {
        }
        return this.d;
    }
}
