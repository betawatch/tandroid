// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public interface wx0 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z);

    float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2);
}
