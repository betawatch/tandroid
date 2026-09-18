package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class m3 {
    public final x3 a;
    public r3 b;
    public r3 c;
    public r3 d;
    public i3 h;
    public i3 i;
    public i3 j;
    public i3 k;
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

    public m3(x3 x3Var) {
        this.a = x3Var;
        x3Var.c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        i3 i3Var = this.h;
        if (i3Var != null) {
            i3Var.a();
        }
        i3 i3Var2 = this.i;
        if (i3Var2 != null) {
            i3Var2.a();
        }
        i3 i3Var3 = this.j;
        if (i3Var3 != null) {
            i3Var3.a();
        }
        i3 i3Var4 = this.k;
        if (i3Var4 != null) {
            i3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new g3(this, 1));
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
            ((k3) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
