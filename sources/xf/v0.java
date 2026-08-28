package xf;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public double g;
    public int h;
    public int i;
    public ByteBuffer j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i9) {
        if ((i9 != -1 && i9 >= this.i) || this.j.position() == this.j.limit()) {
            d();
            return false;
        }
        if (i9 != -1) {
            this.j.position(i9 * 20);
        }
        this.j.putFloat(pointF.x);
        this.j.putFloat(pointF.y);
        this.j.putFloat(f10);
        this.j.putFloat(f11);
        this.j.putFloat(f12);
        return true;
    }

    public final void b(int i9) {
        int i10 = this.h + i9;
        if (i10 > this.i || this.j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.j != null) {
            return;
        }
        this.i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.j.position(0);
    }

    public final void d() {
        if (this.j != null) {
            this.j = null;
        }
        int max = Math.max(this.i * 2, 256);
        this.i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.j.position(0);
    }
}
