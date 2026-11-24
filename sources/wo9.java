// default package

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.provider.Settings;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wo9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pp9 b;

    public /* synthetic */ wo9(pp9 pp9Var, byte b) {
        this.a = b;
        this.b = pp9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        byte b = this.a;
        pp9 pp9Var = this.b;
        switch (b) {
            case 0:
                pp9Var.e();
                break;
            case 1:
                LaunchActivity launchActivity = pp9Var.a;
                Typeface typeface = gm.a;
                if (Settings.canDrawOverlays(launchActivity) && !tp9.d()) {
                    tp9.f(launchActivity);
                    break;
                }
                break;
            case 2:
                TextView textView = pp9Var.x;
                if (!pp9Var.u0 && !pp9Var.J0) {
                    if (sd2.w(14, pp9Var.d)) {
                        textView.setText(gm.S2(jb6.M0(2131747897, null)));
                    } else {
                        TLRPC.Chat chat = pp9Var.d;
                        textView.setText(jb6.a0(null, null, 2131747896, chat != null ? chat.title : ""));
                    }
                    pp9Var.w.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    wi8.s(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
            case 3:
                if (!pp9Var.J0) {
                    gm.d3(pp9Var.N0, 2000L);
                    if (pp9Var.u0 && !pp9Var.T && !pp9Var.I0 && pp9Var.s0 && e86.e(512) && (bitmap = pp9Var.n.getBitmap(4, 4)) != null) {
                        int b2 = pp9.b(0, bitmap);
                        int b3 = pp9.b(2, bitmap);
                        bitmap.recycle();
                        int i = pp9Var.z0;
                        int i2 = pp9Var.A0;
                        if (i != b2 || i2 != b3) {
                            if (i == 0) {
                                i = b2 & 16777215;
                            }
                            pp9Var.B0 = i;
                            if (i2 == 0) {
                                i2 = b3 & 16777215;
                            }
                            pp9Var.C0 = i2;
                            pp9Var.D0 = b2;
                            pp9Var.E0 = b3;
                            pp9Var.F0 = SystemClock.uptimeMillis();
                            break;
                        }
                    }
                }
                break;
            case 4:
                pp9Var.q();
                break;
            case 5:
                pp9Var.dismiss();
                break;
            case 6:
                pp9Var.a0 = false;
                pp9Var.k(!pp9Var.n0, true);
                break;
            case 7:
                if (!pp9Var.K.I) {
                    pp9Var.k(false, true);
                    break;
                } else {
                    pp9Var.j();
                    break;
                }
            default:
                pp9 pp9Var2 = pp9.Q0;
                pp9Var.u();
                break;
        }
    }
}
