package sg;

import android.graphics.RectF;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c {
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
    public final long d = Utilities.random.nextLong();

    public c(int i10, long j10) {
        this.a = i10;
        this.b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f9 = this.k;
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = f9 == 0.0f ? MediaDataController.MAX_STYLE_RUNS_COUNT : Math.round((this.j / f9) * 1000.0f);
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f9 = this.j;
        if (f9 == 0.0f) {
            return 0;
        }
        float f10 = this.l;
        float f11 = this.m;
        if (f10 > f11) {
            return 0;
        }
        return Math.round(((f11 - f10) / f9) * 1000.0f);
    }
}
