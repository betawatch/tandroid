package x4;

import android.animation.TypeEvaluator;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        float y3 = e2.y(f11, f10, f7, f10);
        float y10 = e2.y(pow4, pow, f7, pow);
        float y11 = e2.y(pow5, pow2, f7, pow2);
        float y12 = e2.y(pow6, pow3, f7, pow3);
        float pow7 = ((float) Math.pow(y10, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(y11, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(y12, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(y3 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
