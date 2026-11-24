// default package

import android.graphics.Color;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qc {
    public final float a;
    public final hi2 b;
    public final hi2 c;

    public qc(float f) {
        this.a = f;
        this.b = a(10.0f * f, new pc(f, (byte) 0));
        this.c = a(4.0f * f, new pc(f, (byte) 1));
    }

    public static hi2 a(float f, pc pcVar) {
        float pow;
        float[] fArr = new float[32];
        int[] iArr = new int[32];
        for (int i = 0; i < 32; i++) {
            fArr[i] = (i * f) / 31.0f;
            switch (pcVar.a) {
                case 0:
                    pow = (float) Math.pow(Math.max(0.0d, 1.0d - (r4 / (pcVar.b * 10.0f))), 2.2d);
                    break;
                default:
                    pow = (((float) Math.exp((-r4) / (pcVar.b * 0.9f))) - 0.011743626f) / 0.9882564f;
                    break;
            }
            iArr[i] = Color.argb(Math.round(Utilities.i(pow, 1.0f, 0.0f) * 255.0f), nm7.d4, nm7.d4, nm7.d4);
        }
        return new hi2(fArr, iArr, (byte) 4);
    }
}
