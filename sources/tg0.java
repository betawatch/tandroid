// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class tg0 extends en4 {
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
                y(R.raw.permission_request_camera, k96.M0(2131743043, null));
                return true;
            }
            h75 h75Var = h75.s5;
            if (h75Var != null) {
                h75Var.r1.callOnClick();
                return true;
            }
        } else {
            if (i == 4 || i == 151) {
                if (z) {
                    fl5.z().e(null);
                    return true;
                }
                y(R.raw.permission_request_folder, i == 151 ? k96.M0(2131747108, null) : k96.M0(2131747106, null));
                return true;
            }
            if (i == 5) {
                if (z) {
                    qu2.r(this.P).l();
                    return true;
                }
                y(R.raw.permission_request_contacts, k96.M0(2131747113, null));
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
                    y(R.raw.permission_request_camera, k96.M0(2131747116, null));
                    return true;
                }
                if (!z2) {
                    y(R.raw.permission_request_microphone, k96.M0(2131747118, null));
                    return true;
                }
                if (!z3) {
                    y(R.raw.permission_request_camera, k96.M0(2131747115, null));
                    return true;
                }
                if (gba.v0) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i != 18 && i != 19 && i != 20 && i != 22) {
                int i3 = kk7.y4;
                int i4 = kk7.x4;
                if (i == 2) {
                    kk7 e = kk7.e();
                    if (z) {
                        i3 = i4;
                    }
                    e.k(i3, new Object[0]);
                    return true;
                }
                if (i == 211) {
                    kk7 e2 = kk7.e();
                    if (z) {
                        i3 = i4;
                    }
                    e2.k(i3, 1);
                    return true;
                }
            } else if (!z) {
                y(R.raw.permission_request_camera, k96.M0(2131747115, null));
            }
        }
        return true;
    }

    public final hd x(int i, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i2 = bkb.K5;
        alertDialog$Builder.l(i, 72, bkb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        SpannableStringBuilder T2 = gl.T2(str);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = T2;
        alertDialog$Builder.j(k96.M0(2131747107, null), new sg0(this, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        return hdVar;
    }

    public final void y(int i, String str) {
        x(i, str).show();
    }
}
