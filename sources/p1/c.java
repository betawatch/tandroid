package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class c {
    public int a;
    public int b;
    public int c;
    public Object d;

    public c() {
        if (hb.a.b == null) {
            hb.a.b = new hb.a(17);
        }
    }

    public int a(int i10) {
        if (i10 < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = h0.d(view);
            r0.b bVar = d == null ? null : d instanceof r0.a ? ((r0.a) d).a : new r0.b(d);
            if (bVar == null) {
                bVar = new r0.b();
            }
            h0.j(view, bVar);
            view.setTag(this.a, obj);
            h0.f(this.c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
