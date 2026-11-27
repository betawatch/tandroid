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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class xf1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ xf1(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
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
                m01.u(context, ob6.M0(2131752481, null));
                break;
            case 1:
                aob.J(context, false);
                break;
            case 2:
                new xd5(context).show();
                break;
            case 3:
                ra5.k(context);
                break;
            case 4:
                m01.u(context, ob6.M0(2131744623, null));
                break;
            case 5:
                Activity W = hl.W(context);
                if (W == null) {
                    W = LaunchActivity.H1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    break;
                }
                break;
            case 6:
                (Build.VERSION.SDK_INT >= 28 ? ou8.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new xf1(context, (byte) 7), new Random().nextInt(1000) + 5000);
                break;
            case 7:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new xf1(context, (byte) 8));
                break;
            case 8:
                tgd.b(context, new ic(b2), tgd.a, false);
                break;
            case 9:
                m01.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 10:
                m01.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 11:
                m01.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 12:
                m01.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 13:
                m01.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 14:
                m01.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 15:
                new xd5(context).show();
                break;
            case 16:
                m01.u(context, ob6.M0(2131744623, null));
                break;
            case 17:
                m01.u(context, ob6.M0(2131744623, null));
                break;
            case 18:
                m01.u(context, ob6.M0(2131747461, null));
                break;
            case 19:
                m01.u(context, ob6.M0(2131744676, null));
                break;
            case 20:
                m01.u(context, ob6.M0(2131744623, null));
                break;
            case 21:
                m01.u(context, ob6.M0(2131744701, null));
                break;
            case 22:
                Activity W2 = hl.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, l46.m1(10)));
                    break;
                }
                break;
            case 23:
                Activity W3 = hl.W(context);
                if (W3 instanceof LaunchActivity) {
                    ((LaunchActivity) W3).t0(new PremiumPreviewFragment(0, l46.m1(9)));
                    break;
                }
                break;
            case 24:
                new xd5(context).show();
                break;
            case 25:
                m01.w(context, ob6.M0(2131743849, null), false);
                break;
            case 26:
                m01.w(context, ob6.M0(2131743849, null), false);
                break;
            case 27:
                new wqc(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new kc((byte) 10));
                break;
            case 28:
                m01.u(context, ob6.M0(2131742574, null));
                break;
            default:
                z.d(context);
                break;
        }
    }

    public /* synthetic */ xf1(Context context, byte b) {
        this.a = b;
        this.b = context;
    }
}
