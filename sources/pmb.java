// default package

import android.content.Context;
import java.util.HashSet;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pmb extends b01 implements vlb {
    public int e;
    public final /* synthetic */ d0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmb(d0 d0Var, Context context) {
        super(context);
        this.f = d0Var;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Lj));
    }

    @Override // vlb
    public final void updateColors() {
        a01 a01Var = this.d;
        if (a01Var != null) {
            try {
                int w0 = cmb.w0(null, cmb.Lj, false);
                if (w0 != this.e) {
                    this.e = w0;
                    a01Var.setOuterColor(w0);
                    a01Var.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
