package sg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class z1 extends yq {
    public final /* synthetic */ a2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = a2Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        a2 a2Var = this.y;
        if (a2Var.d) {
            super.setBounds(i10, (int) (i11 - a2Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + a2Var.M));
        }
    }
}
