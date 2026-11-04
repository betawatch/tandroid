package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y50 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.s70 U;
    public final org.telegram.ui.ActionBar.y0 V;
    public final org.telegram.ui.ActionBar.y0 W;
    public final org.telegram.ui.ActionBar.y0 a0;
    public final ArrayList b0;
    public final x50 c0;
    public int d0;
    public final org.telegram.messenger.u2 e0;
    public v50 f0;
    public ArrayList g0;
    public final org.telegram.ui.ActionBar.d2 h0;
    public final FrameLayout i0;

    public y50(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = d2Var;
        this.e0 = d2Var.getMessagesController().r7;
        setFitItems(true);
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1d, org.telegram.messenger.bd.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_2d, org.telegram.messenger.bd.G(2, "Days", new Object[0]), false, null);
        this.a0 = c10;
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1w, org.telegram.messenger.bd.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1m, org.telegram.messenger.bd.G(1, "Months", new Object[0]), false, null);
        this.W = c12;
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_cancel, org.telegram.messenger.bd.M0(2131753851, null), false, null);
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751543, null), false, null);
        this.V = c14;
        int i3 = org.telegram.ui.ActionBar.k6.p7;
        c14.d(org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        arrayList.add(new w50(c2, 3));
        arrayList.add(new w50(c10, 6));
        arrayList.add(new w50(c11, 0));
        arrayList.add(new w50(c12, 1));
        arrayList.add(new w50(c13, 2));
        arrayList.add(new w50(c14, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.i0 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.a0(view, context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
        frameLayout.addView(view, b8.mf.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, b8.mf.o(-1, 8));
        x50 x50Var = new x50(this, context);
        this.c0 = x50Var;
        a(x50Var, b8.mf.o(-1, 48));
        x50Var.setOnClickListener(new org.telegram.ui.Components.ux0(25, (Object) this, (Object) d2Var));
        for (int i10 = 0; i10 < this.b0.size(); i10++) {
            ((w50) this.b0.get(i10)).a.setOnClickListener(new bi.q(this, ((w50) this.b0.get(i10)).b, 24));
        }
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null);
        this.U = s70Var;
        s70Var.setTag(R.id.fit_width_tag, 1);
        s70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        s70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.E8, null);
        s70Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, null);
        s70Var.setText(org.telegram.messenger.bd.M0(2131749065, null));
        a(s70Var, b8.mf.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.g0 != null) {
            this.c0.b.setTranslationX((3 - Math.min(3, this.g0.size())) * org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final void h(boolean z10) {
        this.d0 = -1;
        this.i0.setVisibility(0);
        this.V.setVisibility(z10 ? 8 : 0);
        this.U.setVisibility(0);
        this.c0.setVisibility(8);
    }

    public void setCallback(v50 v50Var) {
        this.f0 = v50Var;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.y0 y0Var = this.V;
            if (y0Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.p7;
                y0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
