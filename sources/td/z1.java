package td;

import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.common.data.DataHolder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.e00;
import org.telegram.messenger.f8;
import org.telegram.ui.LaunchActivity;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z1 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ z1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((m) this.c).D((y0) this.b);
                return;
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f;
                li.k kVar = new li.k(file);
                File file2 = (File) kVar.c;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream K = kVar.K();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(K);
                        XmlSerializer newSerializer = Xml.newSerializer();
                        newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        newSerializer.startDocument(null, Boolean.TRUE);
                        newSerializer.startTag(null, "share_targets");
                        int size = arrayList.size();
                        boolean z10 = false;
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            u4.d.h(newSerializer, (u4.f) obj);
                        }
                        newSerializer.endTag(null, "share_targets");
                        newSerializer.endDocument();
                        bufferedOutputStream.flush();
                        K.flush();
                        try {
                            K.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            K.close();
                        } catch (IOException e) {
                            Log.e("AtomicFile", "Failed to close file output stream", e);
                        }
                        li.k.J(file2, file);
                        return;
                    } catch (Exception e7) {
                        e = e7;
                        fileOutputStream = K;
                        Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (IOException unused2) {
                                Log.e("AtomicFile", "Failed to sync file output stream");
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e10) {
                                Log.e("AtomicFile", "Failed to close file output stream", e10);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                        }
                        throw new RuntimeException("Failed to write to file " + file, e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            case 2:
                c0.m mVar = (c0.m) this.c;
                try {
                    ((c0.m) this.b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e12) {
                    mVar.l(e12);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    fVar.putAll(u4.d.c(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e13) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e13);
                    return;
                }
            case 4:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl3.b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((j9.y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.m) this.b);
                return;
            case 5:
                if (((c0.m) this.b).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.c).run();
                    ((c0.m) this.b).k(null);
                    return;
                } catch (Exception e14) {
                    ((c0.m) this.b).l(e14);
                    return;
                }
            case 6:
                ((m) this.c).D((ud.d) this.b);
                return;
            case 7:
                x1.a aVar = (x1.a) this.c;
                Object obj2 = this.b;
                if (aVar.c.get()) {
                    a6.d dVar = aVar.e;
                    if (dVar.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar.h = null;
                        dVar.b();
                    }
                } else {
                    a6.d dVar2 = aVar.e;
                    if (dVar2.g != aVar) {
                        if (dVar2.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar2.h = null;
                            dVar2.b();
                        }
                    } else if (!dVar2.c) {
                        SystemClock.uptimeMillis();
                        dVar2.g = null;
                        w1.a aVar2 = dVar2.a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.b = 3;
                return;
            case 8:
                DataHolder dataHolder = (DataHolder) this.b;
                int i11 = dataHolder.e;
                try {
                    ((x8.d) this.c).c.getClass();
                    if (dataHolder != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (dataHolder != null) {
                        dataHolder.close();
                    }
                }
            case 9:
                WearAuthListenerService wearAuthListenerService = ((x8.d) this.c).c;
                y8.i0 i0Var = (y8.i0) this.b;
                String str = i0Var.b;
                String str2 = i0Var.d;
                byte[] bArr = i0Var.c;
                if ("/tg-wear-auth/offer".equals(str)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, (Class<?>) LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e15) {
                        f8.e("wear-auth: failed to pop LaunchActivity", e15);
                    }
                }
                org.telegram.messenger.i0.g3(new e00(bArr, str, str2));
                return;
            case 10:
                ((x8.d) this.c).c.getClass();
                return;
            case 11:
                y8.e eVar = (y8.e) this.b;
                x8.d dVar3 = (x8.d) this.c;
                eVar.b(dVar3.c);
                eVar.b(dVar3.c.n);
                return;
            case 12:
                x9.p.a((x9.p) this.c, (ea.d) this.b);
                return;
            default:
                yd.i iVar = (yd.i) this.c;
                a0 a0Var = iVar.c;
                int i12 = 0;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th2) {
                        e0.m(cd.i.a, th2);
                    }
                    Runnable f7 = iVar.f();
                    if (f7 == null) {
                        return;
                    }
                    this.b = f7;
                    i12++;
                    if (i12 >= 16 && a0Var.d()) {
                        a0Var.c(iVar, this);
                        return;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z1(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }
}
