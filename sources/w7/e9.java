package w7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class e9 {
    public static boolean a(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            float f7 = fArr[0];
            if (f7 == fArr[1] && f7 == fArr[2] && f7 == fArr[3] && f7 == fArr[4] && f7 == fArr[5] && f7 == fArr[6] && f7 == fArr[7]) {
                return true;
            }
        }
        return false;
    }
}
