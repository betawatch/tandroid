package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ f2(j2 j2Var, int i10) {
        this.a = i10;
        this.b = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final j2 j2Var = this.b;
                if (!j2Var.d) {
                    j2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (i2 i2Var : j2Var.a.values()) {
                        if (!TextUtils.isEmpty(i2Var.b) && currentTimeMillis - i2Var.a <= 604800000) {
                            arrayList.add(0, i2Var);
                            if (arrayList.size() >= 100) {
                                final int i10 = 1;
                                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.g2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                j2 j2Var2 = j2Var;
                                                j2Var2.getClass();
                                                int i11 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i11 >= arrayList2.size()) {
                                                        j2Var2.b = true;
                                                        j2Var2.c = false;
                                                        break;
                                                    } else {
                                                        i2 i2Var2 = (i2) arrayList2.get(i11);
                                                        j2Var2.a.put(i2Var2.b, i2Var2);
                                                        i11++;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                j2 j2Var3 = j2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        j2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                h2 h2Var = new h2();
                                                h2Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(h2Var.getObjectSize());
                                                h2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                                AndroidUtilities.runOnUIThread(new f2(j2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i102 = 1;
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.g2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i102) {
                                case 0:
                                    j2 j2Var2 = j2Var;
                                    j2Var2.getClass();
                                    int i11 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i11 >= arrayList2.size()) {
                                            j2Var2.b = true;
                                            j2Var2.c = false;
                                            break;
                                        } else {
                                            i2 i2Var2 = (i2) arrayList2.get(i11);
                                            j2Var2.a.put(i2Var2.b, i2Var2);
                                            i11++;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    j2 j2Var3 = j2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                            j2Var3.d = false;
                                            return;
                                        }
                                    }
                                    h2 h2Var = new h2();
                                    h2Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(h2Var.getObjectSize());
                                    h2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    AndroidUtilities.runOnUIThread(new f2(j2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final j2 j2Var2 = this.b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        h2 h2Var = new h2();
                        h2Var.readParams(serializedData, true);
                        arrayList2.addAll(h2Var.a);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.g2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    j2 j2Var22 = j2Var2;
                                    j2Var22.getClass();
                                    int i112 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i112 >= arrayList22.size()) {
                                            j2Var22.b = true;
                                            j2Var22.c = false;
                                            break;
                                        } else {
                                            i2 i2Var2 = (i2) arrayList22.get(i112);
                                            j2Var22.a.put(i2Var2.b, i2Var2);
                                            i112++;
                                        }
                                    }
                                default:
                                    File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    j2 j2Var3 = j2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e92) {
                                            FileLog.e(e92);
                                            j2Var3.d = false;
                                            return;
                                        }
                                    }
                                    h2 h2Var2 = new h2();
                                    h2Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(h2Var2.getObjectSize());
                                    h2Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    AndroidUtilities.runOnUIThread(new f2(j2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    j2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
