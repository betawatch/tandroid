package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class i extends c {
    public final k5 s;
    public Object w;

    public i(Context context, f6 f6Var) {
        super(context, f6Var);
        this.c.setVisibility(8);
        k5 k5Var = this.e;
        int i7 = k6.B6;
        r6.Y(k5Var, i7, f6Var);
        k5 k5Var2 = new k5(context);
        this.s = k5Var2;
        k5Var2.setTextSize(16);
        r6.Y(k5Var2, i7, f6Var);
        k5Var2.setGravity(id.a0 ? 3 : 5);
        addView(k5Var2);
        boolean z9 = id.a0;
        k5Var2.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 3 : 5) | 16, z9 ? 20.0f : 0.0f, 0.0f, z9 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // yg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
