// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zf5 {
    public final TextPaint a;
    public final float b;
    public final HashMap c;
    public final RectF d;
    public final RectF e;
    public final Paint f;
    public final ArrayList g;
    public final float h;

    public zf5() {
        float f;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = 1.0f;
        this.c = new HashMap();
        this.d = new RectF();
        this.e = new RectF();
        Paint paint = new Paint();
        this.f = paint;
        this.g = new ArrayList();
        this.h = 1000.0f / hl.r;
        textPaint.setTypeface(hl.o());
        textPaint.setColor(-1);
        int o = xea.o();
        if (o == 0) {
            f = 0.25f;
            this.b = 0.25f;
        } else if (o != 1) {
            f = 0.75f;
            this.b = 0.75f;
        } else {
            f = 0.5f;
            this.b = 0.5f;
        }
        textPaint.setTextSize(hl.L(f * 24.0f));
        paint.setColor(-1);
    }
}
