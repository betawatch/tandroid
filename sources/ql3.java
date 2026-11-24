// default package

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.BatteryManager;
import android.os.Looper;
import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.JobIntentService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ql3 implements Runnable {
    public final /* synthetic */ byte a;

    public /* synthetic */ ql3(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ce  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = 0;
        switch (this.a) {
            case 0:
                vl3[] vl3VarArr = DictationAsr.a;
                ArrayList arrayList = new ArrayList(DictationAsr.g);
                int size = arrayList.size();
                while (b < size) {
                    ((Runnable) arrayList.get(b)).run();
                    b++;
                }
                return;
            case 1:
                DictationAsr.a0(true);
                return;
            case 2:
                DictationLid.b();
                return;
            case 3:
                return;
            case 4:
                kk7.e().k(kk7.k4, new Object[0]);
                return;
            case 5:
                gba.z1 = !gba.z1;
                a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", gba.z1);
                gl.c0(LaunchActivity.H1.y0.getRootView(), new bm0((byte) 12));
                return;
            case 6:
                String str = "Dark Blue";
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (bkb.O0(string) == null || bkb.O0(string).o()) {
                    string = "Blue";
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (bkb.O0(string2) == null || !bkb.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                akb akbVar = bkb.I;
                if (!string.equals(string2)) {
                    str = string2;
                } else if (akbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                    str = string2;
                    gl.d3(new bj4(bkb.I.o() ? bkb.O0(str) : bkb.O0(str2), b), 200L);
                    return;
                }
                str2 = string;
                gl.d3(new bj4(bkb.I.o() ? bkb.O0(str) : bkb.O0(str2), b), 200L);
                return;
            case 7:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    ag0 ag0Var = new ag0();
                    ag0Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), ag0Var);
                    return;
                }
                return;
            case 8:
                d S = LaunchActivity.S();
                if (S != null) {
                    m21 I = u21.b0(S).I(R.raw.contact_check, k96.M0(2131742948, null), k96.M0(2131742946, null));
                    I.j = 5000;
                    I.j();
                    return;
                }
                return;
            case 9:
                CopyOnWriteArrayList copyOnWriteArrayList = g15.j;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        runnable.run();
                    }
                }
                return;
            case 10:
                h75 h75Var = h75.s5;
                if (h75Var != null) {
                    h75Var.show();
                    return;
                }
                return;
            case 11:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 12:
                kk7.e().k(kk7.E2, new Object[0]);
                return;
            case 13:
                if (VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute()) {
                    return;
                }
                VoIPService.getSharedInstance().setMicMute(false, true, false);
                return;
            case 14:
                a95.d();
                return;
            case 15:
                return;
            case 16:
                KeepAliveJob.a();
                return;
            case 17:
                if (KeepAliveJob.b || KeepAliveJob.a != null) {
                    return;
                }
                try {
                    if (w01.a) {
                        fa4.b("starting keep-alive job");
                    }
                    synchronized (KeepAliveJob.c) {
                        KeepAliveJob.b = true;
                    }
                    JobIntentService.enqueueWork(a.b, KeepAliveJob.class, 1000, new Intent());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 18:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 19:
                String str3 = LaunchActivity.C1;
                a.F = false;
                a.H = System.currentTimeMillis();
                return;
            case 20:
                return;
            case 21:
                int i = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) a.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
                e66.l = SystemClock.elapsedRealtime();
                e66.m = false;
                if (i < 0 || i > 100) {
                    return;
                }
                e66.l = SystemClock.elapsedRealtime();
                if (e66.k != i) {
                    e66.k = i;
                    gl.c3(new ql3((byte) 22));
                    return;
                }
                return;
            case 22:
                e66.d(false);
                return;
            case 23:
                kk7.e().k(kk7.z4, new Object[0]);
                return;
            case 24:
                kk7.e().k(kk7.G4, new Object[0]);
                return;
            case 25:
                int i2 = LocationSharingService.d;
                for (int i3 = 0; i3 < 4; i3++) {
                    eb6.f(i3).t();
                }
                return;
            case 26:
                return;
            case 27:
                CallReceiver.a();
                return;
            case 28:
                CallReceiver.a();
                return;
            default:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ql3(View view, m46 m46Var, ClickableSpan clickableSpan, byte b) {
        this.a = b;
    }

    public /* synthetic */ ql3(Object obj, byte b) {
        this.a = b;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
