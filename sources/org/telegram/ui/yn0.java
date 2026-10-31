package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yn0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public final boolean D;
    public final boolean E;
    public final un F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.k1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.b1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.wt M;
    public l0 N;
    public ImageView O;
    public wn0 P;
    public bi.t0 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public xn0 V;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.tk0 h;
    public fg.j n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final int x;
    public boolean y;

    public yn0(int i10, boolean z10, boolean z11, un unVar) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = 2;
        this.y = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = unVar;
        this.x = i10;
        this.D = z10;
        this.E = z11;
    }

    public static void Y(yn0 yn0Var, org.telegram.messenger.we weVar) {
        if (weVar != null) {
            lo0 lo0Var = new lo0(0, weVar, yn0Var.b, yn0Var.c, yn0Var.x, yn0Var.E, yn0Var.F, false);
            Editable text = yn0Var.M.getText();
            yn0Var.a = text;
            lo0Var.d = text;
            org.telegram.ui.Components.wt wtVar = lo0Var.d0;
            if (wtVar != null) {
                wtVar.setText(text);
            }
            lo0Var.s0 = new e(yn0Var, 28);
            lo0Var.j0(yn0Var.G, yn0Var.H);
            yn0Var.presentFragment(lo0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!yn0Var.D) {
            lo0 lo0Var2 = new lo0(0, weVar, hashMap, arrayList, yn0Var.x, yn0Var.E, yn0Var.F, false);
            Editable text2 = yn0Var.M.getText();
            yn0Var.a = text2;
            lo0Var2.d = text2;
            org.telegram.ui.Components.wt wtVar2 = lo0Var2.d0;
            if (wtVar2 != null) {
                wtVar2.setText(text2);
            }
            lo0Var2.s0 = new vn0(yn0Var, hashMap, arrayList, 0);
            lo0Var2.j0(yn0Var.G, yn0Var.H);
            yn0Var.presentFragment(lo0Var2);
            return;
        }
        oo0 oo0Var = new oo0(hashMap, arrayList, yn0Var.x, yn0Var.E, yn0Var.F);
        Editable text3 = yn0Var.M.getText();
        yn0Var.a = text3;
        lo0 lo0Var3 = oo0Var.a;
        if (lo0Var3 != null) {
            lo0Var3.d = text3;
            org.telegram.ui.Components.wt wtVar3 = lo0Var3.d0;
            if (wtVar3 != null) {
                wtVar3.setText(text3);
            }
        }
        vn0 vn0Var = new vn0(yn0Var, hashMap, arrayList, 1);
        lo0 lo0Var4 = oo0Var.a;
        lo0Var4.s0 = vn0Var;
        lo0 lo0Var5 = oo0Var.b;
        lo0Var5.s0 = vn0Var;
        lo0Var4.t0 = new mo0(oo0Var, 1);
        lo0Var5.t0 = new mo0(oo0Var, 2);
        int i10 = yn0Var.G;
        boolean z10 = yn0Var.H;
        lo0Var4.j0(i10, z10);
        oo0Var.b.j0(i10, z10);
        yn0Var.presentFragment(oo0Var);
    }

    public final void Z(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (hashMap.isEmpty() || this.V == null || this.w) {
            return;
        }
        this.w = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = hashMap.get(arrayList.get(i11));
            org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
            arrayList2.add(pzVar);
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                String str = efVar.h;
                if (str != null) {
                    pzVar.c = str;
                } else {
                    pzVar.c = efVar.I;
                }
                pzVar.e = efVar.c;
                pzVar.f = efVar.g;
                pzVar.k = efVar.s;
                pzVar.o = efVar.b;
                CharSequence charSequence = efVar.a;
                pzVar.d = charSequence != null ? charSequence.toString() : null;
                pzVar.i = efVar.n;
                pzVar.j = efVar.r;
                pzVar.h = efVar.x;
            } else if (obj instanceof org.telegram.messenger.hf) {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                String str2 = hfVar.h;
                if (str2 != null) {
                    pzVar.c = str2;
                } else {
                    pzVar.l = hfVar;
                }
                pzVar.e = hfVar.c;
                pzVar.f = hfVar.g;
                pzVar.k = hfVar.s;
                CharSequence charSequence2 = hfVar.I;
                pzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                pzVar.i = hfVar.n;
                pzVar.j = hfVar.r;
                pzVar.h = hfVar.x;
                TLRPC.BotInlineResult botInlineResult = hfVar.N;
                if (botInlineResult != null && hfVar.H == 1) {
                    pzVar.m = botInlineResult;
                    pzVar.n = hfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        this.V.b(arrayList2);
    }

    public final void a0(boolean z10) {
        if (z10 == (this.L.getTag() != null)) {
            return;
        }
        this.L.setTag(z10 ? 1 : null);
        if (this.M.getEditText().isFocused()) {
            org.telegram.messenger.i0.v1(this.M.getEditText());
        }
        this.M.k(true);
        if (z10) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        this.N.setScaleX(z10 ? 1.0f : 0.2f);
        this.N.setScaleY(z10 ? 1.0f : 0.2f);
        this.N.setAlpha(z10 ? 1.0f : 0.0f);
        this.Q.setScaleX(z10 ? 1.0f : 0.2f);
        this.Q.setScaleY(z10 ? 1.0f : 0.2f);
        this.Q.setAlpha(z10 ? 1.0f : 0.0f);
        this.L.setTranslationY(z10 ? 0.0f : org.telegram.messenger.i0.L(48.0f));
        this.R.setTranslationY(z10 ? 0.0f : org.telegram.messenger.i0.L(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.da));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.h5;
        org.telegram.ui.ActionBar.a7.i(i10, lVar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.m(lVar2, 5, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i11, null);
        int i12 = 3;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, 13));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (this.y) {
            p5.a(2, R.drawable.outline_header_search).setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        }
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        a2.e(1, R.drawable.msg_openin, org.telegram.messenger.cd.L0(2131747812, null));
        wn0 wn0Var = new wn0(this, context);
        this.P = wn0Var;
        org.telegram.ui.ActionBar.a7.i(i10, wn0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131750493, null));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.h = tk0Var;
        tk0Var.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.a0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.tk0 tk0Var2 = this.h;
        fg.j jVar = new fg.j(14, this, context);
        this.n = jVar;
        tk0Var2.setAdapter(jVar);
        org.telegram.ui.ActionBar.a7.I(this.h, i10, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(org.telegram.messenger.cd.L0(2131748197, null));
        this.P.addView(this.s, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.r, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, w7.b6.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(org.telegram.messenger.i0.L(48.0f));
        this.P.addView(this.R, w7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(i10, frameLayout2, null);
        this.L.setVisibility(4);
        this.L.setTranslationY(org.telegram.messenger.i0.L(48.0f));
        this.P.addView(this.L, w7.b6.e(-1, 48, 83));
        this.L.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.o();
        }
        this.M = new org.telegram.ui.Components.wt(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).u3)});
        this.M.setHint(org.telegram.messenger.cd.L0(2131754454, null));
        org.telegram.ui.Components.mt editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        int i13 = 18;
        l0 l0Var = new l0(this, context, i13);
        this.N = l0Var;
        l0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S5, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.a7.t(this.O, org.telegram.ui.ActionBar.t6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new bi.d2(19));
        this.N.addView(this.O, w7.b6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new f50(this, i13));
        this.O.setOnLongClickListener(new s(this, i12));
        float L = org.telegram.messenger.i0.L(12.0f);
        TextPaint textPaint = this.S;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        bi.t0 t0Var = new bi.t0(this, context, 29);
        this.Q = t0Var;
        t0Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.x != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.r.setVisibility(8);
            this.h.setEmptyView(this.s);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.r2) {
            if (i10 == org.telegram.messenger.zs.t) {
                removeSelfFromStack(true);
                return;
            }
            return;
        }
        if (this.classGuid == ((Integer) objArr[0]).intValue()) {
            int i12 = this.x;
            if (i12 == 1 || i12 == 2 || i12 == 10 || !this.y) {
                this.d = (ArrayList) objArr[2];
            } else {
                this.d = (ArrayList) objArr[1];
            }
            FrameLayout frameLayout = this.r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            org.telegram.ui.Components.tk0 tk0Var = this.h;
            if (tk0Var != null && tk0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            fg.j jVar = this.n;
            if (jVar != null) {
                jVar.f();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar == null || !wtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        wtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.tk0 tk0Var = this.h;
        if (tk0Var != null) {
            tk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        int i10 = this.x;
        if (i10 == 1 || i10 == 2 || i10 == 10 || !this.y) {
            this.d = MediaController.b2;
        } else {
            this.d = MediaController.a2;
        }
        this.e = this.d == null;
        MediaController.O(this.classGuid);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.r2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.r2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.t);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.n;
        if (jVar != null) {
            jVar.f();
        }
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.Components.tk0 tk0Var = this.h;
        if (tk0Var != null) {
            tk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
