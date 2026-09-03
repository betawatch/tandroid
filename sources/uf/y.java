package uf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.ej;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y extends f2.j0 {
    public final /* synthetic */ ej r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ej ejVar, Context context) {
        super(context);
        this.r = ejVar;
    }

    @Override // f2.j0
    public final int k(int i10, View view) {
        return y3.z(8.0f, ((c0) this.r.V).s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override // f2.j0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
