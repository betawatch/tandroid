package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o0 {
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

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.i) || this.j.position() == this.j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.j.position(i7 * 20);
        }
        this.j.putFloat(pointF.x);
        this.j.putFloat(pointF.y);
        this.j.putFloat(f10);
        this.j.putFloat(f11);
        this.j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
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
