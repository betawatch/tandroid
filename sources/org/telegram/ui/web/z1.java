package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ z1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final d2 d2Var = this.b;
                if (!d2Var.d) {
                    d2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (c2 c2Var : d2Var.a.values()) {
                        if (!TextUtils.isEmpty(c2Var.b) && currentTimeMillis - c2Var.a <= 604800000) {
                            arrayList.add(0, c2Var);
                            if (arrayList.size() >= 100) {
                                final int i10 = 1;
                                Utilities.e.c(new Runnable() { // from class: org.telegram.ui.web.a2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                d2 d2Var2 = d2Var;
                                                d2Var2.getClass();
                                                int i11 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i11 >= arrayList2.size()) {
                                                        d2Var2.b = true;
                                                        d2Var2.c = false;
                                                        break;
                                                    } else {
                                                        c2 c2Var2 = (c2) arrayList2.get(i11);
                                                        d2Var2.a.put(c2Var2.b, c2Var2);
                                                        i11++;
                                                    }
                                                }
                                            default:
                                                File file = new File(b8.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                d2 d2Var3 = d2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        f8.g(e, true);
                                                        d2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                b2 b2Var = new b2();
                                                b2Var.a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(b2Var.getObjectSize());
                                                b2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e7) {
                                                    f8.g(e7, true);
                                                }
                                                org.telegram.messenger.i0.g3(new z1(d2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i102 = 1;
                    Utilities.e.c(new Runnable() { // from class: org.telegram.ui.web.a2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i102) {
                                case 0:
                                    d2 d2Var2 = d2Var;
                                    d2Var2.getClass();
                                    int i11 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i11 >= arrayList2.size()) {
                                            d2Var2.b = true;
                                            d2Var2.c = false;
                                            break;
                                        } else {
                                            c2 c2Var2 = (c2) arrayList2.get(i11);
                                            d2Var2.a.put(c2Var2.b, c2Var2);
                                            i11++;
                                        }
                                    }
                                default:
                                    File file = new File(b8.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    d2 d2Var3 = d2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            f8.g(e, true);
                                            d2Var3.d = false;
                                            return;
                                        }
                                    }
                                    b2 b2Var = new b2();
                                    b2Var.a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(b2Var.getObjectSize());
                                    b2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e7) {
                                        f8.g(e7, true);
                                    }
                                    org.telegram.messenger.i0.g3(new z1(d2Var3, 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final d2 d2Var2 = this.b;
                File file = new File(b8.z(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        b2 b2Var = new b2();
                        b2Var.readParams(serializedData, true);
                        arrayList2.addAll(b2Var.a);
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    final int i11 = 0;
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.web.a2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    d2 d2Var22 = d2Var2;
                                    d2Var22.getClass();
                                    int i112 = 0;
                                    while (true) {
                                        ArrayList arrayList22 = arrayList2;
                                        if (i112 >= arrayList22.size()) {
                                            d2Var22.b = true;
                                            d2Var22.c = false;
                                            break;
                                        } else {
                                            c2 c2Var2 = (c2) arrayList22.get(i112);
                                            d2Var22.a.put(c2Var2.b, c2Var2);
                                            i112++;
                                        }
                                    }
                                default:
                                    File file2 = new File(b8.z(4), "webmetacache.dat");
                                    boolean exists = file2.exists();
                                    d2 d2Var3 = d2Var2;
                                    if (!exists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e7) {
                                            f8.g(e7, true);
                                            d2Var3.d = false;
                                            return;
                                        }
                                    }
                                    b2 b2Var2 = new b2();
                                    b2Var2.a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(b2Var2.getObjectSize());
                                    b2Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e72) {
                                        f8.g(e72, true);
                                    }
                                    org.telegram.messenger.i0.g3(new z1(d2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    d2Var2.b = true;
                    break;
                }
            default:
                this.b.d = false;
                break;
        }
    }
}
