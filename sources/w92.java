// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class w92 implements on5 {
    public boolean a;
    public final /* synthetic */ z31 b;
    public final /* synthetic */ b41 c;

    public w92(b41 b41Var, z31 z31Var) {
        this.c = b41Var;
        this.b = z31Var;
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
        b29 b29Var;
        ek0 ek0Var;
        if (this.a) {
            return;
        }
        if ((i == 0 || i == 3) && drawable != null) {
            this.a = true;
            boolean z = drawable instanceof b29;
            z31 z31Var = this.b;
            if (z && (ek0Var = (b29Var = (b29) drawable).C0) != null && ek0Var.g()) {
                b29Var.B0 = new dy1(this, z31Var, (byte) 28);
            } else {
                this.c.d();
                z31Var.run();
            }
        }
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
