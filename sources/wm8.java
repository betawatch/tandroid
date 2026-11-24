// default package

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wm8 extends Paint {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm8(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.setAlpha(i);
                ((ProfileActivity) obj).fragmentView.invalidate();
                break;
            default:
                super.setAlpha(i);
                wk9 wk9Var = (wk9) obj;
                wk9Var.a.setAlpha(Math.round(i * 0.2f));
                wk9Var.invalidate();
                break;
        }
    }
}
