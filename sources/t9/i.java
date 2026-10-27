package t9;

import aa.b0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.m;
import com.google.android.gms.common.data.DataHolder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.y;
import org.telegram.messenger.BuildConfig;
import org.xmlpull.v1.XmlSerializer;
import y9.p;
import z8.c1;
import z8.l0;
import z8.w0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        t9.j.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            try {
                synchronized (((j) this.c).b) {
                    if (!z10) {
                        j jVar = (j) this.c;
                        if (jVar.c != 4) {
                            jVar.d++;
                            jVar.c = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((j) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((j) this.c).c = 1;
                    }
                }
                if (!z11) {
                    return;
                }
            } finally {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        FileOutputStream J;
        boolean z10;
        z8.e eVar;
        switch (this.a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((j) this.c).b) {
                        ((j) this.c).c = 1;
                        throw e;
                    }
                }
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f;
                k6.c cVar = new k6.c(file);
                File file2 = (File) cVar.c;
                FileOutputStream fileOutputStream = null;
                try {
                    J = cVar.J();
                } catch (Exception e10) {
                    exc = e10;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(J);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        u4.d.h(newSerializer, (u4.g) obj);
                    }
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    J.flush();
                    try {
                        J.getFD().sync();
                        z10 = true;
                    } catch (IOException unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        J.close();
                    } catch (IOException e11) {
                        Log.e("AtomicFile", "Failed to close file output stream", e11);
                    }
                    k6.c.G(file2, file);
                    return;
                } catch (Exception e12) {
                    exc = e12;
                    fileOutputStream = J;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused2) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            Log.e("AtomicFile", "Failed to close file output stream", e13);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    throw new RuntimeException("Failed to write to file " + file, exc);
                }
            case 2:
                m mVar = (m) this.c;
                try {
                    ((m) this.b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e14) {
                    mVar.l(e14);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    fVar.putAll(u4.d.c(shortcutInfoCompatSaverImpl2.a, shortcutInfoCompatSaverImpl2.f));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e15) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e15);
                    return;
                }
            case 4:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl3.b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((m) this.b);
                return;
            case 5:
                if (((m) this.c).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.b).run();
                    ((m) this.c).k(null);
                    return;
                } catch (Exception e16) {
                    ((m) this.c).l(e16);
                    return;
                }
            case 6:
                x1.a aVar = (x1.a) this.c;
                Object obj2 = this.b;
                if (aVar.c.get()) {
                    b6.d dVar = aVar.e;
                    if (dVar.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar.h = null;
                        dVar.b();
                    }
                } else {
                    b6.d dVar2 = aVar.e;
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
            case 7:
                DataHolder dataHolder = (DataHolder) this.b;
                y8.e eVar2 = new y8.e(dataHolder);
                try {
                    ((y8.m) this.c).c.onDataChanged(eVar2);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar2.a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 8:
                ((y8.m) this.c).c.onMessageReceived((l0) this.b);
                return;
            case 9:
                ((y8.m) this.c).c.onConnectedNodes((List) this.b);
                return;
            case 10:
                ((y8.m) this.c).c.onCapabilityChanged((z8.c) this.b);
                return;
            case 11:
                ((y8.m) this.c).c.onNotificationReceived((c1) this.b);
                return;
            case 12:
                ((y8.m) this.c).c.onEntityUpdate((w0) this.b);
                return;
            case 13:
                z8.f fVar3 = (z8.f) this.b;
                y8.m mVar2 = (y8.m) this.c;
                fVar3.b(mVar2.c);
                eVar = mVar2.c.zzh;
                fVar3.b(eVar);
                return;
            default:
                p.a((p) this.c, (b0) this.b);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((j) this.c).c;
                sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.BETA_URL : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public i(j jVar) {
        this.a = 0;
        this.c = jVar;
    }

    public i(m mVar, m mVar2) {
        this.a = 2;
        this.b = mVar;
        this.c = mVar2;
    }
}
