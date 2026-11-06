package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ x1(b2 b2Var, int i7) {
        this.a = i7;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final b2 b2Var = this.b;
                if (!b2Var.d) {
                    b2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (a2 a2Var : b2Var.a.values()) {
                        if (!TextUtils.isEmpty(a2Var.b) && currentTimeMillis - a2Var.a <= 604800000) {
                            arrayList.add(0, a2Var);
                            if (arrayList.size() >= 100) {
                                final int i7 = 1;
                                Utilities.e.c(new Runnable() { // from class: org.telegram.ui.web.y1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                b2 b2Var2 = b2Var;
                                                b2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 >= arrayList2.size()) {
                                                        b2Var2.b = true;
                                                        b2Var2.c = false;
                                                        break;
                                                    } else {
                                                        a2 a2Var2 = (a2) arrayList2.get(i10);
                                                        b2Var2.a.put(a2Var2.b, a2Var2);
                                                        i10++;
                                                    }
                                                }
                                            default:
                                                File file = new File(w7.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                b2 b2Var3 = b2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                        b2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                z1 z1Var = new z1();
                                                z1Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(z1Var.getObjectSize());
                                                z1Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                                org.telegram.messenger.g0.h3(new x1(b2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i72 = 1;
                    Utilities.e.c(new Runnable() { // from class: org.telegram.ui.web.y1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i72) {
                                case 0:
                                    b2 b2Var2 = b2Var;
                                    b2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 >= arrayList2.size()) {
                                            b2Var2.b = true;
                                            b2Var2.c = false;
                                            break;
                                        } else {
                                            a2 a2Var2 = (a2) arrayList2.get(i10);
                                            b2Var2.a.put(a2Var2.b, a2Var2);
                                            i10++;
                                        }
                                    }
                                default:
                                    File file = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    b2 b2Var3 = b2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                            b2Var3.d = false;
                                            return;
                                        }
                                    }
                                    z1 z1Var = new z1();
                                    z1Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(z1Var.getObjectSize());
                                    z1Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new x1(b2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final b2 b2Var2 = this.b;
                File file = new File(w7.z(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        z1 z1Var = new z1();
                        z1Var.readParams(serializedData, true);
                        arrayList2.addAll(z1Var.a);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    final int i10 = 0;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.web.y1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    b2 b2Var22 = b2Var2;
                                    b2Var22.getClass();
                                    int i102 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i102 >= arrayList22.size()) {
                                            b2Var22.b = true;
                                            b2Var22.c = false;
                                            break;
                                        } else {
                                            a2 a2Var2 = (a2) arrayList22.get(i102);
                                            b2Var22.a.put(a2Var2.b, a2Var2);
                                            i102++;
                                        }
                                    }
                                default:
                                    File file2 = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    b2 b2Var3 = b2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e102) {
                                            a8.g(e102, true);
                                            b2Var3.d = false;
                                            return;
                                        }
                                    }
                                    z1 z1Var2 = new z1();
                                    z1Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(z1Var2.getObjectSize());
                                    z1Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new x1(b2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    b2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
