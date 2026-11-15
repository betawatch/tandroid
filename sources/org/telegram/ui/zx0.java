package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zx0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public org.telegram.ui.Components.uj0 a;
    public vx0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public xi.e h;
    public xx0 n;

    public zx0() {
        super(null);
        this.d = -1;
    }

    public static void Z(zx0 zx0Var, View view) {
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.n && !zx0Var.getUserConfig().q()) {
                zx0Var.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) zx0Var, 4, true));
                return;
            } else {
                org.telegram.messenger.si.b0(zx0Var.currentAccount).a2(xVar.f.reaction);
                zx0Var.a.getAdapter().k(0, zx0Var.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof yx0) {
            yx0 yx0Var = (yx0) view;
            if (zx0Var.n != null) {
                return;
            }
            e11[] e11VarArr = new e11[1];
            org.telegram.ui.Components.e5 e5Var = yx0Var.a;
            if (e5Var != null) {
                e5Var.f();
                yx0Var.b();
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(e5Var.getBounds());
                i10 = (-(yx0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                float L = org.telegram.messenger.g0.L(324.0f);
                i7 = rect.centerX() - ((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
            } else {
                i7 = 0;
                i10 = 0;
            }
            wx0 wx0Var = new wx0(zx0Var, zx0Var, zx0Var.getParentActivity(), Integer.valueOf(i7), yx0Var, e11VarArr);
            String Q = zx0Var.getMediaDataController().Q();
            if (Q != null && Q.startsWith("animated_")) {
                try {
                    wx0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = zx0Var.getMediaDataController().h;
            ArrayList arrayList2 = new ArrayList(20);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ch.p0 p0Var = new ch.p0();
                p0Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                arrayList2.add(p0Var);
            }
            wx0Var.setRecentReactions(arrayList2);
            wx0Var.setSaveState(3);
            wx0Var.y(e5Var, yx0Var);
            xx0 xx0Var = new xx0(zx0Var, wx0Var);
            zx0Var.n = xx0Var;
            e11VarArr[0] = xx0Var;
            xx0Var.showAsDropDown(yx0Var, 0, i10, 53);
            e11VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746387, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.a = uj0Var;
        uj0Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((v4.k) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.a;
        vx0 vx0Var = new vx0(this, context);
        this.b = vx0Var;
        uj0Var2.setAdapter(vx0Var);
        this.a.setOnItemClickListener(new ux0(this, 0));
        frameLayout.addView(this.a, c8.ja.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        h0();
        return frameLayout;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == org.telegram.messenger.ns.V4) {
            this.b.f();
        } else if (i7 == org.telegram.messenger.ns.f5) {
            h0();
            this.b.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        return c8.oa.a(new g6(20, this), org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.z6, org.telegram.ui.ActionBar.j6.i6, org.telegram.ui.ActionBar.j6.a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.p7, org.telegram.ui.ActionBar.j6.f6, org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    public final void h0() {
        this.f = 2;
        this.c = 1;
        if (!org.telegram.messenger.m10.i(this.currentAccount).q()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i7 = this.f;
            this.f = i7 + 1;
            this.e = i7;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        xi.e eVar = this.h;
        if (eVar != null) {
            eVar.b();
            this.h = null;
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ns.V4);
        eVar2.c(org.telegram.messenger.ns.f5);
        this.h = eVar2;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.h;
        if (eVar != null) {
            eVar.b();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
