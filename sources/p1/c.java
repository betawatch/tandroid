package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c {
    public int a;
    public int b;
    public int c;
    public Object d;

    public c() {
        if (wa.a.b == null) {
            wa.a.b = new wa.a(20);
        }
    }

    public int a(int i9) {
        if (i9 < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i9);
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
            View.AccessibilityDelegate d = j0.d(view);
            r0.b bVar = d == null ? null : d instanceof r0.a ? ((r0.a) d).a : new r0.b(d);
            if (bVar == null) {
                bVar = new r0.b();
            }
            j0.k(view, bVar);
            view.setTag(this.a, obj);
            j0.g(this.c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
