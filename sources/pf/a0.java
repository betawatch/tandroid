package pf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dj;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a0 extends f2.n0 {
    public final /* synthetic */ dj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(dj djVar, Context context) {
        super(context);
        this.r = djVar;
    }

    @Override // f2.n0
    public final int k(int i9, View view) {
        return org.telegram.messenger.l0.A(8.0f, ((e0) this.r.V).s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i9, view));
    }

    @Override // f2.n0
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
