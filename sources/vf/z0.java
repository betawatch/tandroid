package vf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.h61;
import qh.c4;
import qh.u9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z0 extends p2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public u9 f;
    public k0 h;
    public h61 n;
    public boolean r;

    public z0(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((w0) arrayList.get(0)).a == 0 && ((w0) arrayList.get(0)).b == 1439;
    }

    public final boolean V() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || U() || ((w0) l.d.i(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.a);
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.a7, false));
        h61 h61Var = new h61(this, new c4(this, 23), new sf.h(this, 7), null);
        this.n = h61Var;
        h61Var.o1();
        this.actionBar.setAdaptiveBackground(this.n);
        frameLayout.addView(this.n, c6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        k0 k0Var = this.h;
        if (k0Var != null) {
            k0Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.clear();
        u9 u9Var = this.f;
        if (u9Var != null) {
            u9Var.run();
        }
    }
}
