// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class ug0 extends jp4 {
    public int P = -1;

    public final boolean w(int i, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z = iArr.length > 0 && iArr[0] == 0;
        if (i == 104) {
            if (!z) {
                y(R.raw.permission_request_camera, ob6.M0(2131742937, null));
                return true;
            }
            j95 j95Var = j95.s5;
            if (j95Var != null) {
                j95Var.r1.callOnClick();
                return true;
            }
        } else {
            if (i == 4 || i == 151) {
                if (z) {
                    in5.z().e(null);
                    return true;
                }
                y(R.raw.permission_request_folder, i == 151 ? ob6.M0(2131747028, null) : ob6.M0(2131747026, null));
                return true;
            }
            if (i == 5) {
                if (z) {
                    lv2.r(this.P).l();
                    return true;
                }
                y(R.raw.permission_request_contacts, ob6.M0(2131747033, null));
                return false;
            }
            if (i == 3 || i == 150) {
                int min = Math.min(strArr.length, iArr.length);
                boolean z2 = true;
                boolean z3 = true;
                for (int i2 = 0; i2 < min; i2++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i2])) {
                        z2 = iArr[i2] == 0;
                    } else if ("android.permission.CAMERA".equals(strArr[i2])) {
                        z3 = iArr[i2] == 0;
                    }
                }
                if (i == 150 && (!z2 || !z3)) {
                    y(R.raw.permission_request_camera, ob6.M0(2131747036, null));
                    return true;
                }
                if (!z2) {
                    y(R.raw.permission_request_microphone, ob6.M0(2131747038, null));
                    return true;
                }
                if (!z3) {
                    y(R.raw.permission_request_camera, ob6.M0(2131747035, null));
                    return true;
                }
                if (xea.v0) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i != 18 && i != 19 && i != 20 && i != 22) {
                int i3 = jn7.z4;
                int i4 = jn7.y4;
                if (i == 2) {
                    jn7 e = jn7.e();
                    if (z) {
                        i3 = i4;
                    }
                    e.k(i3, new Object[0]);
                    return true;
                }
                if (i == 211) {
                    jn7 e2 = jn7.e();
                    if (z) {
                        i3 = i4;
                    }
                    e2.k(i3, 1);
                    return true;
                }
            } else if (!z) {
                y(R.raw.permission_request_camera, ob6.M0(2131747035, null));
            }
        }
        return true;
    }

    public final id x(int i, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i2 = aob.L5;
        alertDialog$Builder.l(i, 72, aob.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        SpannableStringBuilder S2 = hl.S2(str);
        id idVar = alertDialog$Builder.a;
        idVar.U = S2;
        alertDialog$Builder.j(ob6.M0(2131747027, null), new tg0(this, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
        return idVar;
    }

    public final void y(int i, String str) {
        x(i, str).show();
    }
}
