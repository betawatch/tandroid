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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class st0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public final int E;
    public org.telegram.ui.Components.ck0 a;
    public v4.c0 b;
    public rt0 c;
    public org.telegram.ui.Components.ty d;
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
        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(this, view);
        I.X(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false)));
        int i7 = this.E;
        I.l(0, org.telegram.messenger.gd.M0(2131743674, null), new tr0(5, this, l10), i7 == 1);
        boolean z10 = i7 != 1;
        I.m(i7 == 0 ? R.drawable.msg_user_remove : 0, new qt0(this, l10), org.telegram.messenger.gd.M0(2131746126, null), z10, true);
        I.V = org.telegram.messenger.ks.U2;
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = this.E;
        if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131753679, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131750718, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131748098, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.d = tyVar;
        if (i7 == 1) {
            tyVar.setText(org.telegram.messenger.gd.M0(2131748047, null));
        } else {
            tyVar.setText(org.telegram.messenger.gd.M0(2131748031, null));
        }
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.a = ck0Var;
        ck0Var.r1();
        this.a.setItemSelectorColorProvider(new pt0(this));
        this.a.setSectionsDrawBackground(true);
        this.a.setEmptyView(this.d);
        org.telegram.ui.Components.ck0 ck0Var2 = this.a;
        v4.c0 c0Var = new v4.c0(1, false);
        this.b = c0Var;
        ck0Var2.setLayoutManager(c0Var);
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ck0 ck0Var3 = this.a;
        rt0 rt0Var = new rt0(this, context);
        this.c = rt0Var;
        ck0Var3.setAdapter(rt0Var);
        this.a.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.ck0 ck0Var;
        if (i7 != org.telegram.messenger.ks.r) {
            if (i7 == org.telegram.messenger.ks.g0) {
                this.d.c();
                a0();
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i11 = org.telegram.messenger.mp.I8;
        if (((intValue & 2) == 0 && (intValue & 1) == 0) || (ck0Var = this.a) == null) {
            return;
        }
        int childCount = ck0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.a.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.b5) {
                ((org.telegram.ui.Cells.b5) childAt).d(intValue);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.o4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.r);
        if (this.E == 1) {
            org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.g0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.r);
        if (this.E == 1) {
            org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.g0);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        rt0 rt0Var = this.c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.ty tyVar = this.d;
            if (tyVar != null) {
                tyVar.setProgressBarColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h6, false));
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

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
