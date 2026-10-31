package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f8 extends o71 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f;
    public vk0 g;
    public ei.r h;
    public final ArrayList i = new ArrayList();

    public f8(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = p6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        vk0 vk0Var = this.g;
        if (vk0Var != null) {
            vk0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        e8 e8Var = new e8(this.a, this.c, this.f, i10, this.b, this.d, this.e);
        if (this.g != null) {
            e8Var.setClipChildren(false);
            e8Var.setClipToPadding(false);
            u51 u51Var = e8Var.a;
            u51Var.setClipToPadding(false);
            u51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
            u51Var.f3.r = false;
            u51Var.setCaptureSectionsDecoratorAllowed(true);
            u51Var.setOverScrollMode(0);
            ei.r rVar = this.h;
            if (rVar != null) {
                rVar.b(u51Var);
            }
        }
        return e8Var;
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.o71
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : cd.L0(2131744936, null) : cd.L0(2131744937, null) : cd.L0(2131744938, null);
    }

    @Override // org.telegram.ui.Components.o71
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((a51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j10 = this.f;
        int i10 = this.b;
        if (j10 == 0) {
            e6 y3 = e6.y(i10, this.c);
            arrayList.add(a51.D(0));
            if (y3.N(1)) {
                arrayList.add(a51.D(1));
            }
            if (y3.N(2)) {
                arrayList.add(a51.D(2));
                return;
            }
            return;
        }
        r g10 = r.g(i10);
        arrayList.add(a51.D(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(a51.D(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(a51.D(2));
    }
}
