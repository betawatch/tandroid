package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class st0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public final int E;
    public org.telegram.ui.Components.ek0 a;
    public v4.c0 b;
    public rt0 c;
    public org.telegram.ui.Components.vy d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public final boolean y;

    public st0() {
        super(null);
        this.E = 1;
        this.y = true;
    }

    public final void Z(Long l10, View view) {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view);
        I.X(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false)));
        int i7 = this.E;
        I.l(0, org.telegram.messenger.hd.N0(2131743666, null), new tr0(7, this, l10), i7 == 1);
        boolean z10 = i7 != 1;
        I.m(i7 == 0 ? R.drawable.msg_user_remove : 0, new qt0(this, l10), org.telegram.messenger.hd.N0(2131746125, null), z10, true);
        I.V = org.telegram.messenger.ls.U2;
        I.a0();
    }

    public final void a0() {
        this.e = 0;
        this.f = -1;
        this.n = -1;
        this.h = -1;
        this.x = -1;
        if (!this.y || getMessagesController().I0 >= 0) {
            int i7 = this.e;
            int i10 = i7 + 1;
            this.e = i10;
            this.f = i7;
            int i11 = this.E;
            if (i11 == 1) {
                this.e = i7 + 2;
                this.h = i10;
            }
            if (i11 != 1) {
                throw null;
            }
            int size = getMessagesController().H0.size();
            if (size != 0) {
                if (i11 == 1) {
                    int i12 = this.e;
                    this.e = i12 + 1;
                    this.n = i12;
                }
                int i13 = this.e;
                this.r = i13;
                int i14 = i13 + size;
                this.s = i14;
                int i15 = i14 + 1;
                this.e = i15;
                this.w = i14;
                if (i11 != 1) {
                    this.e = i14 + 2;
                    this.x = i15;
                }
            } else {
                this.n = -1;
                this.r = -1;
                this.s = -1;
                this.w = -1;
                this.x = -1;
            }
        }
        rt0 rt0Var = this.c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = this.E;
        if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131753678, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131750717, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748097, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.d = vyVar;
        if (i7 == 1) {
            vyVar.setText(org.telegram.messenger.hd.N0(2131748046, null));
        } else {
            vyVar.setText(org.telegram.messenger.hd.N0(2131748030, null));
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.a = ek0Var;
        ek0Var.r1();
        this.a.setItemSelectorColorProvider(new pt0(this));
        this.a.setSectionsDrawBackground(true);
        this.a.setEmptyView(this.d);
        org.telegram.ui.Components.ek0 ek0Var2 = this.a;
        v4.c0 c0Var = new v4.c0(1, false);
        this.b = c0Var;
        ek0Var2.setLayoutManager(c0Var);
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.a;
        rt0 rt0Var = new rt0(this, context);
        this.c = rt0Var;
        ek0Var3.setAdapter(rt0Var);
        this.a.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        frameLayout.addView(this.a, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        int i10 = 27;
        this.a.setOnItemClickListener(new h(this, i10));
        this.a.setOnItemLongClickListener(new pt0(this));
        if (i7 == 1) {
            this.a.setOnScrollListener(new g3(this, i10));
            if (getMessagesController().I0 < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        a0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.ek0 ek0Var;
        if (i7 != org.telegram.messenger.ls.r) {
            if (i7 == org.telegram.messenger.ls.g0) {
                this.d.c();
                a0();
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i11 = org.telegram.messenger.np.I8;
        if (((intValue & 2) == 0 && (intValue & 1) == 0) || (ek0Var = this.a) == null) {
            return;
        }
        int childCount = ek0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.a.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.b5) {
                ((org.telegram.ui.Cells.b5) childAt).d(intValue);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.o4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.r);
        if (this.E == 1) {
            org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.g0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.r);
        if (this.E == 1) {
            org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.g0);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        rt0 rt0Var = this.c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.vy vyVar = this.d;
            if (vyVar != null) {
                vyVar.setProgressBarColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
