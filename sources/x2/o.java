package x2;

import b2.l1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class o {
    public final int a;
    public final l1 b;
    public final int c;
    public final b2.s d;

    public o(int i10, l1 l1Var, int i11) {
        this.a = i10;
        this.b = l1Var;
        this.c = i11;
        this.d = l1Var.d[i11];
    }

    public abstract int a();

    public abstract boolean b(o oVar);
}
