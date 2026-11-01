package wf;

import android.graphics.Matrix;
import android.graphics.RectF;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c {
    public final RectF a;
    public final Matrix b;

    public c(RectF rectF, Matrix matrix) {
        this.a = rectF;
        this.b = matrix;
    }

    public static c a(SerializedData serializedData) {
        float readFloat = serializedData.readFloat(true);
        float readFloat2 = serializedData.readFloat(true);
        float readFloat3 = serializedData.readFloat(true);
        float readFloat4 = serializedData.readFloat(true);
        float[] fArr = {serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true)};
        RectF rectF = new RectF(readFloat, readFloat2, readFloat3 + readFloat, readFloat4 + readFloat2);
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return new c(rectF, matrix);
    }
}
