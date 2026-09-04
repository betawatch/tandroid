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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    public /* synthetic */ k2(o2 o2Var, int i10) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final o2 o2Var = this.b;
                if (!o2Var.d) {
                    o2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (n2 n2Var : o2Var.a.values()) {
                        if (!TextUtils.isEmpty(n2Var.b) && currentTimeMillis - n2Var.a <= 604800000) {
                            arrayList.add(0, n2Var);
                            if (arrayList.size() >= 100) {
                                final int i10 = 1;
                                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.l2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                o2 o2Var2 = o2Var;
                                                o2Var2.getClass();
                                                int i11 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i11 >= arrayList2.size()) {
                                                        o2Var2.b = true;
                                                        o2Var2.c = false;
                                                        break;
                                                    } else {
                                                        n2 n2Var2 = (n2) arrayList2.get(i11);
                                                        o2Var2.a.put(n2Var2.b, n2Var2);
                                                        i11++;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                o2 o2Var3 = o2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
                                                        o2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                m2 m2Var = new m2();
                                                m2Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(m2Var.getObjectSize());
                                                m2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                                AndroidUtilities.runOnUIThread(new k2(o2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i102 = 1;
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.l2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i102) {
                                case 0:
                                    o2 o2Var2 = o2Var;
                                    o2Var2.getClass();
                                    int i11 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i11 >= arrayList2.size()) {
                                            o2Var2.b = true;
                                            o2Var2.c = false;
                                            break;
                                        } else {
                                            n2 n2Var2 = (n2) arrayList2.get(i11);
                                            o2Var2.a.put(n2Var2.b, n2Var2);
                                            i11++;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    o2 o2Var3 = o2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                            o2Var3.d = false;
                                            return;
                                        }
                                    }
                                    m2 m2Var = new m2();
                                    m2Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(m2Var.getObjectSize());
                                    m2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    AndroidUtilities.runOnUIThread(new k2(o2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final o2 o2Var2 = this.b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        m2 m2Var = new m2();
                        m2Var.readParams(serializedData, true);
                        arrayList2.addAll(m2Var.a);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.l2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    o2 o2Var22 = o2Var2;
                                    o2Var22.getClass();
                                    int i112 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i112 >= arrayList22.size()) {
                                            o2Var22.b = true;
                                            o2Var22.c = false;
                                            break;
                                        } else {
                                            n2 n2Var2 = (n2) arrayList22.get(i112);
                                            o2Var22.a.put(n2Var2.b, n2Var2);
                                            i112++;
                                        }
                                    }
                                default:
                                    File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    o2 o2Var3 = o2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e72) {
                                            FileLog.e(e72);
                                            o2Var3.d = false;
                                            return;
                                        }
                                    }
                                    m2 m2Var2 = new m2();
                                    m2Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(m2Var2.getObjectSize());
                                    m2Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    AndroidUtilities.runOnUIThread(new k2(o2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    o2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
