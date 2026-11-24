// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xcb extends jf5 {
    public final io r;

    public xcb(Context context, ylb ylbVar) {
        super(context, ylbVar);
        io ioVar = new io(context, true, true, true);
        this.r = ioVar;
        ioVar.b(0.45f, 240L, d53.h);
        ioVar.setGravity(jb6.a0 ? 3 : 5);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTypeface(gm.o());
        anb.U(ioVar, cmb.K6, ylbVar);
        addView(ioVar, qoe.d(-2, 24.0f, (jb6.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        anb.h(cmb.g5, ylbVar, this);
    }
}
