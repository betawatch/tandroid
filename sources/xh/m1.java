package xh;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class m1 {
    public NinePatchDrawable b;
    public NinePatchDrawable d;
    public NinePatchDrawable f;
    public final float[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final Bitmap[] a = new Bitmap[1];
    public final Bitmap[] c = new Bitmap[1];
    public final Bitmap[] e = new Bitmap[1];

    public m1() {
        float[] fArr = new float[8];
        this.g = fArr;
        Arrays.fill(fArr, AndroidUtilities.dp(11.0f));
    }
}
