package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;

    public /* synthetic */ t80(LaunchActivity launchActivity, int i10, int i11) {
        this.a = i11;
        this.b = launchActivity;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File z10;
        int i10 = this.a;
        int i11 = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(launchActivity.O).cancelRequest(i11, true);
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                if (org.telegram.messenger.d20.i(launchActivity.O).p()) {
                    try {
                        SharedPreferences d12 = org.telegram.messenger.vp.d1();
                        int i12 = 2;
                        if ((((i11 == 2 || i11 == 1) && Math.abs(launchActivity.y1 - System.currentTimeMillis()) > 240000) || Math.abs(d12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z10 = org.telegram.messenger.b8.z(4)) != null) {
                            StatFs statFs = new StatFs(z10.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i11 > 0 || availableBlocksLong < 52428800) {
                                if (i11 > 0) {
                                    launchActivity.y1 = System.currentTimeMillis();
                                }
                                d12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.i0.g3(new q70(launchActivity, i12));
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
