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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, View.OnClickListener, fe.e, hh.d {
    public final HashMap D;
    public final ArrayList E;
    public org.telegram.ui.Components.s20 F;
    public int G;
    public int H;
    public int I;
    public final fe.f a;
    public org.telegram.ui.Components.f10 b;
    public org.telegram.ui.ActionBar.p5 c;
    public w60 d;
    public ScrollView e;
    public x60 f;
    public org.telegram.ui.Components.tk0 h;
    public s4.a0 n;
    public org.telegram.ui.Components.dw0 r;
    public v60 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public y60() {
        super(null);
        this.a = new fe.f(3, this, org.telegram.ui.Components.gr.h, 350L, 0.0f);
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static void Y(y60 y60Var, View view, int i10) {
        org.telegram.ui.Cells.s4 s4Var;
        org.telegram.messenger.f5 contact;
        if (i10 == 0 && !y60Var.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s10 = org.telegram.messenger.i5.r(y60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s10);
                y60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s10), 500);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.s4) && (contact = (s4Var = (org.telegram.ui.Cells.s4) view).getContact()) != null) {
            org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) y60Var.D.get(contact.b);
            if (s20Var != null) {
                y60Var.f.a(s20Var);
            } else {
                org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(y60Var.getParentActivity(), null, contact, true, y60Var.resourceProvider);
                x60 x60Var = y60Var.f;
                ArrayList arrayList = x60Var.c;
                y60 y60Var2 = x60Var.f;
                y60Var2.E.add(s20Var2);
                y60Var2.D.put(s20Var2.getKey(), s20Var2);
                AnimatorSet animatorSet = x60Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    x60Var.a.cancel();
                }
                x60Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                x60Var.a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.voip.h2(x60Var, 13));
                x60Var.a.setInterpolator(org.telegram.ui.Components.gr.h);
                x60Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, (Property<org.telegram.ui.Components.s20, Float>) View.ALPHA, 0.0f, 1.0f));
                x60Var.addView(s20Var2);
                y60Var2.e.post(new zy(x60Var, 15));
                s20Var2.setOnClickListener(y60Var);
            }
            y60Var.b.e(!y60Var.E.isEmpty(), true);
            boolean z10 = s20Var == null;
            org.telegram.ui.Components.ep epVar = s4Var.e;
            if (epVar != null) {
                epVar.a(z10, true);
            }
        }
    }

    public static void Z(y60 y60Var) {
        ArrayList arrayList = y60Var.E;
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
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(y60Var.currentAccount).s(i10));
            y60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        y60Var.finishFragment();
    }

    public static void c0(y60 y60Var) {
        y60Var.y = false;
        v60 v60Var = y60Var.s;
        if (v60Var.h) {
            v60Var.h = false;
            v60Var.f();
        }
        y60Var.s.E(null);
        y60Var.h.setFastScrollVisible(true);
        y60Var.h.setVerticalScrollBarEnabled(false);
        y60Var.r.e(false, true);
        y60Var.r.setStickerType(0);
        y60Var.r.d.setText(org.telegram.messenger.cd.L0(2131748240, null));
        y60Var.r.e.setText("");
    }

    @Override // hh.d
    public final View R() {
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
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749161, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 0));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(1, R.drawable.outline_header_search);
        this.c = b10;
        b10.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        org.telegram.ui.ActionBar.p5 p5Var = this.c;
        p5Var.N();
        p5Var.B0 = new ag.l3(this, 13);
        this.c.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        l0 l0Var = new l0(this, context, 11);
        this.fragmentView = l0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        x60 x60Var = new x60(this, context);
        this.f = x60Var;
        this.e.addView(x60Var, w7.b6.c(-2.0f, -1));
        this.d = new w60(this, context);
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(6);
        zzVar.x = false;
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, zzVar, 0, null);
        this.r = dw0Var;
        dw0Var.addView(zzVar, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(org.telegram.messenger.cd.L0(2131748240, null));
        this.r.e.setText("");
        this.r.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.n = new s4.a0(1, false);
        this.s = new v60(this, context);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.h = tk0Var;
        tk0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        l0Var.addView(this.h, w7.b6.c(-1.0f, -1));
        l0Var.addView(this.r);
        this.h.setOnItemClickListener(new g(this, 15));
        this.h.setOnScrollListener(new h3(this, 17));
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        c2Var.l = org.telegram.messenger.zs.K2;
        c2Var.invalidateSelf();
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.b = f10Var;
        f10Var.c.setImageDrawable(c2Var);
        this.b.e(false, false);
        this.b.setContentDescription(org.telegram.messenger.cd.L0(2131748267, null));
        this.b.setOnClickListener(new f50(this, 3));
        v60 v60Var = this.s;
        if (v60Var != null && !this.y) {
            this.r.setVisibility(v60Var.b() != 2 ? 4 : 0);
        }
        l0Var.addView(this.d, w7.b6.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        l0Var.addView(this.b, org.telegram.ui.Components.f10.b());
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.h1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
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

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.dw0 dw0Var;
        if (i10 == org.telegram.messenger.zs.P) {
            e0();
        } else {
            if (i10 != org.telegram.messenger.zs.O || (dw0Var = this.r) == null) {
                return;
            }
            dw0Var.e(false, true);
        }
    }

    public final void e0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.i5.r(this.currentAccount).a0);
        this.w = arrayList;
        Collections.sort(arrayList, new f6(25));
        org.telegram.ui.Components.dw0 dw0Var = this.r;
        if (dw0Var != null) {
            dw0Var.e(false, true);
        }
        v60 v60Var = this.s;
        if (v60Var != null) {
            v60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
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
    public final void l(r0.j1 j1Var) {
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
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.P);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.O);
        e0();
        if (!org.telegram.messenger.d20.i(this.currentAccount).H) {
            org.telegram.messenger.i5.r(this.currentAccount).l();
            org.telegram.messenger.d20.i(this.currentAccount).H = true;
            org.telegram.messenger.d20.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.P);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.O);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.G = i11;
        this.H = i13;
        d0();
        w60 w60Var = this.d;
        if (w60Var != null) {
            w60Var.setTranslationY(org.telegram.messenger.i0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G);
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
            org.telegram.ui.Components.tk0 tk0Var = this.h;
            if (tk0Var != null) {
                tk0Var.x1();
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
            d0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override // hh.d
    public final /* synthetic */ void P() {
    }

    @Override // hh.d
    public final /* synthetic */ void w() {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
