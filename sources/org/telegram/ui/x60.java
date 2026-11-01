package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, View.OnClickListener, fe.e, hh.d {
    public final HashMap D;
    public final ArrayList E;
    public org.telegram.ui.Components.s20 F;
    public int G;
    public int H;
    public int I;
    public final fe.f a;
    public org.telegram.ui.Components.f10 b;
    public org.telegram.ui.ActionBar.p5 c;
    public v60 d;
    public ScrollView e;
    public w60 f;
    public org.telegram.ui.Components.uk0 h;
    public s4.a0 n;
    public org.telegram.ui.Components.ew0 r;
    public u60 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public x60() {
        super(null);
        this.a = new fe.f(3, this, org.telegram.ui.Components.gr.h, 350L, 0.0f);
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static void Z(x60 x60Var, View view, int i10) {
        org.telegram.ui.Cells.s4 s4Var;
        org.telegram.messenger.f5 contact;
        if (i10 == 0 && !x60Var.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s10 = org.telegram.messenger.i5.r(x60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s10);
                x60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s10), 500);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.s4) && (contact = (s4Var = (org.telegram.ui.Cells.s4) view).getContact()) != null) {
            org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) x60Var.D.get(contact.b);
            if (s20Var != null) {
                x60Var.f.a(s20Var);
            } else {
                org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(x60Var.getParentActivity(), null, contact, true, x60Var.resourceProvider);
                w60 w60Var = x60Var.f;
                ArrayList arrayList = w60Var.c;
                x60 x60Var2 = w60Var.f;
                x60Var2.E.add(s20Var2);
                x60Var2.D.put(s20Var2.getKey(), s20Var2);
                AnimatorSet animatorSet = w60Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    w60Var.a.cancel();
                }
                w60Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                w60Var.a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.voip.i2(w60Var, 13));
                w60Var.a.setInterpolator(org.telegram.ui.Components.gr.h);
                w60Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, (Property<org.telegram.ui.Components.s20, Float>) View.ALPHA, 0.0f, 1.0f));
                w60Var.addView(s20Var2);
                x60Var2.e.post(new yy(w60Var, 15));
                s20Var2.setOnClickListener(x60Var);
            }
            x60Var.b.e(!x60Var.E.isEmpty(), true);
            boolean z10 = s20Var == null;
            org.telegram.ui.Components.ep epVar = s4Var.e;
            if (epVar != null) {
                epVar.a(z10, true);
            }
        }
    }

    public static void a0(x60 x60Var) {
        ArrayList arrayList = x60Var.E;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.messenger.f5 contact = ((org.telegram.ui.Components.s20) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.e.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(x60Var.currentAccount).s(i10));
            x60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        x60Var.finishFragment();
    }

    public static void d0(x60 x60Var) {
        x60Var.y = false;
        u60 u60Var = x60Var.s;
        if (u60Var.h) {
            u60Var.h = false;
            u60Var.f();
        }
        x60Var.s.E(null);
        x60Var.h.setFastScrollVisible(true);
        x60Var.h.setVerticalScrollBarEnabled(false);
        x60Var.r.e(false, true);
        x60Var.r.setStickerType(0);
        x60Var.r.d.setText(org.telegram.messenger.dd.L0(2131748240, null));
        x60Var.r.e.setText("");
    }

    @Override // hh.d
    public final View S() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.y = false;
        this.E.clear();
        this.D.clear();
        this.F = null;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131749161, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 0));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(1, R.drawable.outline_header_search);
        this.c = b10;
        b10.setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
        org.telegram.ui.ActionBar.p5 p5Var = this.c;
        p5Var.N();
        p5Var.B0 = new ag.l3(this, 13);
        this.c.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        l0 l0Var = new l0(this, context, 11);
        this.fragmentView = l0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        w60 w60Var = new w60(this, context);
        this.f = w60Var;
        this.e.addView(w60Var, w7.b6.c(-2.0f, -1));
        this.d = new v60(this, context);
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(6);
        zzVar.x = false;
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, zzVar, 0, null);
        this.r = ew0Var;
        ew0Var.addView(zzVar, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(org.telegram.messenger.dd.L0(2131748240, null));
        this.r.e.setText("");
        this.r.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.n = new s4.a0(1, false);
        this.s = new u60(this, context);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.h = uk0Var;
        uk0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setVerticalScrollbarPosition(org.telegram.messenger.dd.X ? 1 : 2);
        l0Var.addView(this.h, w7.b6.c(-1.0f, -1));
        l0Var.addView(this.r);
        this.h.setOnItemClickListener(new g(this, 15));
        this.h.setOnScrollListener(new h3(this, 17));
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        c2Var.l = org.telegram.messenger.at.K2;
        c2Var.invalidateSelf();
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.b = f10Var;
        f10Var.c.setImageDrawable(c2Var);
        this.b.e(false, false);
        this.b.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
        this.b.setOnClickListener(new e50(this, 3));
        u60 u60Var = this.s;
        if (u60Var != null && !this.y) {
            this.r.setVisibility(u60Var.b() != 2 ? 4 : 0);
        }
        l0Var.addView(this.d, w7.b6.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        l0Var.addView(this.b, org.telegram.ui.Components.f10.b());
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.h1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.ew0 ew0Var;
        if (i10 == org.telegram.messenger.at.P) {
            f0();
        } else {
            if (i10 != org.telegram.messenger.at.O || (ew0Var = this.r) == null) {
                return;
            }
            ew0Var.e(false, true);
        }
    }

    public final void e0() {
        int i10;
        if (this.h == null) {
            return;
        }
        float f7 = this.a.f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (f7 > 0.0f) {
            i10 = org.telegram.messenger.i0.L(4.0f) + ((int) f7);
        } else {
            i10 = 0;
        }
        ei.b.e(this.h, this.G, this.H, currentActionBarHeight + i10, 0);
        this.r.setPadding(0, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.i5.r(this.currentAccount).a0);
        this.w = arrayList;
        Collections.sort(arrayList, new f6(25));
        org.telegram.ui.Components.ew0 ew0Var = this.r;
        if (ew0Var != null) {
            ew0Var.e(false, true);
        }
        u60 u60Var = this.s;
        if (u60Var != null) {
            u60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 4, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 4, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 4, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 262148, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ri));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // hh.d
    public final void m(r0.j1 j1Var) {
        this.I = j1Var.a.f(8).d;
        org.telegram.ui.Components.f10 f10Var = this.b;
        if (f10Var != null) {
            f10Var.setTranslationY(-Math.max(this.H, r3));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.s4 s4Var;
        org.telegram.messenger.f5 contact;
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        if (!s20Var.D) {
            org.telegram.ui.Components.s20 s20Var2 = this.F;
            if (s20Var2 != null) {
                s20Var2.a();
            }
            this.F = s20Var;
            s20Var.b();
            return;
        }
        this.F = null;
        this.f.a(s20Var);
        this.b.e(!this.E.isEmpty(), true);
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.s4) && (contact = (s4Var = (org.telegram.ui.Cells.s4) childAt).getContact()) != null) {
                boolean containsKey = this.D.containsKey(contact.b);
                org.telegram.ui.Components.ep epVar = s4Var.e;
                if (epVar != null) {
                    epVar.a(containsKey, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.P);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.O);
        f0();
        if (!org.telegram.messenger.e20.i(this.currentAccount).H) {
            org.telegram.messenger.i5.r(this.currentAccount).l();
            org.telegram.messenger.e20.i(this.currentAccount).H = true;
            org.telegram.messenger.e20.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.P);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.O);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.G = i11;
        this.H = i13;
        e0();
        v60 v60Var = this.d;
        if (v60Var != null) {
            v60Var.setTranslationY(org.telegram.messenger.i0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.f10 f10Var = this.b;
        if (f10Var != null) {
            f10Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.uk0 uk0Var = this.h;
            if (uk0Var != null) {
                uk0Var.x1();
            }
            if (this.f != null) {
                for (int i10 = 0; i10 < this.f.getChildCount(); i10++) {
                    View childAt = this.f.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.s20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            e0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override // hh.d
    public final /* synthetic */ void Q() {
    }

    @Override // hh.d
    public final /* synthetic */ void x() {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
