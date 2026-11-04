package u9;

import a9.k0;
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
import l9.y;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.mz;
import org.telegram.ui.LaunchActivity;
import org.xmlpull.v1.XmlSerializer;
import wd.v0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ k(int i3, Object obj, Object obj2) {
        this.a = i3;
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
    
        u9.l.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
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
                synchronized (((l) this.c).b) {
                    if (!z10) {
                        l lVar = (l) this.c;
                        if (lVar.c != 4) {
                            lVar.d++;
                            lVar.c = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((l) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((l) this.c).c = 1;
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
        boolean z10;
        switch (this.a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e10) {
                    synchronized (((l) this.c).b) {
                        ((l) this.c).c = 1;
                        throw e10;
                    }
                }
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f;
                p7.d dVar = new p7.d(file);
                File file2 = (File) dVar.d;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream G = dVar.G();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(G);
                        XmlSerializer newSerializer = Xml.newSerializer();
                        newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        newSerializer.startDocument(null, Boolean.TRUE);
                        newSerializer.startTag(null, "share_targets");
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            w4.d.h(newSerializer, (w4.f) obj);
                        }
                        newSerializer.endTag(null, "share_targets");
                        newSerializer.endDocument();
                        bufferedOutputStream.flush();
                        G.flush();
                        try {
                            G.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                            z10 = false;
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            G.close();
                        } catch (IOException e11) {
                            Log.e("AtomicFile", "Failed to close file output stream", e11);
                        }
                        p7.d.D(file2, file);
                        return;
                    } catch (Exception e12) {
                        exc = e12;
                        fileOutputStream = G;
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
                } catch (Exception e14) {
                    exc = e14;
                }
            case 2:
                c0.m mVar = (c0.m) this.c;
                try {
                    ((c0.m) this.b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e15) {
                    mVar.l(e15);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    fVar.putAll(w4.d.c(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e16) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e16);
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
                shortcutInfoCompatSaverImpl3.h((c0.m) this.b);
                return;
            case 5:
                if (((c0.m) this.c).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.b).run();
                    ((c0.m) this.c).k(null);
                    return;
                } catch (Exception e17) {
                    ((c0.m) this.c).l(e17);
                    return;
                }
            case 6:
                ((wd.m) this.c).D((v0) this.b);
                return;
            case 7:
                ((wd.m) this.b).D((xd.c) this.c);
                return;
            case 8:
                z1.a aVar = (z1.a) this.c;
                Object obj2 = this.b;
                if (aVar.c.get()) {
                    c6.d dVar2 = aVar.e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    c6.d dVar3 = aVar.e;
                    if (dVar3.g != aVar) {
                        if (dVar3.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar3.h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.c) {
                        SystemClock.uptimeMillis();
                        dVar3.g = null;
                        y1.a aVar2 = dVar3.a;
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
            case 9:
                DataHolder dataHolder = (DataHolder) this.b;
                int i10 = dataHolder.e;
                try {
                    ((z8.d) this.c).c.getClass();
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
            case 10:
                WearAuthListenerService wearAuthListenerService = ((z8.d) this.c).c;
                k0 k0Var = (k0) this.b;
                String str = k0Var.b;
                String str2 = k0Var.d;
                byte[] bArr = k0Var.c;
                if ("/tg-wear-auth/offer".equals(str)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, (Class<?>) LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e18) {
                        a8.e("wear-auth: failed to pop LaunchActivity", e18);
                    }
                }
                g0.h3(new mz(bArr, str, str2));
                return;
            case 11:
                ((z8.d) this.c).c.getClass();
                return;
            default:
                a9.e eVar = (a9.e) this.b;
                z8.d dVar4 = (z8.d) this.c;
                eVar.b(dVar4.c);
                eVar.b(dVar4.c.n);
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
                int i3 = ((l) this.c).c;
                sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    public k(l lVar) {
        this.a = 0;
        this.c = lVar;
    }
}
