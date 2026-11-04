package zg;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class d extends c {
    public static final /* synthetic */ int w = 0;
    public int s;

    public d(Context context, e6 e6Var) {
        super(context, e6Var);
        this.d.setTypeface(g0.o());
    }

    @Override // zg.c
    public boolean b() {
        return !(this instanceof e);
    }

    @Override // zg.c
    public void d() {
        this.c.setLayoutParams(mf.d(40, 40.0f, (bd.a0 ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = bd.a0;
        this.d.setLayoutParams(mf.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f));
        boolean z11 = bd.a0;
        this.e.setLayoutParams(mf.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 109.0f, 0.0f, z11 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(mf.d(22, 22.0f, (bd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
