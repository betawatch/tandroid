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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wn0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
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
    public un0 P;
    public bi.t0 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public vn0 V;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.uk0 h;
    public fg.j n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final int x;
    public boolean y;

    public wn0(int i10, boolean z10, boolean z11, un unVar) {
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

    public static void Z(wn0 wn0Var, org.telegram.messenger.xe xeVar) {
        if (xeVar != null) {
            jo0 jo0Var = new jo0(0, xeVar, wn0Var.b, wn0Var.c, wn0Var.x, wn0Var.E, wn0Var.F, false);
            Editable text = wn0Var.M.getText();
            wn0Var.a = text;
            jo0Var.d = text;
            org.telegram.ui.Components.wt wtVar = jo0Var.d0;
            if (wtVar != null) {
                wtVar.setText(text);
            }
            jo0Var.s0 = new e(wn0Var, 29);
            jo0Var.k0(wn0Var.G, wn0Var.H);
            wn0Var.presentFragment(jo0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!wn0Var.D) {
            jo0 jo0Var2 = new jo0(0, xeVar, hashMap, arrayList, wn0Var.x, wn0Var.E, wn0Var.F, false);
            Editable text2 = wn0Var.M.getText();
            wn0Var.a = text2;
            jo0Var2.d = text2;
            org.telegram.ui.Components.wt wtVar2 = jo0Var2.d0;
            if (wtVar2 != null) {
                wtVar2.setText(text2);
            }
            jo0Var2.s0 = new tn0(wn0Var, hashMap, arrayList, 0);
            jo0Var2.k0(wn0Var.G, wn0Var.H);
            wn0Var.presentFragment(jo0Var2);
            return;
        }
        mo0 mo0Var = new mo0(hashMap, arrayList, wn0Var.x, wn0Var.E, wn0Var.F);
        Editable text3 = wn0Var.M.getText();
        wn0Var.a = text3;
        jo0 jo0Var3 = mo0Var.a;
        if (jo0Var3 != null) {
            jo0Var3.d = text3;
            org.telegram.ui.Components.wt wtVar3 = jo0Var3.d0;
            if (wtVar3 != null) {
                wtVar3.setText(text3);
            }
        }
        tn0 tn0Var = new tn0(wn0Var, hashMap, arrayList, 1);
        jo0 jo0Var4 = mo0Var.a;
        jo0Var4.s0 = tn0Var;
        jo0 jo0Var5 = mo0Var.b;
        jo0Var5.s0 = tn0Var;
        jo0Var4.t0 = new ko0(mo0Var, 1);
        jo0Var5.t0 = new ko0(mo0Var, 2);
        int i10 = wn0Var.G;
        boolean z10 = wn0Var.H;
        jo0Var4.k0(i10, z10);
        mo0Var.b.k0(i10, z10);
        wn0Var.presentFragment(mo0Var);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (hashMap.isEmpty() || this.V == null || this.w) {
            return;
        }
        this.w = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = hashMap.get(arrayList.get(i11));
            org.telegram.messenger.qz qzVar = new org.telegram.messenger.qz();
            arrayList2.add(qzVar);
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                String str = ffVar.h;
                if (str != null) {
                    qzVar.c = str;
                } else {
                    qzVar.c = ffVar.I;
                }
                qzVar.e = ffVar.c;
                qzVar.f = ffVar.g;
                qzVar.k = ffVar.s;
                qzVar.o = ffVar.b;
                CharSequence charSequence = ffVar.a;
                qzVar.d = charSequence != null ? charSequence.toString() : null;
                qzVar.i = ffVar.n;
                qzVar.j = ffVar.r;
                qzVar.h = ffVar.x;
            } else if (obj instanceof org.telegram.messenger.jf) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                String str2 = jfVar.h;
                if (str2 != null) {
                    qzVar.c = str2;
                } else {
                    qzVar.l = jfVar;
                }
                qzVar.e = jfVar.c;
                qzVar.f = jfVar.g;
                qzVar.k = jfVar.s;
                CharSequence charSequence2 = jfVar.I;
                qzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                qzVar.i = jfVar.n;
                qzVar.j = jfVar.r;
                qzVar.h = jfVar.x;
                TLRPC.BotInlineResult botInlineResult = jfVar.N;
                if (botInlineResult != null && jfVar.H == 1) {
                    qzVar.m = botInlineResult;
                    qzVar.n = jfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        this.V.b(arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.da));
    }

    public final void b0(boolean z10) {
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
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 13));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (this.y) {
            p5.a(2, R.drawable.outline_header_search).setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
        }
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        a2.e(1, R.drawable.msg_openin, org.telegram.messenger.dd.L0(2131747812, null));
        un0 un0Var = new un0(this, context);
        this.P = un0Var;
        org.telegram.ui.ActionBar.a7.i(i10, un0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131750493, null));
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.h = uk0Var;
        uk0Var.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.a0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.uk0 uk0Var2 = this.h;
        fg.j jVar = new fg.j(14, this, context);
        this.n = jVar;
        uk0Var2.setAdapter(jVar);
        org.telegram.ui.ActionBar.a7.I(this.h, i10, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(org.telegram.messenger.dd.L0(2131748197, null));
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
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).u3)});
        this.M.setHint(org.telegram.messenger.dd.L0(2131754454, null));
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
        this.O.setOnClickListener(new e50(this, i13));
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

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.at.r2) {
            if (i10 == org.telegram.messenger.at.t) {
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
            org.telegram.ui.Components.uk0 uk0Var = this.h;
            if (uk0Var != null && uk0Var.getEmptyView() == null) {
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
        org.telegram.ui.Components.uk0 uk0Var = this.h;
        if (uk0Var != null) {
            uk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
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
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.r2);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.r2);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.t);
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
        org.telegram.ui.Components.uk0 uk0Var = this.h;
        if (uk0Var != null) {
            uk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
