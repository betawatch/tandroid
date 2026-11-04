package tg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n0 {
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

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i3) {
        if ((i3 != -1 && i3 >= this.i) || this.j.position() == this.j.limit()) {
            d();
            return false;
        }
        if (i3 != -1) {
            this.j.position(i3 * 20);
        }
        this.j.putFloat(pointF.x);
        this.j.putFloat(pointF.y);
        this.j.putFloat(f10);
        this.j.putFloat(f11);
        this.j.putFloat(f12);
        return true;
    }

    public final void b(int i3) {
        int i10 = this.h + i3;
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
