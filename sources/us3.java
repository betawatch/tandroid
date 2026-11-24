// default package

import android.content.Context;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class us3 extends gg0 {
    public final lka s;
    public TLObject w;

    public us3(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.c.setVisibility(8);
        lka lkaVar = this.e;
        int i = cmb.A6;
        anb.W(lkaVar, i, ylbVar);
        lka lkaVar2 = new lka(context);
        this.s = lkaVar2;
        lkaVar2.setTextSize(16);
        anb.W(lkaVar2, i, ylbVar);
        lkaVar2.setGravity(jb6.a0 ? 3 : 5);
        addView(lkaVar2);
        boolean z = jb6.a0;
        lkaVar2.setLayoutParams(qoe.d(-1, -2.0f, (z ? 3 : 5) | 16, z ? 20.0f : 0.0f, 0.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    @Override // gg0
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
