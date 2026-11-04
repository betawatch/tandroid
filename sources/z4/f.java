package z4;

import android.animation.TypeEvaluator;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {
    public static final f a = new f();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((intValue >> 24) & hs.e4) / 255.0f;
        float f12 = ((intValue >> 16) & hs.e4) / 255.0f;
        float f13 = ((intValue >> 8) & hs.e4) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f14 = ((intValue2 >> 24) & hs.e4) / 255.0f;
        float f15 = ((intValue2 >> 16) & hs.e4) / 255.0f;
        float f16 = ((intValue2 >> 8) & hs.e4) / 255.0f;
        float pow = (float) Math.pow(f12, 2.2d);
        float pow2 = (float) Math.pow(f13, 2.2d);
        float pow3 = (float) Math.pow((intValue & hs.e4) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f15, 2.2d);
        float pow5 = (float) Math.pow(f16, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & hs.e4) / 255.0f, 2.2d);
        float y9 = com.google.android.recaptcha.internal.a.y(f14, f11, f10, f11);
        float y10 = com.google.android.recaptcha.internal.a.y(pow4, pow, f10, pow);
        float y11 = com.google.android.recaptcha.internal.a.y(pow5, pow2, f10, pow2);
        float y12 = com.google.android.recaptcha.internal.a.y(pow6, pow3, f10, pow3);
        float pow7 = ((float) Math.pow(y10, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(y11, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(y12, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(y9 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
