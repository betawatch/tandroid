// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class w79 implements x79 {
    public final /* synthetic */ en1 a;
    public final /* synthetic */ u21 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ e53 d;
    public final /* synthetic */ dac e;

    public w79(en1 en1Var, u21 u21Var, Context context, e53 e53Var, dac dacVar) {
        this.a = en1Var;
        this.b = u21Var;
        this.c = context;
        this.d = e53Var;
        this.e = dacVar;
    }

    @Override // x79
    public final void d() {
        gl.e3(new u79(this.a, this.b, this.c, this.d, (byte) 2), 200L);
    }

    @Override // x79
    public final void g() {
        gl.e3(new lw8(this.a, this.b, (byte) 13), 200L);
    }

    @Override // x79
    public final void j() {
        this.e.run();
    }
}
