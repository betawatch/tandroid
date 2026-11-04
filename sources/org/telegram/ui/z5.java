package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class z5 extends org.telegram.ui.ActionBar.d2 {
    public x5 a;
    public org.telegram.ui.Components.tj0 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public z5(Bundle bundle) {
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
        arrayList2.add(new y5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
            arrayList2.add(new y5(2, (org.telegram.messenger.s2) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new y5(3, null));
            arrayList2.add(new y5(4, null));
        }
        arrayList2.add(new y5(3, null));
        x5 x5Var = this.a;
        if (x5Var != null) {
            if (arrayList != null) {
                x5Var.E(arrayList, arrayList2);
            } else {
                x5Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 26));
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747920, null));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.b;
        x5 x5Var = new x5(this);
        this.a = x5Var;
        tj0Var2.setAdapter(x5Var);
        this.b.setOnItemClickListener(new x0(this, 7));
        frameLayout.addView(this.b);
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        Z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
