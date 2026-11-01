package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f8 extends p71 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f;
    public wk0 g;
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

    @Override // org.telegram.ui.Components.p71
    public final void b(View view, int i10, int i11) {
        wk0 wk0Var = this.g;
        if (wk0Var != null) {
            wk0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final View d(int i10) {
        e8 e8Var = new e8(this.a, this.c, this.f, i10, this.b, this.d, this.e);
        if (this.g != null) {
            e8Var.setClipChildren(false);
            e8Var.setClipToPadding(false);
            v51 v51Var = e8Var.a;
            v51Var.setClipToPadding(false);
            v51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
            v51Var.f3.r = false;
            v51Var.setCaptureSectionsDecoratorAllowed(true);
            v51Var.setOverScrollMode(0);
            ei.r rVar = this.h;
            if (rVar != null) {
                rVar.b(v51Var);
            }
        }
        return e8Var;
    }

    @Override // org.telegram.ui.Components.p71
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.p71
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : dd.L0(2131744936, null) : dd.L0(2131744937, null) : dd.L0(2131744938, null);
    }

    @Override // org.telegram.ui.Components.p71
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((b51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j10 = this.f;
        int i10 = this.b;
        if (j10 == 0) {
            e6 y3 = e6.y(i10, this.c);
            arrayList.add(b51.D(0));
            if (y3.N(1)) {
                arrayList.add(b51.D(1));
            }
            if (y3.N(2)) {
                arrayList.add(b51.D(2));
                return;
            }
            return;
        }
        r g10 = r.g(i10);
        arrayList.add(b51.D(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(b51.D(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(b51.D(2));
    }
}
