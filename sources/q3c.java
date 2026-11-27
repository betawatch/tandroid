// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q3c extends j79 {
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

    @Override // j79
    public final int b() {
        return 2;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        return i == 0 ? new n69(new p3c(this.c, (byte) 0)) : new n69(this.d);
    }
}
