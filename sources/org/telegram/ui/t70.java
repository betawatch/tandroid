package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;

    public /* synthetic */ t70(LaunchActivity launchActivity, int i7, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File z9;
        int i7 = this.a;
        int i10 = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(launchActivity.O).cancelRequest(i10, true);
                break;
            default:
                String str2 = LaunchActivity.B1;
                if (org.telegram.messenger.p10.i(launchActivity.O).p()) {
                    try {
                        SharedPreferences e12 = org.telegram.messenger.qp.e1();
                        int i11 = 2;
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.w1 - System.currentTimeMillis()) > 240000) || Math.abs(e12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z9 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z9.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.w1 = System.currentTimeMillis();
                                }
                                e12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.h3(new s60(launchActivity, i11));
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
