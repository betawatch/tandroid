package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rp;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class a7 extends rp {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ a7(float f10, float f11, int i10) {
        super(f10, f11, i10);
    }

    @Override // org.telegram.ui.Components.rp, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.rp, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ a7(int i10) {
        super(i10);
    }
}
