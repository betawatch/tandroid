package pb;

import android.util.Log;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import m9.y;
import org.telegram.ui.nd0;
import org.xmlpull.v1.XmlSerializer;
import v4.f1;
import v4.n0;
import v4.v;
import v4.z;
import zd.v0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ l(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
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
    
        v9.i.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
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
                synchronized (((v9.i) this.c).b) {
                    if (!z10) {
                        v9.i iVar = (v9.i) this.c;
                        if (iVar.c != 4) {
                            iVar.d++;
                            iVar.c = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((v9.i) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((v9.i) this.c).c = 1;
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
        switch (this.a) {
            case 0:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        m mVar = (m) referenceQueue.remove();
                        if (mVar.a.remove(mVar)) {
                            mVar.clear();
                            mVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 1:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (lb.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new lb.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 2:
                i iVar = (i) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = iVar.b.decrementAndGet();
                q6.m.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.c.set(false);
                }
                w7.n.a.clear();
                w7.r.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 3:
                ab.q qVar = (ab.q) this.b;
                q6.m.k(((Thread) ((AtomicReference) qVar.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) qVar.d).set(null);
                    qVar.G();
                    return;
                } finally {
                }
            case 4:
                pi.k kVar = (pi.k) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    kVar.B((v4.i) obj);
                }
                arrayList.clear();
                kVar.v.remove(arrayList);
                return;
            case 5:
                v vVar = (v) this.b;
                f1 f1Var = vVar.e;
                z zVar = (z) this.c;
                RecyclerView recyclerView = zVar.I;
                if (recyclerView == null || !recyclerView.H || vVar.w || f1Var.b() == -1) {
                    return;
                }
                n0 itemAnimator = zVar.I.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList2 = zVar.G;
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (((v) arrayList2.get(i10)).x) {
                        }
                    }
                    zVar.y.q(f1Var);
                    return;
                }
                zVar.I.post(this);
                return;
            case 6:
                try {
                    a();
                    return;
                } catch (Error e12) {
                    synchronized (((v9.i) this.c).b) {
                        ((v9.i) this.c).c = 1;
                        throw e12;
                    }
                }
            case 7:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList3);
                File file = shortcutInfoCompatSaverImpl.f;
                nd0 nd0Var = new nd0(file);
                File file2 = (File) nd0Var.c;
                FileOutputStream fileOutputStream = null;
                try {
                    J = nd0Var.J();
                } catch (Exception e13) {
                    exc = e13;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(J);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        x4.d.h(newSerializer, (x4.f) obj2);
                    }
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    J.flush();
                    try {
                        J.getFD().sync();
                        z10 = true;
                    } catch (IOException unused2) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        J.close();
                    } catch (IOException e14) {
                        Log.e("AtomicFile", "Failed to close file output stream", e14);
                    }
                    nd0.G(file2, file);
                    return;
                } catch (Exception e15) {
                    exc = e15;
                    fileOutputStream = J;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused3) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e16) {
                            Log.e("AtomicFile", "Failed to close file output stream", e16);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    throw new RuntimeException("Failed to write to file " + file, exc);
                }
            case 8:
                c0.m mVar2 = (c0.m) this.c;
                try {
                    ((c0.m) this.b).get();
                    mVar2.k(null);
                    return;
                } catch (Exception e17) {
                    mVar2.l(e17);
                    return;
                }
            case 9:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    fVar.putAll(x4.d.c(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e18) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e18);
                    return;
                }
            case 10:
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
            case 11:
                if (((c0.m) this.b).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.c).run();
                    ((c0.m) this.b).k(null);
                    return;
                } catch (Exception e19) {
                    ((c0.m) this.b).l(e19);
                    return;
                }
            default:
                ((zd.m) this.c).D((v0) this.b);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((v9.i) this.c).c;
                sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public l(v9.i iVar) {
        this.a = 6;
        this.c = iVar;
    }

    public l(z zVar, v vVar, int i7) {
        this.a = 5;
        this.c = zVar;
        this.b = vVar;
    }
}
