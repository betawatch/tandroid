package xh;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class n1 {
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

    public n1() {
        float[] fArr = new float[8];
        this.g = fArr;
        Arrays.fill(fArr, AndroidUtilities.dp(11.0f));
    }
}
