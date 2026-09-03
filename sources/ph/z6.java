package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qp;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class z6 extends qp {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ z6(float f10, float f11, int i10) {
        super(f10, f11, i10);
    }

    @Override // org.telegram.ui.Components.qp, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.qp, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ z6(int i10) {
        super(i10);
    }
}
