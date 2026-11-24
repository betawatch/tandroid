// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class th0 extends gp4 {
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
                y(R.raw.permission_request_camera, jb6.M0(2131742969, null));
                return true;
            }
            g95 g95Var = g95.s5;
            if (g95Var != null) {
                g95Var.r1.callOnClick();
                return true;
            }
        } else {
            if (i == 4 || i == 151) {
                if (z) {
                    fn5.z().e(null);
                    return true;
                }
                y(R.raw.permission_request_folder, i == 151 ? jb6.M0(2131747034, null) : jb6.M0(2131747032, null));
                return true;
            }
            if (i == 5) {
                if (z) {
                    bw2.r(this.P).l();
                    return true;
                }
                y(R.raw.permission_request_contacts, jb6.M0(2131747039, null));
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
                    y(R.raw.permission_request_camera, jb6.M0(2131747042, null));
                    return true;
                }
                if (!z2) {
                    y(R.raw.permission_request_microphone, jb6.M0(2131747044, null));
                    return true;
                }
                if (!z3) {
                    y(R.raw.permission_request_camera, jb6.M0(2131747041, null));
                    return true;
                }
                if (gda.v0) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i != 18 && i != 19 && i != 20 && i != 22) {
                int i3 = nm7.A4;
                int i4 = nm7.z4;
                if (i == 2) {
                    nm7 e = nm7.e();
                    if (z) {
                        i3 = i4;
                    }
                    e.k(i3, new Object[0]);
                    return true;
                }
                if (i == 211) {
                    nm7 e2 = nm7.e();
                    if (z) {
                        i3 = i4;
                    }
                    e2.k(i3, 1);
                    return true;
                }
            } else if (!z) {
                y(R.raw.permission_request_camera, jb6.M0(2131747041, null));
            }
        }
        return true;
    }

    public final he x(int i, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i2 = cmb.K5;
        alertDialog$Builder.l(i, 72, cmb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        SpannableStringBuilder S2 = gm.S2(str);
        he heVar = alertDialog$Builder.a;
        heVar.U = S2;
        alertDialog$Builder.j(jb6.M0(2131747033, null), new xg0(this, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
        return heVar;
    }

    public final void y(int i, String str) {
        x(i, str).show();
    }
}
