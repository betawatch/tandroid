// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class tnc extends ShapeDrawable.ShaderFactory {
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, -765355, -2148011, Shader.TileMode.CLAMP);
    }
}
