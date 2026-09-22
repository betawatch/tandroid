package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class i3 extends g3 {
    public final Paint c;
    public final Matrix d;
    public final RadialGradient e;
    public final int f;
    public final int g;
    public final int h;

    public i3(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.a = stargiftattributebackdrop.name;
        this.b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.e = radialGradient;
        paint.setShader(radialGradient);
        this.g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f = i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
