package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class y5 extends org.telegram.ui.ActionBar.e2 {
    public w5 a;
    public org.telegram.ui.Components.uj0 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public y5(Bundle bundle) {
        super(bundle);
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.c;
        if (z10 || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new x5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            arrayList2.add(new x5(2, (org.telegram.messenger.s2) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new x5(3, null));
            arrayList2.add(new x5(4, null));
        }
        arrayList2.add(new x5(3, null));
        w5 w5Var = this.a;
        if (w5Var != null) {
            if (arrayList != null) {
                w5Var.E(arrayList, arrayList2);
            } else {
                w5Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 26));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747912, null));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var;
        uj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.b;
        w5 w5Var = new w5(this);
        this.a = w5Var;
        uj0Var2.setAdapter(w5Var);
        this.b.setOnItemClickListener(new w0(this, 7));
        frameLayout.addView(this.b);
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        Z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
