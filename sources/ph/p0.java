package ph;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.e30;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p0(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 3;
        Context context = this.b;
        switch (i10) {
            case 0:
                new e30(context).show();
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? r4.f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new p0(context, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new p0(context, i11));
                break;
            case 3:
                r4.d.s(context, new a3.b(i11), r4.d.a, false);
                break;
            case 4:
                new e30(context).show();
                break;
            case 5:
                gf.f.r(context, cd.L0(2131744984, null));
                break;
            case 6:
                gf.f.r(context, cd.L0(2131744984, null));
                break;
            case 7:
                gf.f.r(context, cd.L0(2131747750, null));
                break;
            case 8:
                gf.f.r(context, cd.L0(2131745037, null));
                break;
            case 9:
                gf.f.r(context, cd.L0(2131744984, null));
                break;
            case 10:
                gf.f.r(context, cd.L0(2131745062, null));
                break;
            case 11:
                new e30(context).show();
                break;
            default:
                gf.f.r(context, cd.L0(2131752506, null));
                break;
        }
    }

    public /* synthetic */ p0(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 1;
        this.b = context;
    }
}
