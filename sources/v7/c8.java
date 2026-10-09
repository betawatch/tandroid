package v7;

import android.graphics.Path;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class c8 {
    public static boolean a(i0.d[] dVarArr, i0.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            i0.d dVar = dVarArr[i10];
            char c10 = dVar.a;
            i0.d dVar2 = dVarArr2[i10];
            if (c10 != dVar2.a || dVar.b.length != dVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i0.d[] c(String str) {
        int i10;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i13 < str.length()) {
            while (i13 < str.length()) {
                char charAt = str.charAt(i13);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i13++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i12, i13).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i11) == 'z' || trim.charAt(i11) == 'Z') {
                            fArr = new float[i11];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i14 = i11;
                                int i15 = 1;
                                while (i15 < length) {
                                    int i16 = i11;
                                    int i17 = i16;
                                    int i18 = i17;
                                    int i19 = i18;
                                    for (int i20 = i15; i20 < trim.length(); i20++) {
                                        char charAt2 = trim.charAt(i20);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                        break;
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                        if (i20 != i15 && i16 == 0) {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                            break;
                                                        }
                                                        i16 = 0;
                                                        break;
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                        if (i17 == 0) {
                                                            i16 = 0;
                                                            i17 = 1;
                                                            break;
                                                        }
                                                        i16 = 0;
                                                        i18 = 1;
                                                        i19 = 1;
                                                        break;
                                                    default:
                                                        i16 = 0;
                                                        break;
                                                }
                                            } else {
                                                i16 = 1;
                                            }
                                            if (i18 == 0) {
                                                if (i15 < i20) {
                                                    fArr2[i14] = Float.parseFloat(trim.substring(i15, i20));
                                                    i14++;
                                                }
                                                i15 = i19 == 0 ? i20 : i20 + 1;
                                                i11 = 0;
                                            }
                                        }
                                        i16 = 0;
                                        i18 = 1;
                                        if (i18 == 0) {
                                        }
                                    }
                                    if (i15 < i20) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    i11 = 0;
                                }
                                fArr = b(fArr2, i14);
                                i11 = 0;
                            } catch (NumberFormatException e7) {
                                throw new RuntimeException(a1.g.q("error in parsing \"", trim, "\""), e7);
                            }
                        }
                        arrayList.add(new i0.d(trim.charAt(i11), fArr));
                    }
                    i12 = i13;
                    i13++;
                    i11 = 0;
                }
                i13++;
            }
            trim = str.substring(i12, i13).trim();
            if (!trim.isEmpty()) {
            }
            i12 = i13;
            i13++;
            i11 = 0;
        }
        if (i13 - i12 != 1 || i12 >= str.length()) {
            i10 = 0;
        } else {
            i10 = 0;
            arrayList.add(new i0.d(str.charAt(i12), new float[0]));
        }
        return (i0.d[]) arrayList.toArray(new i0.d[i10]);
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            i0.d.b(c(str), path);
            return path;
        } catch (RuntimeException e7) {
            throw new RuntimeException("Error in parsing ".concat(str), e7);
        }
    }

    public static i0.d[] e(i0.d[] dVarArr) {
        i0.d[] dVarArr2 = new i0.d[dVarArr.length];
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10] = new i0.d(dVarArr[i10]);
        }
        return dVarArr2;
    }
}
