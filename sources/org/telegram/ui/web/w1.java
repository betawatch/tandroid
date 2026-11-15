package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;

    public /* synthetic */ w1(a2 a2Var, int i7) {
        this.a = i7;
        this.b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final a2 a2Var = this.b;
                if (!a2Var.d) {
                    a2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (z1 z1Var : a2Var.a.values()) {
                        if (!TextUtils.isEmpty(z1Var.b) && currentTimeMillis - z1Var.a <= 604800000) {
                            arrayList.add(0, z1Var);
                            if (arrayList.size() >= 100) {
                                final int i7 = 1;
                                Utilities.e.c(new Runnable() { // from class: org.telegram.ui.web.x1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                a2 a2Var2 = a2Var;
                                                a2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 >= arrayList2.size()) {
                                                        a2Var2.b = true;
                                                        a2Var2.c = false;
                                                        break;
                                                    } else {
                                                        z1 z1Var2 = (z1) arrayList2.get(i10);
                                                        a2Var2.a.put(z1Var2.b, z1Var2);
                                                        i10++;
                                                    }
                                                }
                                            default:
                                                File file = new File(w7.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                a2 a2Var3 = a2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                        a2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                y1 y1Var = new y1();
                                                y1Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(y1Var.getObjectSize());
                                                y1Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                                org.telegram.messenger.g0.h3(new w1(a2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i72 = 1;
                    Utilities.e.c(new Runnable() { // from class: org.telegram.ui.web.x1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i72) {
                                case 0:
                                    a2 a2Var2 = a2Var;
                                    a2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 >= arrayList2.size()) {
                                            a2Var2.b = true;
                                            a2Var2.c = false;
                                            break;
                                        } else {
                                            z1 z1Var2 = (z1) arrayList2.get(i10);
                                            a2Var2.a.put(z1Var2.b, z1Var2);
                                            i10++;
                                        }
                                    }
                                default:
                                    File file = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    a2 a2Var3 = a2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                            a2Var3.d = false;
                                            return;
                                        }
                                    }
                                    y1 y1Var = new y1();
                                    y1Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(y1Var.getObjectSize());
                                    y1Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new w1(a2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final a2 a2Var2 = this.b;
                File file = new File(w7.z(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        y1 y1Var = new y1();
                        y1Var.readParams(serializedData, true);
                        arrayList2.addAll(y1Var.a);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    final int i10 = 0;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.web.x1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    a2 a2Var22 = a2Var2;
                                    a2Var22.getClass();
                                    int i102 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i102 >= arrayList22.size()) {
                                            a2Var22.b = true;
                                            a2Var22.c = false;
                                            break;
                                        } else {
                                            z1 z1Var2 = (z1) arrayList22.get(i102);
                                            a2Var22.a.put(z1Var2.b, z1Var2);
                                            i102++;
                                        }
                                    }
                                default:
                                    File file2 = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    a2 a2Var3 = a2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e102) {
                                            a8.g(e102, true);
                                            a2Var3.d = false;
                                            return;
                                        }
                                    }
                                    y1 y1Var2 = new y1();
                                    y1Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(y1Var2.getObjectSize());
                                    y1Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new w1(a2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    a2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
