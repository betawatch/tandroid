package v7;

import android.graphics.Path;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class j8 {
    public static boolean a(i0.e[] eVarArr, i0.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            i0.e eVar = eVarArr[i10];
            char c10 = eVar.a;
            i0.e eVar2 = eVarArr2[i10];
            if (c10 != eVar2.a || eVar.b.length != eVar2.b.length) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:35:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i0.e[] c(String str) {
        int i10;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char charAt = str.charAt(i12);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i12++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i13, i12).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i11) == 'z' || trim.charAt(i11) == 'Z') {
                            fArr = new float[i11];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i14 = 1;
                                int i15 = 0;
                                while (i14 < length) {
                                    boolean z10 = false;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    boolean z13 = false;
                                    for (int i16 = i14; i16 < trim.length(); i16++) {
                                        char charAt2 = trim.charAt(i16);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                        break;
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                        if (i16 != i14 && !z10) {
                                                            z10 = false;
                                                            z12 = true;
                                                            z13 = true;
                                                            break;
                                                        }
                                                        z10 = false;
                                                        break;
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                        if (!z11) {
                                                            z10 = false;
                                                            z11 = true;
                                                            break;
                                                        }
                                                        z10 = false;
                                                        z12 = true;
                                                        z13 = true;
                                                        break;
                                                    default:
                                                        z10 = false;
                                                        break;
                                                }
                                            } else {
                                                z10 = true;
                                            }
                                            if (!z12) {
                                                if (i14 < i16) {
                                                    fArr2[i15] = Float.parseFloat(trim.substring(i14, i16));
                                                    i15++;
                                                }
                                                i14 = !z13 ? i16 : i16 + 1;
                                            }
                                        }
                                        z10 = false;
                                        z12 = true;
                                        if (!z12) {
                                        }
                                    }
                                    if (i14 < i16) {
                                    }
                                    if (!z13) {
                                    }
                                }
                                fArr = b(fArr2, i15);
                                i11 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(a4.a.p("error in parsing \"", trim, "\""), e);
                            }
                        }
                        arrayList.add(new i0.e(trim.charAt(i11), fArr));
                    }
                    i13 = i12;
                    i12++;
                    i11 = 0;
                }
                i12++;
            }
            trim = str.substring(i13, i12).trim();
            if (!trim.isEmpty()) {
            }
            i13 = i12;
            i12++;
            i11 = 0;
        }
        if (i12 - i13 != 1 || i13 >= str.length()) {
            i10 = 0;
        } else {
            i10 = 0;
            arrayList.add(new i0.e(str.charAt(i13), new float[0]));
        }
        return (i0.e[]) arrayList.toArray(new i0.e[i10]);
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            i0.e.b(c(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static i0.e[] e(i0.e[] eVarArr) {
        i0.e[] eVarArr2 = new i0.e[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10] = new i0.e(eVarArr[i10]);
        }
        return eVarArr2;
    }
}
