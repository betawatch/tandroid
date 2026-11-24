// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class pn0 extends gf0 {
    public static final /* synthetic */ int w = 0;
    public byte s;

    public pn0(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.d.setTypeface(gl.o());
    }

    @Override // gf0
    public final boolean b() {
        return !(this instanceof qn0);
    }

    @Override // gf0
    public void d() {
        this.c.setLayoutParams(nme.d(40, 40.0f, (k96.a0 ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z = k96.a0;
        this.d.setLayoutParams(nme.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 109.0f, 0.0f, z ? 109.0f : 20.0f, 0.0f));
        boolean z2 = k96.a0;
        this.e.setLayoutParams(nme.d(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 109.0f, 0.0f, z2 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(nme.d(22, 22.0f, (k96.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
