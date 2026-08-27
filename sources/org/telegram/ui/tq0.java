package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ tq0(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.mc a02;
        int i10 = 4;
        int i11 = 0;
        switch (this.a) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                break;
            case 1:
                org.telegram.ui.Components.mc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 2:
                org.telegram.ui.Components.mc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && (a02 = org.telegram.ui.Components.mc.a0(U)) != null) {
                    org.telegram.ui.Components.ec M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.j = 5000;
                    M.j();
                    break;
                }
                break;
            case 4:
                int i12 = i81.Z;
                break;
            case 5:
                org.telegram.ui.ActionBar.g6.N = false;
                org.telegram.ui.ActionBar.g6.E(false);
                break;
            case 6:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 7:
                int[][] iArr = WallpapersListActivity.g0;
                PhotoViewer.t1().G0(false, false);
                break;
            case 8:
                Utilities.globalQueue.postRunnable(new tq0(10));
                break;
            case 9:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1();
                            a1Var.readParams(serializedData, true);
                            arrayList.add(a1Var);
                            longSparseArray.put(a1Var.a, a1Var);
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                AndroidUtilities.runOnUIThread(new zh1(i10, arrayList, longSparseArray));
                break;
            case 10:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.b1.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.b1.c;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        ((org.telegram.ui.web.a1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.b1.c;
                    int size3 = arrayList3.size();
                    while (i11 < size3) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((org.telegram.ui.web.a1) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 11:
            case 12:
                break;
            case 13:
                int i14 = ph.g.B;
                break;
            case 14:
                qf.q1[] q1VarArr = qf.q1.g;
                break;
            case 15:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.C1.v0.getRootView(), new j4.w0(18));
                break;
            case 16:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                if (string.equals(string2)) {
                    if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new qf.b(org.telegram.ui.ActionBar.g6.I.q() ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str), 16), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new qf.b(org.telegram.ui.ActionBar.g6.I.q() ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str), 16), 200L);
                break;
            case 17:
                yf.i0.b();
                break;
            case 18:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 19:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                break;
        }
    }

    public /* synthetic */ tq0(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
