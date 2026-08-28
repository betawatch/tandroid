package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.y9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u4 implements y9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ u4(Layout layout, int i9, int i10, int i11) {
        this.a = i11;
        this.b = layout;
        this.c = i9;
        this.d = i10;
    }

    @Override // org.telegram.ui.Cells.y9
    public final Layout getLayout() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.Cells.y9
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.y9
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

    @Override // org.telegram.ui.Cells.y9
    public final /* synthetic */ Rect getSelectionBounds() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.y9
    public final CharSequence getText() {
        switch (this.a) {
        }
        return this.b.getText();
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getX() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getY() {
        switch (this.a) {
        }
        return this.d;
    }
}
