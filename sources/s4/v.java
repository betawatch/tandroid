package s4;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.common.data.DataHolder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8.d dVar;
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                d1 d1Var = uVar.e;
                z zVar = (z) this.c;
                RecyclerView recyclerView = zVar.H;
                if (recyclerView == null || !recyclerView.G || uVar.v || d1Var.b() == -1) {
                    return;
                }
                n0 itemAnimator = zVar.H.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList = zVar.F;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((u) arrayList.get(i10)).w) {
                        }
                    }
                    zVar.x.q(d1Var);
                    return;
                }
                zVar.H.post(this);
                return;
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f;
                la.h hVar = new la.h(file);
                File file2 = (File) hVar.c;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream Y = hVar.Y();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Y);
                        XmlSerializer newSerializer = Xml.newSerializer();
                        newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        newSerializer.startDocument(null, Boolean.TRUE);
                        newSerializer.startTag(null, "share_targets");
                        int size2 = arrayList2.size();
                        boolean z10 = false;
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            u4.d.h(newSerializer, (u4.g) obj);
                        }
                        newSerializer.endTag(null, "share_targets");
                        newSerializer.endDocument();
                        bufferedOutputStream.flush();
                        Y.flush();
                        try {
                            Y.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            Y.close();
                        } catch (IOException e7) {
                            Log.e("AtomicFile", "Failed to close file output stream", e7);
                        }
                        la.h.V(file2, file);
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = Y;
                        Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (IOException unused2) {
                                Log.e("AtomicFile", "Failed to sync file output stream");
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e11) {
                                Log.e("AtomicFile", "Failed to close file output stream", e11);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                        }
                        throw new RuntimeException("Failed to write to file " + file, e);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 2:
                c0.l lVar = (c0.l) this.c;
                try {
                    ((c0.l) this.b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e13) {
                    lVar.l(e13);
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
                } catch (Exception e14) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e14);
                    return;
                }
            case 4:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl3.b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((i9.w) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.b);
                return;
            case 5:
                if (((c0.l) this.b).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.c).run();
                    ((c0.l) this.b).k(null);
                    return;
                } catch (Exception e15) {
                    ((c0.l) this.b).l(e15);
                    return;
                }
            case 6:
                w9.o.a((w9.o) this.c, (da.c) this.b);
                return;
            case 7:
                x1.a aVar = (x1.a) this.c;
                Object obj2 = this.b;
                if (aVar.c.get()) {
                    a6.d dVar2 = aVar.e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    a6.d dVar3 = aVar.e;
                    if (dVar3.g != aVar) {
                        if (dVar3.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar3.h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.c) {
                        SystemClock.uptimeMillis();
                        dVar3.g = null;
                        w1.a aVar2 = dVar3.a;
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
                x8.e eVar = new x8.e(dataHolder);
                try {
                    ((x8.m) this.c).c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 9:
                ((x8.m) this.c).c.onMessageReceived((y8.k0) this.b);
                return;
            case 10:
                ((x8.m) this.c).c.onConnectedNodes((List) this.b);
                return;
            case 11:
                ((x8.m) this.c).c.onCapabilityChanged((y8.b) this.b);
                return;
            case 12:
                ((x8.m) this.c).c.onNotificationReceived((y8.b1) this.b);
                return;
            case 13:
                ((x8.m) this.c).c.onEntityUpdate((y8.v0) this.b);
                return;
            default:
                y8.e eVar2 = (y8.e) this.b;
                x8.m mVar = (x8.m) this.c;
                eVar2.b(mVar.c);
                dVar = mVar.c.zzh;
                eVar2.b(dVar);
                return;
        }
    }

    public /* synthetic */ v(c0.l lVar, Object obj, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = obj;
    }

    public v(z zVar, u uVar, int i10) {
        this.a = 0;
        this.c = zVar;
        this.b = uVar;
    }
}
