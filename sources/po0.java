// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class po0 extends gg0 {
    public static final /* synthetic */ int w = 0;
    public byte s;

    public po0(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.d.setTypeface(gm.o());
    }

    @Override // gg0
    public final boolean b() {
        return !(this instanceof qo0);
    }

    @Override // gg0
    public void d() {
        this.c.setLayoutParams(qoe.d(40, 40.0f, (jb6.a0 ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z = jb6.a0;
        this.d.setLayoutParams(qoe.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 109.0f, 0.0f, z ? 109.0f : 20.0f, 0.0f));
        boolean z2 = jb6.a0;
        this.e.setLayoutParams(qoe.d(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 109.0f, 0.0f, z2 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(qoe.d(22, 22.0f, (jb6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
