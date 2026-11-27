// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rv3 implements on5 {
    public final /* synthetic */ sv3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r47 c;
    public final /* synthetic */ tv3 d;

    public rv3(tv3 tv3Var, sv3 sv3Var, boolean z, r47 r47Var) {
        this.d = tv3Var;
        this.a = sv3Var;
        this.b = z;
        this.c = r47Var;
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
        r47 r47Var;
        if (this.b && (r47Var = this.c) != null && r47Var.F2() && imageReceiver.y() != null && imageReceiver.y().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.y() != null) {
            imageReceiver2.y().I(0, false, true);
        }
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }
}
