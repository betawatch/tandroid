package qh;

import android.graphics.PointF;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class k5 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public k5(String str, PointF[] pointFArr) {
        this.a = str;
        this.b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
