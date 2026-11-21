package yg;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class d extends c {
    public static final /* synthetic */ int w = 0;
    public int s;

    public d(Context context, h6 h6Var) {
        super(context, h6Var);
        this.d.setTypeface(g0.o());
    }

    @Override // yg.c
    public boolean b() {
        return !(this instanceof e);
    }

    @Override // yg.c
    public void d() {
        this.c.setLayoutParams(ma.d(40, 40.0f, (gd.a0 ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = gd.a0;
        this.d.setLayoutParams(ma.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f));
        boolean z11 = gd.a0;
        this.e.setLayoutParams(ma.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 109.0f, 0.0f, z11 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(ma.d(22, 22.0f, (gd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
