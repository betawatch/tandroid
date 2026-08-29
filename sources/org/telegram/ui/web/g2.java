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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ g2(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final k2 k2Var = this.b;
                if (!k2Var.d) {
                    k2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (j2 j2Var : k2Var.a.values()) {
                        if (!TextUtils.isEmpty(j2Var.b) && currentTimeMillis - j2Var.a <= 604800000) {
                            arrayList.add(0, j2Var);
                            if (arrayList.size() >= 100) {
                                final int i10 = 1;
                                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.h2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                k2 k2Var2 = k2Var;
                                                k2Var2.getClass();
                                                int i11 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i11 >= arrayList2.size()) {
                                                        k2Var2.b = true;
                                                        k2Var2.c = false;
                                                        break;
                                                    } else {
                                                        j2 j2Var2 = (j2) arrayList2.get(i11);
                                                        k2Var2.a.put(j2Var2.b, j2Var2);
                                                        i11++;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                k2 k2Var3 = k2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        k2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                i2 i2Var = new i2();
                                                i2Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(i2Var.getObjectSize());
                                                i2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                }
                                                AndroidUtilities.runOnUIThread(new g2(k2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i102 = 1;
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.h2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i102) {
                                case 0:
                                    k2 k2Var2 = k2Var;
                                    k2Var2.getClass();
                                    int i11 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i11 >= arrayList2.size()) {
                                            k2Var2.b = true;
                                            k2Var2.c = false;
                                            break;
                                        } else {
                                            j2 j2Var2 = (j2) arrayList2.get(i11);
                                            k2Var2.a.put(j2Var2.b, j2Var2);
                                            i11++;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    k2 k2Var3 = k2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                            k2Var3.d = false;
                                            return;
                                        }
                                    }
                                    i2 i2Var = new i2();
                                    i2Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(i2Var.getObjectSize());
                                    i2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    AndroidUtilities.runOnUIThread(new g2(k2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final k2 k2Var2 = this.b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        i2 i2Var = new i2();
                        i2Var.readParams(serializedData, true);
                        arrayList2.addAll(i2Var.a);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.h2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    k2 k2Var22 = k2Var2;
                                    k2Var22.getClass();
                                    int i112 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i112 >= arrayList22.size()) {
                                            k2Var22.b = true;
                                            k2Var22.c = false;
                                            break;
                                        } else {
                                            j2 j2Var2 = (j2) arrayList22.get(i112);
                                            k2Var22.a.put(j2Var2.b, j2Var2);
                                            i112++;
                                        }
                                    }
                                default:
                                    File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    k2 k2Var3 = k2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e102) {
                                            FileLog.e(e102);
                                            k2Var3.d = false;
                                            return;
                                        }
                                    }
                                    i2 i2Var2 = new i2();
                                    i2Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(i2Var2.getObjectSize());
                                    i2Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    AndroidUtilities.runOnUIThread(new g2(k2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    k2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
