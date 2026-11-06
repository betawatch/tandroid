package r0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class x {
    public int a;
    public int b;
    public int c;
    public Object d;

    public x() {
        if (qb.a.c == null) {
            qb.a.c = new qb.a(23);
        }
    }

    public int a(int i7) {
        if (i7 < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i7);
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
            View.AccessibilityDelegate d = i0.d(view);
            b bVar = d == null ? null : d instanceof a ? ((a) d).a : new b(d);
            if (bVar == null) {
                bVar = new b();
            }
            i0.j(view, bVar);
            view.setTag(this.a, obj);
            i0.f(this.c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
