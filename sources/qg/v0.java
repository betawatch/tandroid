package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.i) || this.j.position() == this.j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.j.position(i10 * 20);
        }
        this.j.putFloat(pointF.x);
        this.j.putFloat(pointF.y);
        this.j.putFloat(f7);
        this.j.putFloat(f10);
        this.j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.i || this.j == null) {
            d();
        }
        this.h = i11;
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
