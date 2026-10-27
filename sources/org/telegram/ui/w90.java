package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w90 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ w90(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wc b02;
        int i10 = 0;
        switch (this.a) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 1:
                break;
            case 2:
                CallReceiver.checkLastReceivedCall();
                break;
            case 3:
                CallReceiver.checkLastReceivedCall();
                break;
            case 4:
                org.telegram.ui.Components.wc.Y().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 5:
                org.telegram.ui.Components.wc.Y().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 6:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 7:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null && (b02 = org.telegram.ui.Components.wc.b0(U)) != null) {
                    org.telegram.ui.Components.qc M = b02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.j = 5000;
                    M.j();
                    break;
                }
                break;
            case 8:
                int i11 = p81.d0;
                break;
            case 9:
                org.telegram.ui.ActionBar.y6.N = false;
                org.telegram.ui.ActionBar.y6.E(false);
                break;
            case 10:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Wallet.l0[] l0VarArr = org.telegram.ui.Wallet.l0.O;
                break;
            case 12:
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.wc.b0(U2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    break;
                }
                break;
            case 13:
                CopyOnWriteArrayList copyOnWriteArrayList = org.telegram.ui.Wallet.p0.i;
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
                break;
            case 14:
                boolean z10 = org.telegram.ui.Wallet.n5.j0;
                break;
            case 15:
                int[][] iArr = WallpapersListActivity.g0;
                PhotoViewer.v1().H0(false, false);
                break;
            case 16:
                Utilities.globalQueue.postRunnable(new w90(18));
                break;
            case 17:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1();
                            b1Var.readParams(serializedData, true);
                            arrayList.add(b1Var);
                            longSparseArray.put(b1Var.a, b1Var);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.a6(14, arrayList, longSparseArray));
                break;
            case 18:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.c1.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.c1.c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.b1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.c1.c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.b1) obj2).serializeToStream(serializedData3);
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
            case 19:
                break;
            case 20:
                rg.j0.b();
                break;
            case 21:
                int i13 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 22:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 23:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            case 24:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                break;
            case 25:
                float[] fArr = tg.a2.U;
                break;
            case 26:
                vg.n1.e0(0, null);
                break;
            default:
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                    p2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), p2Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w90(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
