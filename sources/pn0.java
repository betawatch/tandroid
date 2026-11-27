// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class pn0 extends if0 {
    public static final /* synthetic */ int w = 0;
    public byte s;

    public pn0(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.d.setTypeface(hl.o());
    }

    @Override // if0
    public final boolean b() {
        return !(this instanceof qn0);
    }

    @Override // if0
    public void d() {
        this.c.setLayoutParams(tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z = ob6.a0;
        this.d.setLayoutParams(tre.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 109.0f, 0.0f, z ? 109.0f : 20.0f, 0.0f));
        boolean z2 = ob6.a0;
        this.e.setLayoutParams(tre.d(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 109.0f, 0.0f, z2 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(tre.d(22, 22.0f, (ob6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
