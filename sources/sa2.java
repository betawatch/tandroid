// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sa2 implements ln5 {
    public boolean a;
    public final /* synthetic */ y41 b;
    public final /* synthetic */ a51 c;

    public sa2(a51 a51Var, y41 y41Var) {
        this.c = a51Var;
        this.b = y41Var;
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
        p09 p09Var;
        dl0 dl0Var;
        if (this.a) {
            return;
        }
        if ((i == 0 || i == 3) && drawable != null) {
            this.a = true;
            boolean z = drawable instanceof p09;
            y41 y41Var = this.b;
            if (z && (dl0Var = (p09Var = (p09) drawable).C0) != null && dl0Var.g()) {
                p09Var.B0 = new ra2(this, y41Var, (byte) 0);
            } else {
                this.c.d();
                y41Var.run();
            }
        }
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
