// default package

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.provider.Settings;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vm9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ on9 b;

    public /* synthetic */ vm9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.e();
                break;
            case 1:
                LaunchActivity launchActivity = on9Var.a;
                Typeface typeface = gl.a;
                if (Settings.canDrawOverlays(launchActivity) && !sn9.c()) {
                    sn9.d(launchActivity);
                    break;
                }
                break;
            case 2:
                TextView textView = on9Var.x;
                if (!on9Var.u0 && !on9Var.J0) {
                    if (hc2.w(14, on9Var.d)) {
                        textView.setText(gl.S2(k96.M0(2131747971, null)));
                    } else {
                        TLRPC.Chat chat = on9Var.d;
                        textView.setText(k96.a0(null, null, 2131747970, chat != null ? chat.title : ""));
                    }
                    on9Var.w.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    ug8.s(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
            case 3:
                if (!on9Var.J0) {
                    gl.d3(on9Var.N0, 2000L);
                    if (on9Var.u0 && !on9Var.T && !on9Var.I0 && on9Var.s0 && e66.e(512) && (bitmap = on9Var.n.getBitmap(4, 4)) != null) {
                        int b2 = on9.b(0, bitmap);
                        int b3 = on9.b(2, bitmap);
                        bitmap.recycle();
                        int i = on9Var.z0;
                        int i2 = on9Var.A0;
                        if (i != b2 || i2 != b3) {
                            if (i == 0) {
                                i = b2 & 16777215;
                            }
                            on9Var.B0 = i;
                            if (i2 == 0) {
                                i2 = b3 & 16777215;
                            }
                            on9Var.C0 = i2;
                            on9Var.D0 = b2;
                            on9Var.E0 = b3;
                            on9Var.F0 = SystemClock.uptimeMillis();
                            break;
                        }
                    }
                }
                break;
            case 4:
                on9Var.q();
                break;
            case 5:
                on9Var.dismiss();
                break;
            case 6:
                on9Var.a0 = false;
                on9Var.k(!on9Var.n0, true);
                break;
            case 7:
                if (!on9Var.K.I) {
                    on9Var.k(false, true);
                    break;
                } else {
                    on9Var.j();
                    break;
                }
            default:
                on9 on9Var2 = on9.Q0;
                on9Var.u();
                break;
        }
    }
}
