package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r1 implements org.telegram.ui.Components.b91 {
    public final /* synthetic */ w1 a;

    public r1(w1 w1Var) {
        this.a = w1Var;
    }

    @Override // org.telegram.ui.Components.b91
    public final TextureView a(View view, boolean z4, float f10, int i10, boolean z10) {
        w1 w1Var = this.a;
        n4 n4Var = w1Var.x;
        if (z4) {
            n4Var.O.addView(n4Var.N, k7.b6.c(-1.0f, -1));
            n4Var.O.setVisibility(0);
            n4Var.O.a(f10, i10);
            n4Var.B0 = w1Var.b;
            n4Var.M.addView(view, k7.b6.c(-1.0f, -1));
            n4Var.M.setVisibility(0);
        } else {
            n4Var.O.removeView(n4Var.N);
            n4Var.B0 = null;
            n4Var.O.setVisibility(8);
            n4Var.M.setVisibility(4);
        }
        return n4Var.N;
    }

    @Override // org.telegram.ui.Components.b91
    public final void c(float f10, int i10) {
        this.a.x.O.a(f10, i10);
    }

    @Override // org.telegram.ui.Components.b91
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        w1 w1Var = this.a;
        w1Var.a.loadUrl(w1Var.v.url, hashMap);
    }

    @Override // org.telegram.ui.Components.b91
    public final void e(org.telegram.ui.Components.e91 e91Var, boolean z4) {
        n4 n4Var = this.a.x;
        if (!z4) {
            if (n4Var.A0 == e91Var) {
                n4Var.A0 = null;
            }
            try {
                n4Var.I.getWindow().clearFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        org.telegram.ui.Components.e91 e91Var2 = n4Var.A0;
        if (e91Var2 != null && e91Var2 != e91Var) {
            e91Var2.a.B();
            e91Var2.n();
            e91Var2.c0.d(true, true);
        }
        n4Var.A0 = e91Var;
        try {
            n4Var.I.getWindow().addFlags(128);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.b91
    public final TextureView f(View view, boolean z4, int i10, int i11, boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.Components.b91
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.b91
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.b91
    public final void b() {
    }

    @Override // org.telegram.ui.Components.b91
    public final void i(boolean z4, org.telegram.ui.Components.w81 w81Var, float f10, boolean z10) {
    }
}
