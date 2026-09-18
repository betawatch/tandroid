package xh;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
