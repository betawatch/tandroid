package sf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.gj;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z extends f2.k0 {
    public final /* synthetic */ gj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gj gjVar, Context context) {
        super(context);
        this.r = gjVar;
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        return x3.z(8.0f, ((d0) this.r.V).s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
