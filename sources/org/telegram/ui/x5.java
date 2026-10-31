package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class x5 extends org.telegram.ui.ActionBar.k2 {
    public v5 a;
    public org.telegram.ui.Components.tk0 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public x5(Bundle bundle) {
        super(bundle);
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Y() {
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
        arrayList2.add(new w5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new w5(2, (org.telegram.messenger.w2) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new w5(3, null));
            arrayList2.add(new w5(4, null));
        }
        arrayList2.add(new w5(3, null));
        v5 v5Var = this.a;
        if (v5Var != null) {
            if (arrayList != null) {
                v5Var.E(arrayList, arrayList2);
            } else {
                v5Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 15));
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747928, null));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        this.b.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.b;
        v5 v5Var = new v5(this);
        this.a = v5Var;
        tk0Var2.setAdapter(v5Var);
        this.b.setOnItemClickListener(new y0(this, 7));
        frameLayout.addView(this.b);
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        Y();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
