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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ l2(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final p2 p2Var = this.b;
                if (!p2Var.d) {
                    p2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (o2 o2Var : p2Var.a.values()) {
                        if (!TextUtils.isEmpty(o2Var.b) && currentTimeMillis - o2Var.a <= 604800000) {
                            arrayList.add(0, o2Var);
                            if (arrayList.size() >= 100) {
                                final int i10 = 1;
                                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.m2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                p2 p2Var2 = p2Var;
                                                p2Var2.getClass();
                                                int i11 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i11 >= arrayList2.size()) {
                                                        p2Var2.b = true;
                                                        p2Var2.c = false;
                                                        break;
                                                    } else {
                                                        o2 o2Var2 = (o2) arrayList2.get(i11);
                                                        p2Var2.a.put(o2Var2.b, o2Var2);
                                                        i11++;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                p2 p2Var3 = p2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        p2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                n2 n2Var = new n2();
                                                n2Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(n2Var.getObjectSize());
                                                n2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
                                                }
                                                AndroidUtilities.runOnUIThread(new l2(p2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i102 = 1;
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.m2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i102) {
                                case 0:
                                    p2 p2Var2 = p2Var;
                                    p2Var2.getClass();
                                    int i11 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i11 >= arrayList2.size()) {
                                            p2Var2.b = true;
                                            p2Var2.c = false;
                                            break;
                                        } else {
                                            o2 o2Var2 = (o2) arrayList2.get(i11);
                                            p2Var2.a.put(o2Var2.b, o2Var2);
                                            i11++;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    p2 p2Var3 = p2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            p2Var3.d = false;
                                            return;
                                        }
                                    }
                                    n2 n2Var = new n2();
                                    n2Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(n2Var.getObjectSize());
                                    n2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    AndroidUtilities.runOnUIThread(new l2(p2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final p2 p2Var2 = this.b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        n2 n2Var = new n2();
                        n2Var.readParams(serializedData, true);
                        arrayList2.addAll(n2Var.a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.m2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    p2 p2Var22 = p2Var2;
                                    p2Var22.getClass();
                                    int i112 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i112 >= arrayList22.size()) {
                                            p2Var22.b = true;
                                            p2Var22.c = false;
                                            break;
                                        } else {
                                            o2 o2Var2 = (o2) arrayList22.get(i112);
                                            p2Var22.a.put(o2Var2.b, o2Var2);
                                            i112++;
                                        }
                                    }
                                default:
                                    File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    p2 p2Var3 = p2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                            p2Var3.d = false;
                                            return;
                                        }
                                    }
                                    n2 n2Var2 = new n2();
                                    n2Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(n2Var2.getObjectSize());
                                    n2Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e72) {
                                        FileLog.e(e72);
                                    }
                                    AndroidUtilities.runOnUIThread(new l2(p2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    p2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
