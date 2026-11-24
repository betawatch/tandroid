// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r1c extends y59 {
    public Context c;
    public View d;
    public int e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.e++;
        this.d = view;
        g(1);
    }

    @Override // y59
    public final int b() {
        return 2;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return i == 0 ? new b59(new q1c(this.c, (byte) 0)) : new b59(this.d);
    }
}
