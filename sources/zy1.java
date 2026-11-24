// default package

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zy1 {
    public final int a;
    public final long b;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public final RectF c = new RectF();
    public float j = 0.0f;
    public float k = 0.0f;
    public float l = Float.MAX_VALUE;
    public float m = 0.0f;
    public final long d = Utilities.b.nextLong();

    public zy1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f = this.k;
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = f == 0.0f ? 1000 : Math.round((this.j / f) * 1000.0f);
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f = this.j;
        if (f == 0.0f) {
            return 0;
        }
        float f2 = this.l;
        float f3 = this.m;
        if (f2 <= f3) {
            return Math.round(((f3 - f2) / f) * 1000.0f);
        }
        return 0;
    }
}
