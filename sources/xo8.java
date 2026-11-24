// default package

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xo8 extends Paint {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xo8(Object obj, byte b) {
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
                xm9 xm9Var = (xm9) obj;
                xm9Var.a.setAlpha(Math.round(i * 0.2f));
                xm9Var.invalidate();
                break;
        }
    }
}
