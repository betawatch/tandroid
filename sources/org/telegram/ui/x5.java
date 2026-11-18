package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class x5 extends org.telegram.ui.ActionBar.h2 {
    public v5 a;
    public org.telegram.ui.Components.ck0 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public x5(Bundle bundle) {
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
        arrayList2.add(new w5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            arrayList2.add(new w5(2, (org.telegram.messenger.t2) obj));
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

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 28));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747719, null));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.b = ck0Var;
        ck0Var.r1();
        this.b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.b;
        v5 v5Var = new v5(this);
        this.a = v5Var;
        ck0Var2.setAdapter(v5Var);
        this.b.setOnItemClickListener(new w0(this, 7));
        frameLayout.addView(this.b);
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        Z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
