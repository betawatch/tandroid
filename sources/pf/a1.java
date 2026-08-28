package pf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import kh.b8;
import mh.m2;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.ai1;
import org.telegram.ui.xe1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a1 extends o2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public m2 f;
    public ai1 h;
    public i51 n;
    public boolean r;

    public a1(CharSequence charSequence, ArrayList arrayList, int i9, int i10, int i11) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i9;
        this.d = i10;
        this.e = i11;
        this.r = !arrayList.isEmpty();
    }

    public final boolean T() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((x0) arrayList.get(0)).a == 0 && ((x0) arrayList.get(0)).b == 1439;
    }

    public final boolean U() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || T() || ((x0) j3.r0.j(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.a);
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 11));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.a7, false));
        i51 i51Var = new i51(this, new b8(this, 22), new kh.p(this, 17), null);
        this.n = i51Var;
        i51Var.p1();
        this.actionBar.setAdaptiveBackground(this.n);
        frameLayout.addView(this.n, e6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        ai1 ai1Var = this.h;
        if (ai1Var != null) {
            ai1Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        m2 m2Var = this.f;
        if (m2Var != null) {
            m2Var.run();
        }
    }
}
