// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ulc extends ShapeDrawable.ShaderFactory {
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, -765355, -2148011, Shader.TileMode.CLAMP);
    }
}
