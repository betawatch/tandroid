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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ e2(i2 i2Var, int i9) {
        this.a = i9;
        this.b = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final i2 i2Var = this.b;
                if (!i2Var.d) {
                    i2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (h2 h2Var : i2Var.a.values()) {
                        if (!TextUtils.isEmpty(h2Var.b) && currentTimeMillis - h2Var.a <= 604800000) {
                            arrayList.add(0, h2Var);
                            if (arrayList.size() >= 100) {
                                final int i9 = 1;
                                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.f2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i9) {
                                            case 0:
                                                i2 i2Var2 = i2Var;
                                                i2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 >= arrayList2.size()) {
                                                        i2Var2.b = true;
                                                        i2Var2.c = false;
                                                        break;
                                                    } else {
                                                        h2 h2Var2 = (h2) arrayList2.get(i10);
                                                        i2Var2.a.put(h2Var2.b, h2Var2);
                                                        i10++;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                i2 i2Var3 = i2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        i2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                g2 g2Var = new g2();
                                                g2Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(g2Var.getObjectSize());
                                                g2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                }
                                                AndroidUtilities.runOnUIThread(new e2(i2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i92 = 1;
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.f2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i92) {
                                case 0:
                                    i2 i2Var2 = i2Var;
                                    i2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 >= arrayList2.size()) {
                                            i2Var2.b = true;
                                            i2Var2.c = false;
                                            break;
                                        } else {
                                            h2 h2Var2 = (h2) arrayList2.get(i10);
                                            i2Var2.a.put(h2Var2.b, h2Var2);
                                            i10++;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    i2 i2Var3 = i2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                            i2Var3.d = false;
                                            return;
                                        }
                                    }
                                    g2 g2Var = new g2();
                                    g2Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(g2Var.getObjectSize());
                                    g2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    AndroidUtilities.runOnUIThread(new e2(i2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final i2 i2Var2 = this.b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        g2 g2Var = new g2();
                        g2Var.readParams(serializedData, true);
                        arrayList2.addAll(g2Var.a);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    final int i10 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.f2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    i2 i2Var22 = i2Var2;
                                    i2Var22.getClass();
                                    int i102 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i102 >= arrayList22.size()) {
                                            i2Var22.b = true;
                                            i2Var22.c = false;
                                            break;
                                        } else {
                                            h2 h2Var2 = (h2) arrayList22.get(i102);
                                            i2Var22.a.put(h2Var2.b, h2Var2);
                                            i102++;
                                        }
                                    }
                                default:
                                    File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    i2 i2Var3 = i2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e102) {
                                            FileLog.e(e102);
                                            i2Var3.d = false;
                                            return;
                                        }
                                    }
                                    g2 g2Var2 = new g2();
                                    g2Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(g2Var2.getObjectSize());
                                    g2Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    AndroidUtilities.runOnUIThread(new e2(i2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    i2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
