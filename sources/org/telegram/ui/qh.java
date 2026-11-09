package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qh extends c5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ org.telegram.messenger.ij g;
    public final /* synthetic */ org.telegram.ui.Components.ih0 h;
    public final /* synthetic */ org.telegram.messenger.ij i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ c5.k l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ cn p;

    public qh(cn cnVar, int i7, SparseArray sparseArray, boolean z9, List list, org.telegram.messenger.ij ijVar, org.telegram.ui.Components.ih0 ih0Var, org.telegram.messenger.ij ijVar2, SparseIntArray sparseIntArray, int i10, c5.k kVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.p = cnVar;
        this.c = i7;
        this.d = sparseArray;
        this.e = z9;
        this.f = list;
        this.g = ijVar;
        this.h = ih0Var;
        this.i = ijVar2;
        this.j = sparseIntArray;
        this.k = i10;
        this.l = kVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i11;
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
    }

    @Override // c5.a
    public final int b() {
        return this.c;
    }

    @Override // c5.a
    public final Object e(c5.k kVar, int i7) {
        int i10;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            kVar.addView(view);
            return view;
        }
        int i11 = this.e ? i7 - 1 : i7;
        TLRPC.ReactionCount reactionCount = i11 >= 0 ? (TLRPC.ReactionCount) this.f.get(i11) : null;
        Context context = kVar.getContext();
        cn cnVar = this.p;
        an anVar = cnVar.za;
        i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(context, anVar, i10, this.g, reactionCount, true);
        org.telegram.ui.Components.ih0 ih0Var = this.h;
        sh0Var.h(ih0Var.getSeenUsers());
        sh0Var.G = new w0(this, 18);
        sh0Var.E = new ni.c(13, this, this.i);
        sh0Var.D = new hi.g4(this.j, i7, this.k, this.l, this.m, this.n);
        if (i11 < 0) {
            sh0Var.setPredictiveCount(this.o);
            ih0Var.setSeenCallback(new f3(sh0Var, 1));
        }
        kVar.addView(sh0Var);
        sparseArray.put(i7, sh0Var);
        return sh0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
