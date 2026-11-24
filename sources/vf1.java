// default package

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class vf1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ vf1(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = (byte) 6;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Context context = this.b;
        switch (b) {
            case 0:
                d01.t(context, k96.M0(2131752494, null));
                break;
            case 1:
                bkb.J(context, false);
                break;
            case 2:
                new wb5(context).show();
                break;
            case 3:
                o85.k(context);
                break;
            case 4:
                d01.t(context, k96.M0(2131744729, null));
                break;
            case 5:
                Activity W = gl.W(context);
                if (W == null) {
                    W = LaunchActivity.H1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    break;
                }
                break;
            case 6:
                (Build.VERSION.SDK_INT >= 28 ? er8.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new vf1(context, (byte) 7), new Random().nextInt(1000) + 5000);
                break;
            case 7:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new vf1(context, (byte) 8));
                break;
            case 8:
                acd.b(context, new hc(b2), acd.a, false);
                break;
            case 9:
                d01.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 10:
                d01.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 11:
                d01.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 12:
                d01.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 13:
                d01.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 14:
                d01.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 15:
                new wb5(context).show();
                break;
            case 16:
                d01.t(context, k96.M0(2131744729, null));
                break;
            case 17:
                d01.t(context, k96.M0(2131744729, null));
                break;
            case 18:
                d01.t(context, k96.M0(2131747541, null));
                break;
            case 19:
                d01.t(context, k96.M0(2131744782, null));
                break;
            case 20:
                d01.t(context, k96.M0(2131744729, null));
                break;
            case 21:
                d01.t(context, k96.M0(2131744807, null));
                break;
            case 22:
                Activity W2 = gl.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, h26.l1(10)));
                    break;
                }
                break;
            case 23:
                Activity W3 = gl.W(context);
                if (W3 instanceof LaunchActivity) {
                    ((LaunchActivity) W3).t0(new PremiumPreviewFragment(0, h26.l1(9)));
                    break;
                }
                break;
            case 24:
                new wb5(context).show();
                break;
            case 25:
                d01.v(context, k96.M0(2131743955, null), false);
                break;
            case 26:
                d01.v(context, k96.M0(2131743955, null), false);
                break;
            case 27:
                new jmc(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new jc((byte) 10));
                break;
            case 28:
                d01.t(context, k96.M0(2131742680, null));
                break;
            default:
                z.d(context);
                break;
        }
    }

    public /* synthetic */ vf1(Context context, byte b) {
        this.a = b;
        this.b = context;
    }
}
