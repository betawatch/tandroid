package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class z5 extends org.telegram.ui.ActionBar.o2 {
    public x5 a;
    public org.telegram.ui.Components.wk0 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public z5(Bundle bundle) {
        super(bundle);
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void T() {
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList3.get(i9);
            i9++;
            arrayList2.add(new y5(2, (CacheByChatsController.KeepMediaException) obj));
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
                x5Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 16));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.b = new org.telegram.ui.Components.wk0(context, null);
        f2.n nVar = new f2.n();
        nVar.C = false;
        nVar.m = false;
        this.b.setItemAnimator(nVar);
        this.b.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var = this.b;
        x5 x5Var = new x5(this);
        this.a = x5Var;
        wk0Var.setAdapter(x5Var);
        this.b.setOnItemClickListener(new b1(this, 7));
        frameLayout.addView(this.b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        T();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        T();
        return super.onFragmentCreate();
    }
}
