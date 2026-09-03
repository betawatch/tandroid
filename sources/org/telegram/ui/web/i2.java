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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ i2(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final m2 m2Var = this.b;
                if (!m2Var.d) {
                    m2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (l2 l2Var : m2Var.a.values()) {
                        if (!TextUtils.isEmpty(l2Var.b) && currentTimeMillis - l2Var.a <= 604800000) {
                            arrayList.add(0, l2Var);
                            if (arrayList.size() >= 100) {
                                final int i10 = 1;
                                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.j2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                m2 m2Var2 = m2Var;
                                                m2Var2.getClass();
                                                int i11 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i11 >= arrayList2.size()) {
                                                        m2Var2.b = true;
                                                        m2Var2.c = false;
                                                        break;
                                                    } else {
                                                        l2 l2Var2 = (l2) arrayList2.get(i11);
                                                        m2Var2.a.put(l2Var2.b, l2Var2);
                                                        i11++;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                m2 m2Var3 = m2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        m2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                k2 k2Var = new k2();
                                                k2Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(k2Var.getObjectSize());
                                                k2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e6) {
                                                    FileLog.e(e6);
                                                }
                                                AndroidUtilities.runOnUIThread(new i2(m2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i102 = 1;
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.j2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i102) {
                                case 0:
                                    m2 m2Var2 = m2Var;
                                    m2Var2.getClass();
                                    int i11 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i11 >= arrayList2.size()) {
                                            m2Var2.b = true;
                                            m2Var2.c = false;
                                            break;
                                        } else {
                                            l2 l2Var2 = (l2) arrayList2.get(i11);
                                            m2Var2.a.put(l2Var2.b, l2Var2);
                                            i11++;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    m2 m2Var3 = m2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            m2Var3.d = false;
                                            return;
                                        }
                                    }
                                    k2 k2Var = new k2();
                                    k2Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(k2Var.getObjectSize());
                                    k2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    AndroidUtilities.runOnUIThread(new i2(m2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final m2 m2Var2 = this.b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        k2 k2Var = new k2();
                        k2Var.readParams(serializedData, true);
                        arrayList2.addAll(k2Var.a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.j2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    m2 m2Var22 = m2Var2;
                                    m2Var22.getClass();
                                    int i112 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i112 >= arrayList22.size()) {
                                            m2Var22.b = true;
                                            m2Var22.c = false;
                                            break;
                                        } else {
                                            l2 l2Var2 = (l2) arrayList22.get(i112);
                                            m2Var22.a.put(l2Var2.b, l2Var2);
                                            i112++;
                                        }
                                    }
                                default:
                                    File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    m2 m2Var3 = m2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                            m2Var3.d = false;
                                            return;
                                        }
                                    }
                                    k2 k2Var2 = new k2();
                                    k2Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(k2Var2.getObjectSize());
                                    k2Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e62) {
                                        FileLog.e(e62);
                                    }
                                    AndroidUtilities.runOnUIThread(new i2(m2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    m2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
