package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class r81 implements Utilities.Callback5, Utilities.Callback5Return, li.i, r0.n, li.j {
    public final /* synthetic */ a91 a;

    public /* synthetic */ r81(a91 a91Var) {
        this.a = a91Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        a91 a91Var = this.a;
        a91Var.R = i10;
        li.a.c(a91Var.c, defaultWindowInsets.b, i10, AndroidUtilities.dp(12.0f), a91Var.S);
        return r0.l1.b;
    }

    @Override // li.j
    public int f() {
        a91 a91Var = this.a;
        a91Var.getClass();
        return a91Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7);
    }

    @Override // li.i
    public void k(int i10) {
        a91.U(this.a, i10);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(a91.S(this.a, (org.telegram.ui.Components.g61) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        a91.g0(this.a, (org.telegram.ui.Components.g61) obj);
    }
}
