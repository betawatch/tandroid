package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class b implements a {
    public final g6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;

    public b(int i10, g6 g6Var) {
        this(g6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override // rg.a
    public int I() {
        return this.e;
    }

    @Override // rg.a
    public int U() {
        return this.d;
    }

    public boolean a() {
        return AndroidUtilities.computePerceivedBrightness(k6.v0(this.b, this.a)) < 0.721f;
    }

    public final void b() {
        this.d = k6.l1(this.c, k6.v0(this.b, this.a));
        if (a()) {
            this.f = 687865855;
            this.h = 352321535;
            this.e = 0;
        } else {
            this.f = -1;
            this.h = -1;
            this.e = TLObject.FLAG_29;
        }
    }

    @Override // rg.a
    public int k() {
        return this.f;
    }

    @Override // rg.a
    public int x() {
        return this.h;
    }

    public b(g6 g6Var, int i10, float f10) {
        this.a = g6Var;
        this.b = i10;
        this.c = f10;
        b();
    }
}
