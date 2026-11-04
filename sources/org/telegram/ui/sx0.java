package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sx0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public org.telegram.ui.Components.tj0 a;
    public ox0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public za.p h;
    public qx0 n;

    public sx0() {
        super(null);
        this.d = -1;
    }

    public static void Z(sx0 sx0Var, View view) {
        int i3;
        int i10;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.n && !sx0Var.getUserConfig().q()) {
                sx0Var.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) sx0Var, 4, true));
                return;
            } else {
                org.telegram.messenger.li.b0(sx0Var.currentAccount).a2(xVar.f.reaction);
                sx0Var.a.getAdapter().k(0, sx0Var.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof rx0) {
            rx0 rx0Var = (rx0) view;
            if (sx0Var.n != null) {
                return;
            }
            x01[] x01VarArr = new x01[1];
            org.telegram.ui.Components.e5 e5Var = rx0Var.a;
            if (e5Var != null) {
                e5Var.f();
                rx0Var.b();
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(e5Var.getBounds());
                i10 = (-(rx0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                float L = org.telegram.messenger.g0.L(324.0f);
                i3 = rect.centerX() - ((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
            } else {
                i3 = 0;
                i10 = 0;
            }
            px0 px0Var = new px0(sx0Var, sx0Var, sx0Var.getParentActivity(), Integer.valueOf(i3), rx0Var, x01VarArr);
            String Q = sx0Var.getMediaDataController().Q();
            if (Q != null && Q.startsWith("animated_")) {
                try {
                    px0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = sx0Var.getMediaDataController().h;
            ArrayList arrayList2 = new ArrayList(20);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                dh.n0 n0Var = new dh.n0();
                n0Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                arrayList2.add(n0Var);
            }
            px0Var.setRecentReactions(arrayList2);
            px0Var.setSaveState(3);
            px0Var.y(e5Var, rx0Var);
            qx0 qx0Var = new qx0(sx0Var, px0Var);
            sx0Var.n = qx0Var;
            x01VarArr[0] = qx0Var;
            qx0Var.showAsDropDown(rx0Var, 0, i10, 53);
            x01VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746395, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.a = tj0Var;
        tj0Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((u4.k) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.a;
        ox0 ox0Var = new ox0(this, context);
        this.b = ox0Var;
        tj0Var2.setAdapter(ox0Var);
        this.a.setOnItemClickListener(new nx0(this, 0));
        frameLayout.addView(this.a, b8.mf.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        h0();
        return frameLayout;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i3 == org.telegram.messenger.hs.V4) {
            this.b.f();
        } else if (i3 == org.telegram.messenger.hs.f5) {
            h0();
            this.b.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(20, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.z6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.f6, org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    public final void h0() {
        this.f = 2;
        this.c = 1;
        if (!org.telegram.messenger.h10.i(this.currentAccount).q()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i3 = this.f;
            this.f = i3 + 1;
            this.e = i3;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        za.p pVar = this.h;
        if (pVar != null) {
            pVar.a();
            this.h = null;
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        za.p pVar2 = new za.p(notificationCenter, this);
        pVar2.b(org.telegram.messenger.hs.V4);
        pVar2.b(org.telegram.messenger.hs.f5);
        this.h = pVar2;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        za.p pVar = this.h;
        if (pVar != null) {
            pVar.a();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
