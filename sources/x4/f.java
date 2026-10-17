package x4;

import android.animation.TypeEvaluator;
import com.google.android.gms.internal.cast.a6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {
    public static final f a = new f();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f7, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f11 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float x10 = a6.x(f11, f10, f7, f10);
        float x11 = a6.x(pow4, pow, f7, pow);
        float x12 = a6.x(pow5, pow2, f7, pow2);
        float x13 = a6.x(pow6, pow3, f7, pow3);
        float pow7 = ((float) Math.pow(x11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(x12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(x13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(x10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
