package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xc extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final ArrayList c;
    public final u71 d;
    public final org.telegram.ui.Components.zz e;
    public boolean f;
    public final vc h;
    public boolean n;
    public org.telegram.messenger.r20 r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public xc(int i10, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i10;
        this.b = p6Var;
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(getContext(), p6Var);
        this.e = zzVar;
        zzVar.setViewType(14);
        zzVar.setVisibility(0);
        addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        u71 u71Var = new u71(2, activity, p6Var);
        this.d = u71Var;
        u71Var.setClipToPadding(false);
        u71Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f));
        getContext();
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        u71Var.setLayoutManager(a0Var);
        u71Var.setAlpha(0.0f);
        vc vcVar = new vc(this, i10, p6Var);
        this.h = vcVar;
        u71Var.setAdapter(vcVar);
        addView(u71Var, w7.b6.c(130.0f, -1));
        u71Var.setOnItemClickListener(new g(this, 3));
        org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(i10);
        f7.m(true);
        f7.m(false);
        f7.l(true);
        f7.l(false);
        f7.q(new wc(this, i10), true);
        if (this.n) {
            org.telegram.messenger.i0.Y3(zzVar, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.i0.Y3(zzVar, true, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList.get(i11);
            if (!TextUtils.equals(this.s, cpVar.a()) && (!TextUtils.isEmpty(str) || !cpVar.a.a)) {
                z11 = false;
            }
            cpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        u71 u71Var = this.d;
        if (i10 >= 0 && !z10 && (u71Var.getLayoutManager() instanceof s4.a0)) {
            ((s4.a0) u71Var.getLayoutManager()).h1(i10, (org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < u71Var.getChildCount(); i12++) {
            View childAt = u71Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.f11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.f11) childAt).g(((org.telegram.ui.Components.cp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.w = wallPaper;
        org.telegram.messenger.i0.d0(this.d, new tc(this, 1));
        if (this.w != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.cp) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.y3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.r20 r20Var) {
        this.r = r20Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        vc vcVar;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        ?? a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList.get(i10);
            if (cpVar.c != a2) {
                cpVar.c = a2;
                z10 = true;
            }
            i10++;
        }
        u71 u71Var = this.d;
        if (u71Var == null) {
            return;
        }
        org.telegram.messenger.i0.d0(u71Var, new tc(this, 0));
        if (!z10 || (vcVar = this.h) == null) {
            return;
        }
        vcVar.f();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
