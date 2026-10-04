package w7;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
