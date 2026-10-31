package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.w71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g8 extends LinearLayout implements us {
    public final int a;
    public final w71 b;
    public final f8 c;
    public final FrameLayout d;
    public final ku0 e;
    public final long f;

    public g8(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var, ku0 ku0Var) {
        super(context);
        this.e = ku0Var;
        this.a = i10;
        this.f = j10;
        setOrientation(1);
        w71 w71Var = ku0Var == null ? new w71(context, null) : new vk0(context, p6Var, ku0Var);
        this.b = w71Var;
        f8 f8Var = new f8(context, i10, z10, j10, i11, p6Var);
        this.c = f8Var;
        f8Var.g = ku0Var == null ? null : (vk0) w71Var;
        w71Var.setAdapter(f8Var);
        View n10 = w71Var.n(ku0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, p6Var);
        if (ku0Var == null) {
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
        addView(w71Var, w7.b6.o(-1, -1));
    }

    public final void a(boolean z10) {
        f8 f8Var = this.c;
        w71 w71Var = this.b;
        ku0 ku0Var = this.e;
        if (ku0Var == null) {
            f8Var.i();
            w71Var.o(z10);
            return;
        }
        ArrayList arrayList = f8Var.i;
        ArrayList arrayList2 = f8Var.i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((a51) arrayList.get(i11)).z;
        }
        View currentView = w71Var.getCurrentView();
        int i12 = currentView instanceof e8 ? ((e8) currentView).d : 0;
        f8Var.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((a51) arrayList2.get(i14)).z;
        }
        if (i10 == i13) {
            if (z10) {
                return;
            }
            w71Var.o(false);
            return;
        }
        w71Var.onTouchEvent(null);
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                i15 = 0;
                break;
            } else if (((a51) arrayList2.get(i15)).z == i12) {
                break;
            } else {
                i15++;
            }
        }
        w71Var.setPosition(i15);
        w71Var.J();
        w71Var.o(false);
        ku0Var.p();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.z3;
        long j10 = this.f;
        if ((i10 == i12 && j10 == 0) || (i10 == zs.D3 && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public tk0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof e8) {
            return ((e8) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public w71 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        zs.f(this.a).c(this, this.f == 0 ? zs.z3 : zs.D3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zs.f(this.a).n(this, this.f == 0 ? zs.z3 : zs.D3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ei.r rVar) {
        if (rVar != null) {
            f8 f8Var = this.c;
            if (f8Var.h == rVar) {
                return;
            }
            f8Var.h = rVar;
            w71 w71Var = this.b;
            rVar.c(w71Var);
            for (View view : w71Var.getViewPages()) {
                if (view instanceof e8) {
                    rVar.b(((e8) view).a);
                }
            }
        }
    }
}
