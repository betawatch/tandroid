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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y50 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, View.OnClickListener, te.b, rh.c {
    public final HashMap E;
    public final ArrayList F;
    public org.telegram.ui.Components.f20 G;
    public int H;
    public int I;
    public int J;
    public final te.c a;
    public org.telegram.ui.Components.t00 b;
    public org.telegram.ui.ActionBar.d5 c;
    public w50 d;
    public ScrollView e;
    public x50 f;
    public org.telegram.ui.Components.uj0 h;
    public v4.b0 n;
    public org.telegram.ui.Components.cv0 r;
    public v50 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public y50() {
        super(null);
        this.a = new te.c(3, this, org.telegram.ui.Components.er.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static void Z(y50 y50Var, View view, int i7) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        if (i7 == 0 && !y50Var.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.g5.r(y50Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                y50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.f20 f20Var = (org.telegram.ui.Components.f20) y50Var.E.get(contact.b);
            if (f20Var != null) {
                y50Var.f.a(f20Var);
            } else {
                org.telegram.ui.Components.f20 f20Var2 = new org.telegram.ui.Components.f20(y50Var.getParentActivity(), null, contact, true, y50Var.resourceProvider);
                x50 x50Var = y50Var.f;
                ArrayList arrayList = x50Var.c;
                y50 y50Var2 = x50Var.f;
                y50Var2.F.add(f20Var2);
                y50Var2.E.put(f20Var2.getKey(), f20Var2);
                AnimatorSet animatorSet = x50Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    x50Var.a.cancel();
                }
                x50Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                x50Var.a = animatorSet2;
                animatorSet2.addListener(new xx(x50Var, 3));
                x50Var.a.setInterpolator(org.telegram.ui.Components.er.h);
                x50Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(f20Var2, (Property<org.telegram.ui.Components.f20, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f20Var2, (Property<org.telegram.ui.Components.f20, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f20Var2, (Property<org.telegram.ui.Components.f20, Float>) View.ALPHA, 0.0f, 1.0f));
                x50Var.addView(f20Var2);
                y50Var2.e.post(new iz(x50Var, 15));
                f20Var2.setOnClickListener(y50Var);
            }
            y50Var.b.e(!y50Var.F.isEmpty(), true);
            boolean z10 = f20Var == null;
            org.telegram.ui.Components.fp fpVar = q4Var.e;
            if (fpVar != null) {
                fpVar.a(z10, true);
            }
        }
    }

    public static void a0(y50 y50Var) {
        ArrayList arrayList = y50Var.F;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.d5 contact = ((org.telegram.ui.Components.f20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(y50Var.currentAccount).s(i7));
            y50Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        y50Var.finishFragment();
    }

    public static void d0(y50 y50Var) {
        y50Var.y = false;
        v50 v50Var = y50Var.s;
        if (v50Var.h) {
            v50Var.h = false;
            v50Var.f();
        }
        y50Var.s.E(null);
        y50Var.h.setFastScrollVisible(true);
        y50Var.h.setVerticalScrollBarEnabled(false);
        y50Var.r.e(false, true);
        y50Var.r.setStickerType(0);
        y50Var.r.d.setText(org.telegram.messenger.hd.M0(2131748223, null));
        y50Var.r.e.setText("");
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            e0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override // rh.c
    public final View S() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.y = false;
        this.F.clear();
        this.E.clear();
        this.G = null;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749151, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 10));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(1, R.drawable.outline_header_search);
        this.c = b10;
        b10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        org.telegram.ui.ActionBar.d5 d5Var = this.c;
        d5Var.O();
        d5Var.C0 = new kg.x1(this, 13);
        this.c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        x50 x50Var = new x50(this, context);
        this.f = x50Var;
        this.e.addView(x50Var, c8.ja.c(-2.0f, -1));
        this.d = new w50(this, context);
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        pzVar.setViewType(6);
        pzVar.x = false;
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, pzVar, 0, null);
        this.r = cv0Var;
        cv0Var.addView(pzVar, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(org.telegram.messenger.hd.M0(2131748223, null));
        this.r.e.setText("");
        this.r.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.n = new v4.b0(1, false);
        this.s = new v50(this, context);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.h = uj0Var;
        uj0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        k0Var.addView(this.h, c8.ja.c(-1.0f, -1));
        k0Var.addView(this.r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.l = org.telegram.messenger.ns.K2;
        x1Var.invalidateSelf();
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.b = t00Var;
        t00Var.c.setImageDrawable(x1Var);
        this.b.e(false, false);
        this.b.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        this.b.setOnClickListener(new g40(this, 3));
        v50 v50Var = this.s;
        if (v50Var != null && !this.y) {
            this.r.setVisibility(v50Var.b() != 2 ? 4 : 0);
        }
        k0Var.addView(this.d, c8.ja.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.b, org.telegram.ui.Components.t00.b());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.cv0 cv0Var;
        if (i7 == org.telegram.messenger.ns.P) {
            f0();
        } else {
            if (i7 != org.telegram.messenger.ns.O || (cv0Var = this.r) == null) {
                return;
            }
            cv0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.a.f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        ri.a.e(this.h, this.H, this.I, currentActionBarHeight + i7, 0);
        this.r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.g5.r(this.currentAccount).b0);
        this.w = arrayList;
        Collections.sort(arrayList, new me(25));
        org.telegram.ui.Components.cv0 cv0Var = this.r;
        if (cv0Var != null) {
            cv0Var.e(false, true);
        }
        v50 v50Var = this.s;
        if (v50Var != null) {
            v50Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f, 0, new Class[]{org.telegram.ui.Components.f20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f, 0, new Class[]{org.telegram.ui.Components.f20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ui));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // rh.c
    public final void m(r0.k1 k1Var) {
        this.J = k1Var.a.f(8).d;
        org.telegram.ui.Components.t00 t00Var = this.b;
        if (t00Var != null) {
            t00Var.setTranslationY(-Math.max(this.I, r3));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        org.telegram.ui.Components.f20 f20Var = (org.telegram.ui.Components.f20) view;
        if (!f20Var.E) {
            org.telegram.ui.Components.f20 f20Var2 = this.G;
            if (f20Var2 != null) {
                f20Var2.a();
            }
            this.G = f20Var;
            f20Var.b();
            return;
        }
        this.G = null;
        this.f.a(f20Var);
        this.b.e(!this.F.isEmpty(), true);
        int childCount = this.h.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.h.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) childAt).getContact()) != null) {
                boolean containsKey = this.E.containsKey(contact.b);
                org.telegram.ui.Components.fp fpVar = q4Var.e;
                if (fpVar != null) {
                    fpVar.a(containsKey, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.P);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.O);
        f0();
        if (!org.telegram.messenger.m10.i(this.currentAccount).I) {
            org.telegram.messenger.g5.r(this.currentAccount).l();
            org.telegram.messenger.m10.i(this.currentAccount).I = true;
            org.telegram.messenger.m10.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.P);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.O);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.H = i10;
        this.I = i12;
        e0();
        w50 w50Var = this.d;
        if (w50Var != null) {
            w50Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H);
        }
        org.telegram.ui.Components.t00 t00Var = this.b;
        if (t00Var != null) {
            t00Var.setTranslationY(-Math.max(this.I, this.J));
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.uj0 uj0Var = this.h;
            if (uj0Var != null) {
                uj0Var.x1();
            }
            if (this.f != null) {
                for (int i7 = 0; i7 < this.f.getChildCount(); i7++) {
                    View childAt = this.f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.f20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // rh.c
    public final /* synthetic */ void Q() {
    }

    @Override // rh.c
    public final /* synthetic */ void w() {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
