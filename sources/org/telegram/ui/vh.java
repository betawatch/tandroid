package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vh extends m2.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ MessageObject g;
    public final /* synthetic */ org.telegram.ui.Components.ui0 h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ m2.g l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ qn p;

    public vh(qn qnVar, int i9, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.ui0 ui0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i10, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.p = qnVar;
        this.c = i9;
        this.d = sparseArray;
        this.e = z10;
        this.f = list;
        this.g = messageObject;
        this.h = ui0Var;
        this.i = messageObject2;
        this.j = sparseIntArray;
        this.k = i10;
        this.l = gVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i11;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override // m2.a
    public final int b() {
        return this.c;
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i9) {
        int i10;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i9);
        if (view != null) {
            gVar.addView(view);
            return view;
        }
        int i11 = this.e ? i9 - 1 : i9;
        TLRPC.ReactionCount reactionCount = i11 >= 0 ? (TLRPC.ReactionCount) this.f.get(i11) : null;
        Context context = gVar.getContext();
        qn qnVar = this.p;
        on onVar = qnVar.aa;
        i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(context, onVar, i10, this.g, reactionCount, true);
        org.telegram.ui.Components.ui0 ui0Var = this.h;
        ej0Var.h(ui0Var.getSeenUsers());
        ej0Var.C = new b1(this, 16);
        ej0Var.A = new ih.v3(18, this, this.i);
        ej0Var.y = new bg.g(this.j, i9, this.k, this.l, this.m, this.n);
        if (i11 < 0) {
            ej0Var.setPredictiveCount(this.o);
            ui0Var.setSeenCallback(new k3(ej0Var, 1));
        }
        gVar.addView(ej0Var);
        sparseArray.put(i9, ej0Var);
        return ej0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
