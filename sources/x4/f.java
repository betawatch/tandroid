package x4;

import android.animation.TypeEvaluator;
import c3.i0;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {
    public static final f a = new f();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f7, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & zs.e4) / 255.0f;
        float f11 = ((intValue >> 16) & zs.e4) / 255.0f;
        float f12 = ((intValue >> 8) & zs.e4) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f13 = ((intValue2 >> 24) & zs.e4) / 255.0f;
        float f14 = ((intValue2 >> 16) & zs.e4) / 255.0f;
        float f15 = ((intValue2 >> 8) & zs.e4) / 255.0f;
        float pow = (float) Math.pow(f11, 2.2d);
        float pow2 = (float) Math.pow(f12, 2.2d);
        float pow3 = (float) Math.pow((intValue & zs.e4) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f14, 2.2d);
        float pow5 = (float) Math.pow(f15, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & zs.e4) / 255.0f, 2.2d);
        float z10 = i0.z(f13, f10, f7, f10);
        float z11 = i0.z(pow4, pow, f7, pow);
        float z12 = i0.z(pow5, pow2, f7, pow2);
        float z13 = i0.z(pow6, pow3, f7, pow3);
        float pow7 = ((float) Math.pow(z11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(z12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(z13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(z10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
