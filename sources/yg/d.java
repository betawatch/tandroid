package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class d extends c {
    public static final /* synthetic */ int w = 0;
    public int s;

    public d(Context context, f6 f6Var) {
        super(context, f6Var);
        this.d.setTypeface(g0.o());
    }

    @Override // yg.c
    public boolean b() {
        return !(this instanceof e);
    }

    @Override // yg.c
    public void d() {
        this.c.setLayoutParams(ha.d(40, 40.0f, (hd.a0 ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z9 = hd.a0;
        this.d.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 20.0f : 109.0f, 0.0f, z9 ? 109.0f : 20.0f, 0.0f));
        boolean z10 = hd.a0;
        this.e.setLayoutParams(ha.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(ha.d(22, 22.0f, (hd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
