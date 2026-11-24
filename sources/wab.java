// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wab extends ld5 {
    public final hn r;

    public wab(Context context, wjb wjbVar) {
        super(context, wjbVar);
        hn hnVar = new hn(context, true, true, true);
        this.r = hnVar;
        hnVar.b(0.45f, 240L, s33.h);
        hnVar.setGravity(k96.a0 ? 3 : 5);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTypeface(gl.o());
        zkb.U(hnVar, bkb.K6, wjbVar);
        addView(hnVar, nme.d(-2, 24.0f, (k96.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        zkb.h(bkb.g5, wjbVar, this);
    }
}
