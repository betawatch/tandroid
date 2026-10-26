package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zh extends a5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ MessageObject g;
    public final /* synthetic */ org.telegram.ui.Components.fk0 h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ a5.m l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ un p;

    public zh(un unVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.fk0 fk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, a5.m mVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.p = unVar;
        this.c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f = list;
        this.g = messageObject;
        this.h = fk0Var;
        this.i = messageObject2;
        this.j = sparseIntArray;
        this.k = i11;
        this.l = mVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i12;
    }

    @Override // a5.a
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
    }

    @Override // a5.a
    public final int b() {
        return this.c;
    }

    @Override // a5.a
    public final Object e(a5.m mVar, int i10) {
        int i11;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            mVar.addView(view);
            return view;
        }
        int i12 = this.e ? i10 - 1 : i10;
        TLRPC.ReactionCount reactionCount = i12 >= 0 ? (TLRPC.ReactionCount) this.f.get(i12) : null;
        Context context = mVar.getContext();
        un unVar = this.p;
        sn snVar = unVar.qa;
        i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0(context, snVar, i11, this.g, reactionCount, true);
        org.telegram.ui.Components.fk0 fk0Var = this.h;
        pk0Var.h(fk0Var.getSeenUsers());
        pk0Var.G = new y0(this, 18);
        pk0Var.E = new m4.s0(18, this, this.i);
        pk0Var.y = new hi.s4(this.j, i10, this.k, this.l, this.m, this.n);
        if (i12 < 0) {
            pk0Var.setPredictiveCount(this.o);
            fk0Var.setSeenCallback(new h3(pk0Var, 1));
        }
        mVar.addView(pk0Var);
        sparseArray.put(i10, pk0Var);
        return pk0Var;
    }

    @Override // a5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
