package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class zl0 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.w70 a;
    public final org.telegram.ui.Components.w70 b;
    public final /* synthetic */ bm0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(bm0 bm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.c = bm0Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        hm0 hm0Var = bm0Var.p0;
        org.telegram.ui.ActionBar.r6.i(i7, this, hm0Var.getResourceProvider());
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
        l9Var.setImageDrawable(new org.telegram.ui.Components.zg0(R.raw.utyan_draw, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(l9Var, c8.ha.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        f6Var = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
        org.telegram.ui.Components.w70 a10 = c8.qa.a(context2, 14.0f, i10, false, f6Var);
        this.a = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.id.M0(bm0Var.m0 == 0 ? 2131750084 : 2131750083, null));
        addView(a10, c8.ha.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.k6.Uc;
        f6Var2 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
        org.telegram.ui.Components.w70 a11 = c8.qa.a(context3, 14.0f, i11, false, f6Var2);
        this.b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750085, null), new ef0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a11, c8.ha.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        hm0 hm0Var = this.c.p0;
        setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.a.setTextColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.y6));
        int i7 = org.telegram.ui.ActionBar.k6.Uc;
        int themedColor = hm0Var.getThemedColor(i7);
        org.telegram.ui.Components.w70 w70Var = this.b;
        w70Var.setTextColor(themedColor);
        w70Var.setLinkTextColor(hm0Var.getThemedColor(i7));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
