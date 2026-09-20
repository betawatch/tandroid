package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class k3 {
    public final v3 a;
    public p3 b;
    public p3 c;
    public p3 d;
    public g3 h;
    public g3 i;
    public g3 j;
    public g3 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public b1 r;
    public b1 s;
    public float t;
    public boolean u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public float n = 0.0f;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;

    public k3(v3 v3Var) {
        this.a = v3Var;
        v3Var.c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        g3 g3Var = this.h;
        if (g3Var != null) {
            g3Var.a();
        }
        g3 g3Var2 = this.i;
        if (g3Var2 != null) {
            g3Var2.a();
        }
        g3 g3Var3 = this.j;
        if (g3Var3 != null) {
            g3Var3.a();
        }
        g3 g3Var4 = this.k;
        if (g3Var4 != null) {
            g3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new e3(this, 1));
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i3) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
