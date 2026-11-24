// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        gl.d3(new u79(this.a, this.b, this.c, this.d, (byte) 2), 200L);
    }

    @Override // x79
    public final void g() {
        gl.d3(new lw8(this.a, this.b, (byte) 13), 200L);
    }

    @Override // x79
    public final void j() {
        this.e.run();
    }
}
