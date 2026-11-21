package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;

    public /* synthetic */ u70(LaunchActivity launchActivity, int i7, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File z10;
        int i7 = this.a;
        int i10 = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(launchActivity.P).cancelRequest(i10, true);
                break;
            default:
                String str2 = LaunchActivity.C1;
                if (org.telegram.messenger.j10.i(launchActivity.P).p()) {
                    try {
                        SharedPreferences g12 = org.telegram.messenger.mp.g1();
                        int i11 = 2;
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.x1 - System.currentTimeMillis()) > 240000) || Math.abs(g12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z10 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z10.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.x1 = System.currentTimeMillis();
                                }
                                g12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.g3(new t60(launchActivity, i11));
                                break;
                            }
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
        }
    }
}
