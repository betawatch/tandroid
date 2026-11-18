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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qm0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public final boolean E;
    public final boolean F;
    public final bn G;
    public int H;
    public boolean I;
    public org.telegram.ui.ActionBar.h1 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public org.telegram.ui.ActionBar.z0[] L;
    public FrameLayout M;
    public org.telegram.ui.Components.wt N;
    public k0 O;
    public ImageView P;
    public om0 Q;
    public uv R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public pm0 W;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.ck0 h;
    public l4 n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final int x;
    public boolean y;

    public qm0(int i7, boolean z10, boolean z11, bn bnVar) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = 2;
        this.y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = bnVar;
        this.x = i7;
        this.E = z10;
        this.F = z11;
    }

    public static void Z(qm0 qm0Var, org.telegram.messenger.ue ueVar) {
        if (ueVar != null) {
            cn0 cn0Var = new cn0(0, ueVar, qm0Var.b, qm0Var.c, qm0Var.x, qm0Var.F, qm0Var.G, false);
            Editable text = qm0Var.N.getText();
            qm0Var.a = text;
            cn0Var.d = text;
            org.telegram.ui.Components.wt wtVar = cn0Var.e0;
            if (wtVar != null) {
                wtVar.setText(text);
            }
            cn0Var.t0 = new f(qm0Var, 29);
            cn0Var.k0(qm0Var.H, qm0Var.I);
            qm0Var.presentFragment(cn0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!qm0Var.E) {
            cn0 cn0Var2 = new cn0(0, ueVar, hashMap, arrayList, qm0Var.x, qm0Var.F, qm0Var.G, false);
            Editable text2 = qm0Var.N.getText();
            qm0Var.a = text2;
            cn0Var2.d = text2;
            org.telegram.ui.Components.wt wtVar2 = cn0Var2.e0;
            if (wtVar2 != null) {
                wtVar2.setText(text2);
            }
            cn0Var2.t0 = new nm0(qm0Var, hashMap, arrayList, 0);
            cn0Var2.k0(qm0Var.H, qm0Var.I);
            qm0Var.presentFragment(cn0Var2);
            return;
        }
        fn0 fn0Var = new fn0(hashMap, arrayList, qm0Var.x, qm0Var.F, qm0Var.G);
        Editable text3 = qm0Var.N.getText();
        qm0Var.a = text3;
        cn0 cn0Var3 = fn0Var.a;
        if (cn0Var3 != null) {
            cn0Var3.d = text3;
            org.telegram.ui.Components.wt wtVar3 = cn0Var3.e0;
            if (wtVar3 != null) {
                wtVar3.setText(text3);
            }
        }
        nm0 nm0Var = new nm0(qm0Var, hashMap, arrayList, 1);
        cn0 cn0Var4 = fn0Var.a;
        cn0Var4.t0 = nm0Var;
        cn0 cn0Var5 = fn0Var.b;
        cn0Var5.t0 = nm0Var;
        cn0Var4.u0 = new dn0(fn0Var, 1);
        cn0Var5.u0 = new dn0(fn0Var, 2);
        int i7 = qm0Var.H;
        boolean z10 = qm0Var.I;
        cn0Var4.k0(i7, z10);
        fn0Var.b.k0(i7, z10);
        qm0Var.presentFragment(fn0Var);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i7) {
        if (hashMap.isEmpty() || this.W == null || this.w) {
            return;
        }
        this.w = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
            arrayList2.add(yyVar);
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                String str = efVar.h;
                if (str != null) {
                    yyVar.c = str;
                } else {
                    yyVar.c = efVar.I;
                }
                yyVar.e = efVar.c;
                yyVar.f = efVar.g;
                yyVar.k = efVar.s;
                yyVar.o = efVar.b;
                CharSequence charSequence = efVar.a;
                yyVar.d = charSequence != null ? charSequence.toString() : null;
                yyVar.i = efVar.n;
                yyVar.j = efVar.r;
                yyVar.h = efVar.x;
            } else if (obj instanceof org.telegram.messenger.hf) {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                String str2 = hfVar.h;
                if (str2 != null) {
                    yyVar.c = str2;
                } else {
                    yyVar.l = hfVar;
                }
                yyVar.e = hfVar.c;
                yyVar.f = hfVar.g;
                yyVar.k = hfVar.s;
                CharSequence charSequence2 = hfVar.I;
                yyVar.d = charSequence2 != null ? charSequence2.toString() : null;
                yyVar.i = hfVar.n;
                yyVar.j = hfVar.r;
                yyVar.h = hfVar.x;
                TLRPC.BotInlineResult botInlineResult = hfVar.N;
                if (botInlineResult != null && hfVar.H == 1) {
                    yyVar.m = botInlineResult;
                    yyVar.n = hfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        this.W.d(arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.da));
    }

    public final void b0(boolean z10) {
        if (z10 == (this.M.getTag() != null)) {
            return;
        }
        this.M.setTag(z10 ? 1 : null);
        if (this.N.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(this.N.getEditText());
        }
        this.N.k(true);
        if (z10) {
            this.M.setVisibility(0);
            this.O.setVisibility(0);
        } else {
            this.M.setVisibility(4);
            this.O.setVisibility(4);
        }
        this.O.setScaleX(z10 ? 1.0f : 0.2f);
        this.O.setScaleY(z10 ? 1.0f : 0.2f);
        this.O.setAlpha(z10 ? 1.0f : 0.0f);
        this.R.setScaleX(z10 ? 1.0f : 0.2f);
        this.R.setScaleY(z10 ? 1.0f : 0.2f);
        this.R.setAlpha(z10 ? 1.0f : 0.0f);
        this.M.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
        this.S.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.h5;
        org.telegram.ui.ActionBar.u6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i10, null);
        int i11 = 3;
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 25));
        org.telegram.ui.ActionBar.z t6 = this.actionBar.t();
        if (this.y) {
            t6.a(2, R.drawable.outline_header_search).setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
        }
        org.telegram.ui.ActionBar.r0 a10 = t6.a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        a10.e(1, R.drawable.msg_openin, org.telegram.messenger.gd.M0(2131747603, null));
        om0 om0Var = new om0(this, context);
        this.Q = om0Var;
        org.telegram.ui.ActionBar.u6.h(i7, om0Var, null);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131750468, null));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.h = ck0Var;
        ck0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new v4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, c8.ma.e(-1, -1, 51));
        org.telegram.ui.Components.ck0 ck0Var2 = this.h;
        l4 l4Var = new l4(13, this, context);
        this.n = l4Var;
        ck0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.u6.H(this.h, i7, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        int i12 = 17;
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(org.telegram.messenger.gd.M0(2131747988, null));
        this.Q.addView(this.s, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new gi.a(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.r, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, c8.ma.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.S.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.S, c8.ma.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout2, null);
        int i13 = 4;
        this.M.setVisibility(4);
        this.M.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.M, c8.ma.e(-1, 48, 83));
        this.M.setOnTouchListener(new gi.a(2));
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.o();
        }
        this.N = new org.telegram.ui.Components.wt(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).J0())});
        this.N.setHint(org.telegram.messenger.gd.M0(2131754452, null));
        org.telegram.ui.Components.mt editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.N.setText(charSequence);
        }
        k0 k0Var = new k0(i12, context, this);
        this.O = k0Var;
        k0Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, c8.ma.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S5, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T5, false)));
        this.P.setImageResource(R.drawable.attach_send);
        this.P.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.u6.s(this.P, org.telegram.ui.ActionBar.n6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new bg.q0(19));
        this.O.addView(this.P, c8.ma.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new j40(this, 18));
        this.P.setOnLongClickListener(new t(this, i11));
        float L = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.T;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        uv uvVar = new uv(i13, context, this);
        this.R = uvVar;
        uvVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, c8.ma.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.x != 0) {
            this.N.setVisibility(8);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.r2) {
            if (i7 == org.telegram.messenger.ks.t) {
                removeSelfFromStack(true);
                return;
            }
            return;
        }
        if (this.classGuid == ((Integer) objArr[0]).intValue()) {
            int i11 = this.x;
            if (i11 == 1 || i11 == 2 || i11 == 10 || !this.y) {
                this.d = (ArrayList) objArr[2];
            } else {
                this.d = (ArrayList) objArr[1];
            }
            FrameLayout frameLayout = this.r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            org.telegram.ui.Components.ck0 ck0Var = this.h;
            if (ck0Var != null && ck0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            l4 l4Var = this.n;
            if (l4Var != null) {
                l4Var.f();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar == null || !wtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        wtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ck0 ck0Var = this.h;
        if (ck0Var != null) {
            ck0Var.getViewTreeObserver().addOnPreDrawListener(new d7(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        int i7 = this.x;
        if (i7 == 1 || i7 == 2 || i7 == 10 || !this.y) {
            this.d = MediaController.d2;
        } else {
            this.d = MediaController.c2;
        }
        this.e = this.d == null;
        MediaController.O(this.classGuid);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.r2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.r2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.t);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.Components.ck0 ck0Var = this.h;
        if (ck0Var != null) {
            ck0Var.getViewTreeObserver().addOnPreDrawListener(new d7(this, 3));
        }
    }
}
