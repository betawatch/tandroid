package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rd1 extends org.telegram.ui.ActionBar.r2 {
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final y5 I;
    public final o11 J;
    public final jl0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.nm0 a;
    public org.telegram.ui.Components.nm0 b;
    public TextView c;
    public od1 d;
    public qd1 e;
    public final ArrayList f;
    public final ArrayList h;
    public r41 n;
    public org.telegram.ui.Components.uz r;
    public FrameLayout s;
    public int v;
    public final HashSet w;
    public org.telegram.ui.Cells.sa x;
    public ValueAnimator y;

    public rd1(int i10) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.w = new HashSet();
        this.H = AndroidUtilities.dp(64.0f);
        this.I = new y5(this, 15);
        this.J = new o11(this, 9);
        this.K = new jl0(this, 23);
        this.arguments = org.telegram.ui.Components.b10.g(i10, TeXSymbolParser.TYPE_ATTR);
    }

    public final void V() {
        int x02;
        if (this.c != null && ((x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false)) != this.N || this.O != org.telegram.ui.ActionBar.y6.I.q())) {
            this.O = org.telegram.ui.ActionBar.y6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.y6.E1(this.c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.y6.E1(this.c.getBackground(), org.telegram.ui.ActionBar.o6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h6, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:7:0x0005, B:9:0x0011, B:13:0x0024, B:15:0x002c, B:17:0x0036, B:19:0x003e, B:21:0x0055, B:22:0x005a, B:30:0x0018), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        int i10;
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.b7, false);
            if (this.L != null) {
                if (this.M != x02) {
                }
                for (i10 = 0; i10 < this.a.getChildCount(); i10++) {
                    View childAt = this.a.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.f7) && (childAt.getBackground() instanceof org.telegram.ui.Components.ar)) {
                        org.telegram.ui.ActionBar.y6.y1(childAt.getBackground(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false), false);
                        Drawable drawable = ((org.telegram.ui.Components.ar) childAt.getBackground()).b;
                        if (drawable != null) {
                            drawable.setColorFilter(this.L);
                        }
                        childAt.invalidate();
                    }
                }
            }
            this.M = x02;
            this.L = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
            while (i10 < this.a.getChildCount()) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.G = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.LimitReached));
        this.actionBar.setActionBarMenuOnItemClick(new r11(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new md1(this);
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.a = nm0Var;
        nm0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.a;
        od1 od1Var = new od1(this);
        this.d = od1Var;
        nm0Var2.setAdapter(od1Var);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.nm0 nm0Var3 = this.a;
        o11 o11Var = this.J;
        nm0Var3.setOnItemClickListener(o11Var);
        org.telegram.ui.Components.nm0 nm0Var4 = this.a;
        jl0 jl0Var = this.K;
        nm0Var4.setOnItemLongClickListener(jl0Var);
        org.telegram.ui.Components.nm0 nm0Var5 = new org.telegram.ui.Components.nm0(context, null);
        this.b = nm0Var5;
        nm0Var5.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var6 = this.b;
        qd1 qd1Var = new qd1(this);
        this.e = qd1Var;
        nm0Var6.setAdapter(qd1Var);
        this.b.setOnItemClickListener(o11Var);
        this.b.setOnItemLongClickListener(jl0Var);
        this.b.setOnScrollListener(new z81(this, 2));
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.r = uzVar;
        uzVar.setShowAtCenter(true);
        this.r.setText(LocaleController.getString(R.string.NoResult));
        this.r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, org.telegram.ui.Components.kb1.g(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.addView(this.b);
        this.s.addView(this.r);
        this.s.setVisibility(8);
        frameLayout.addView(this.s);
        this.d.l();
        this.E = 0.0f;
        AndroidUtilities.runOnUIThread(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 23));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i10, view, null);
        r41 r41Var = new r41(context, 5);
        this.n = r41Var;
        r41Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
        frameLayout.addView(this.n, org.telegram.ui.Components.kb1.i(-1, 64, 80));
        org.telegram.ui.ActionBar.f7.i(i10, this.n, null);
        this.n.addView(this.c, org.telegram.ui.Components.kb1.h(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new v21(this, 9));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(25, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        int i10 = org.telegram.ui.ActionBar.y6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.j7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        int i13 = org.telegram.ui.ActionBar.y6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Qh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V();
            W();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
