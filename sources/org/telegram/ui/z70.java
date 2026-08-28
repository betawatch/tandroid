package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;

    public /* synthetic */ z70(LaunchActivity launchActivity, int i9, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File directory;
        int i9 = this.a;
        int i10 = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                if (UserConfig.getInstance(launchActivity.K).isClientActivated()) {
                    try {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.s1 - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                            StatFs statFs = new StatFs(directory.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.s1 = System.currentTimeMillis();
                                }
                                globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                AndroidUtilities.runOnUIThread(new l80(launchActivity, 6));
                                break;
                            }
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
                ConnectionsManager.getInstance(launchActivity.K).cancelRequest(i10, true);
                break;
        }
    }
}
