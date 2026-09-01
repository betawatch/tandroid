package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class y6 extends tp {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ y6(float f10, float f11, int i10) {
        super(f10, f11, i10);
    }

    @Override // org.telegram.ui.Components.tp, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.tp, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ y6(int i10) {
        super(i10);
    }
}
