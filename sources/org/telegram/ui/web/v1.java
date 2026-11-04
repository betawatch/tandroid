package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ v1(z1 z1Var, int i3) {
        this.a = i3;
        this.b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final z1 z1Var = this.b;
                if (!z1Var.d) {
                    z1Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (y1 y1Var : z1Var.a.values()) {
                        if (!TextUtils.isEmpty(y1Var.b) && currentTimeMillis - y1Var.a <= 604800000) {
                            arrayList.add(0, y1Var);
                            if (arrayList.size() >= 100) {
                                final int i3 = 1;
                                Utilities.e.c(new Runnable() { // from class: org.telegram.ui.web.w1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i3) {
                                            case 0:
                                                z1 z1Var2 = z1Var;
                                                z1Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 >= arrayList2.size()) {
                                                        z1Var2.b = true;
                                                        z1Var2.c = false;
                                                        break;
                                                    } else {
                                                        y1 y1Var2 = (y1) arrayList2.get(i10);
                                                        z1Var2.a.put(y1Var2.b, y1Var2);
                                                        i10++;
                                                    }
                                                }
                                            default:
                                                File file = new File(w7.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                z1 z1Var3 = z1Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                        z1Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                x1 x1Var = new x1();
                                                x1Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(x1Var.getObjectSize());
                                                x1Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                                org.telegram.messenger.g0.h3(new v1(z1Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i32 = 1;
                    Utilities.e.c(new Runnable() { // from class: org.telegram.ui.web.w1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i32) {
                                case 0:
                                    z1 z1Var2 = z1Var;
                                    z1Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 >= arrayList2.size()) {
                                            z1Var2.b = true;
                                            z1Var2.c = false;
                                            break;
                                        } else {
                                            y1 y1Var2 = (y1) arrayList2.get(i10);
                                            z1Var2.a.put(y1Var2.b, y1Var2);
                                            i10++;
                                        }
                                    }
                                default:
                                    File file = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    z1 z1Var3 = z1Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                            z1Var3.d = false;
                                            return;
                                        }
                                    }
                                    x1 x1Var = new x1();
                                    x1Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(x1Var.getObjectSize());
                                    x1Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new v1(z1Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final z1 z1Var2 = this.b;
                File file = new File(w7.z(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        x1 x1Var = new x1();
                        x1Var.readParams(serializedData, true);
                        arrayList2.addAll(x1Var.a);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    final int i10 = 0;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.web.w1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    z1 z1Var22 = z1Var2;
                                    z1Var22.getClass();
                                    int i102 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i102 >= arrayList22.size()) {
                                            z1Var22.b = true;
                                            z1Var22.c = false;
                                            break;
                                        } else {
                                            y1 y1Var2 = (y1) arrayList22.get(i102);
                                            z1Var22.a.put(y1Var2.b, y1Var2);
                                            i102++;
                                        }
                                    }
                                default:
                                    File file2 = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    z1 z1Var3 = z1Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e102) {
                                            a8.g(e102, true);
                                            z1Var3.d = false;
                                            return;
                                        }
                                    }
                                    x1 x1Var2 = new x1();
                                    x1Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(x1Var2.getObjectSize());
                                    x1Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new v1(z1Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    z1Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
