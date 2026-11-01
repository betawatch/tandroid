package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x71;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g8 extends LinearLayout implements vs {
    public final int a;
    public final x71 b;
    public final f8 c;
    public final FrameLayout d;
    public final lu0 e;
    public final long f;

    public g8(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var, lu0 lu0Var) {
        super(context);
        this.e = lu0Var;
        this.a = i10;
        this.f = j10;
        setOrientation(1);
        x71 x71Var = lu0Var == null ? new x71(context, null) : new wk0(context, p6Var, lu0Var);
        this.b = x71Var;
        f8 f8Var = new f8(context, i10, z10, j10, i11, p6Var);
        this.c = f8Var;
        f8Var.g = lu0Var == null ? null : (wk0) x71Var;
        x71Var.setAdapter(f8Var);
        View n10 = x71Var.n(lu0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, p6Var);
        if (lu0Var == null) {
            this.d = null;
            addView(n10, w7.b6.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(w7.b6.z(-1.0f), w7.b6.z(1.0f / org.telegram.messenger.i0.p)));
            setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, p6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            frameLayout.addView(n10, w7.b6.e(-1, 48, 48));
        }
        addView(x71Var, w7.b6.o(-1, -1));
    }

    public final void a(boolean z10) {
        f8 f8Var = this.c;
        x71 x71Var = this.b;
        lu0 lu0Var = this.e;
        if (lu0Var == null) {
            f8Var.i();
            x71Var.o(z10);
            return;
        }
        ArrayList arrayList = f8Var.i;
        ArrayList arrayList2 = f8Var.i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((b51) arrayList.get(i11)).z;
        }
        View currentView = x71Var.getCurrentView();
        int i12 = currentView instanceof e8 ? ((e8) currentView).d : 0;
        f8Var.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((b51) arrayList2.get(i14)).z;
        }
        if (i10 == i13) {
            if (z10) {
                return;
            }
            x71Var.o(false);
            return;
        }
        x71Var.onTouchEvent(null);
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                i15 = 0;
                break;
            } else if (((b51) arrayList2.get(i15)).z == i12) {
                break;
            } else {
                i15++;
            }
        }
        x71Var.setPosition(i15);
        x71Var.J();
        x71Var.o(false);
        lu0Var.p();
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.z3;
        long j10 = this.f;
        if ((i10 == i12 && j10 == 0) || (i10 == at.D3 && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public uk0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof e8) {
            return ((e8) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public x71 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        at.f(this.a).c(this, this.f == 0 ? at.z3 : at.D3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        at.f(this.a).n(this, this.f == 0 ? at.z3 : at.D3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ei.r rVar) {
        if (rVar != null) {
            f8 f8Var = this.c;
            if (f8Var.h == rVar) {
                return;
            }
            f8Var.h = rVar;
            x71 x71Var = this.b;
            rVar.c(x71Var);
            for (View view : x71Var.getViewPages()) {
                if (view instanceof e8) {
                    rVar.b(((e8) view).a);
                }
            }
        }
    }
}
