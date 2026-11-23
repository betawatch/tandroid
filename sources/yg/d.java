package yg;

import android.content.Context;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class d extends c {
    public static final /* synthetic */ int w = 0;
    public int s;

    public d(Context context, i6 i6Var) {
        super(context, i6Var);
        this.d.setTypeface(g0.o());
    }

    @Override // yg.c
    public boolean b() {
        return !(this instanceof e);
    }

    @Override // yg.c
    public void d() {
        this.c.setLayoutParams(na.d(40, 40.0f, (gd.a0 ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = gd.a0;
        this.d.setLayoutParams(na.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f));
        boolean z11 = gd.a0;
        this.e.setLayoutParams(na.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 109.0f, 0.0f, z11 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(na.d(22, 22.0f, (gd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
