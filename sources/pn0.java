// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
